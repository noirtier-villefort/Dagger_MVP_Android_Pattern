package com.example.dagger_mvp_pattern.mvp;

public abstract class BasePresenter<V> {
    protected final V view;

    protected BasePresenter(V view){
        this.view = view;
    }

    public void init(){
    }

    public void destroy(){

    }

}
