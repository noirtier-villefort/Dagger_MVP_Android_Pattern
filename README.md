# Welcome to the Dagger_MVP_Android_Pattern wiki!
## _Project that use Dagger DI and MVP pattern for Android._
![attractive picture :Р](https://c.wallhere.com/photos/66/18/artwork_digital_art_cyberpunk_ass-1390201.jpg!d)

## Explanation
### package mvp:
* **_BaseContract_** interface - basic interface for other Contracts. Here you write your basic methods for Views and Presenters.
*  **_BasePresenter_** class - need to be parent for other Presenters. Has basic logic, that you dont need to write in every Presenter, such as attachView(), init() or destroy().
### package di:
* **_AppComponent_** interface - used to tell Dagger about an object (Activity) that requires a dependency(Presenter in our case) to be injected. For that, you expose a function(inject()) that takes as a parameter the object that requests injection(MainActivity in our case).
* **_Application_** class - here we create and store instance of interface, that generates the graph and annotated with @Component, in variable for call inject() in activities.
* **_MainModule_** class - here we define dependencies that would be Injected.
###  [Better about Dagger and Dependency Injection(click me)](https://developer.android.com/training/dependency-injection/dagger-android)
