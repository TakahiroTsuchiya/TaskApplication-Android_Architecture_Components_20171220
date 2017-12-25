package com.capricelab.taskapplication

import android.arch.lifecycle.GenericLifecycleObserver
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleOwner
import android.util.Log

class GenericLifecycleObserverImpl: GenericLifecycleObserver {

    private val TAG = "Generic Impl"

    override fun onStateChanged(source: LifecycleOwner?, event: Lifecycle.Event?) {
        Log.i(TAG, "onStateChanged : " + source!!.lifecycle.currentState.name + ", " + event!!.name)
    }
}
