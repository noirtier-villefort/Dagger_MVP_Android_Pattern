package com.example.dagger_mvp_pattern.di;

public class Application extends android.app.Application {
    public AppComponent appComponent = DaggerAppComponent.create();
}
