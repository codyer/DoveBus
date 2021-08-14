/*
 * ************************************************************
 * 文件：StubLiveDataWrapper.java  模块：core  项目：ElegantBus
 * 当前修改时间：2020年09月13日 09:43:44
 * 上次修改时间：2020年09月13日 09:39:57
 * 作者：Cody.yi   https://github.com/codyer
 *
 * 描述：core
 * Copyright (c) 2020
 * ************************************************************
 */

package cody.bus;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;

/**
 * Created by xu.yi. on 2020/6/4.
 * 当未激活时使用stub包装类
 */
class StubLiveDataWrapper<T> implements LiveDataWrapper<T> {
    T value;

    StubLiveDataWrapper() {
    }

    @Override
    public boolean hasObservers() {
        return false;
    }

    @Override
    public boolean hasActiveObservers() {
        return false;
    }

    @Nullable
    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void post(@NonNull final T value) {
        this.value = value;
    }

    @Override
    public void postToCurrentProcess(@NonNull final T value) {
        this.value = value;
    }

    @Override
    public void resetSticky() {
    }

    @Override
    public void setValue(@NonNull final T value) {
        this.value = value;
    }

    @Override
    public void removeObserver(@NonNull final ObserverWrapper<T> observerWrapper) {
    }

    @Override
    public void removeObservers(@NonNull final LifecycleOwner owner) {
    }

    @Override
    public void observeForever(@NonNull final ObserverWrapper<T> observerWrapper) {
    }

    @Override
    @Deprecated
    public void observeSticky(@NonNull final LifecycleOwner owner, @NonNull final ObserverWrapper<T> observerWrapper) {
    }

    @Override
    public void observe(@NonNull final LifecycleOwner owner, @NonNull final ObserverWrapper<T> observerWrapper) {
    }
}
