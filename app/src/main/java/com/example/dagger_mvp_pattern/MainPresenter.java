package com.example.dagger_mvp_pattern;

import com.example.dagger_mvp_pattern.mvp.BasePresenter;

import javax.inject.Inject;

public class MainPresenter extends BasePresenter<MainContract.View>
implements MainContract.Presenter{
    @Inject
    protected MainModel model;

    public MainPresenter(MainModel model) {
        this.model = model;
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void basePresenterTestMethod() {

    }
}
