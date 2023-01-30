package com.example.dagger_mvp_pattern.di;

import com.example.dagger_mvp_pattern.MainModel;
import com.example.dagger_mvp_pattern.MainPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    MainModel provideMainModel(){
        return new MainModel();
    }

    @Provides
    MainPresenter provideMainPresenter(){
        return new MainPresenter(provideMainModel());
    }
}
