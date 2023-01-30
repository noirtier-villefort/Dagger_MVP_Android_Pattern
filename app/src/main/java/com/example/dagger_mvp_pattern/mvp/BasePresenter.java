package com.example.dagger_mvp_pattern.mvp;

public abstract class BasePresenter<V> {
    protected V view;

    protected BasePresenter(V view){
        this.view = view;
    }

    protected BasePresenter(){

    }

    public void attachView(V view){
        this.view = view;
    }

    public void init(){
    }

    public void destroy(){

    }

}
