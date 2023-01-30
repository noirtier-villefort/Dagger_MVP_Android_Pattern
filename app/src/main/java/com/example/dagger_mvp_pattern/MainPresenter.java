package com.example.dagger_mvp_pattern;

import com.example.dagger_mvp_pattern.mvp.BaseContract;
import com.example.dagger_mvp_pattern.mvp.BasePresenter;

public class MainPresenter extends BasePresenter<MainContract.View>
implements MainContract.Presenter{
    protected MainPresenter(MainContract.View view) {
        super(view);
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
