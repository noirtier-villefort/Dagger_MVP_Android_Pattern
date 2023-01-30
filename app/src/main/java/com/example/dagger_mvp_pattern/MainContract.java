package com.example.dagger_mvp_pattern;

import com.example.dagger_mvp_pattern.mvp.BaseContract;

public interface MainContract extends BaseContract {
    interface View extends BaseContract.View{
        @Override
        void baseViewTestMethod();
        // View methods specified for "Main"
    }
    interface Presenter extends BaseContract.Presenter{
        @Override
        void basePresenterTestMethod();
        // base presenter methods specified for "Main"
    }
}
