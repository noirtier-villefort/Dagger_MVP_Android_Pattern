package com.example.dagger_mvp_pattern.di;

import com.example.dagger_mvp_pattern.MainActivity;

import dagger.Component;

@Component(modules = {MainModule.class})
public interface AppComponent {
    // This tells Dagger that LoginActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is injecting.
    void inject(MainActivity mainActivity);
}
