package com.android.mvp_frame.ui.module.home.presenter;


import com.android.mvp_frame.frame.BaseView;
import com.android.mvp_frame.frame.IPresenter;

public interface MainContract {

    interface View extends BaseView{
        void sayHello(String text);
    }

    interface Presenter extends IPresenter<View>{
        void sayHello();
    }
}
