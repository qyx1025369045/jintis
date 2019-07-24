package com.example.days12.base;

import android.arch.lifecycle.Observer;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BaseObserver<T> implements Observer<T> {

    //管理每次网络请求
    CompositeDisposable compositeDisposable = new CompositeDisposable();



}
