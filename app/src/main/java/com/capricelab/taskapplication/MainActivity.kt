package com.capricelab.taskapplication

import android.arch.lifecycle.GenericLifecycleObserver
import android.arch.lifecycle.ProcessLifecycleOwner
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    val observer = LifecycleObserverImpl()

    val genericObserver = GenericLifecycleObserverImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.exeute_button)
        button.setOnClickListener(View.OnClickListener {
        })

        val state = lifecycle.currentState

        Log.i(TAG, "onCreate : " + state.toString())

        lifecycle.addObserver(observer)

        ProcessLifecycleOwner.get().lifecycle.addObserver(genericObserver)
    }

    override fun onStart() {
        super.onStart()

        val state = lifecycle.currentState

        Log.i(TAG, "onStart : " + state.toString())
    }

    override fun onResume() {
        super.onResume()

        val state = lifecycle.currentState

        Log.i(TAG, "onResume : " + state.toString())
    }

    override fun onPause() {
        super.onPause()

        val state = lifecycle.currentState

        Log.i(TAG, "onPause : " + state.toString())
    }

    override fun onStop() {
        super.onStop()

        val state = lifecycle.currentState

        Log.i(TAG, "onStop : " + state.toString())
    }

    override fun onDestroy() {
        super.onDestroy()

        val state = lifecycle.currentState

        Log.i(TAG, "onDestroy : " + state.toString())

        lifecycle.removeObserver(observer)
    }

    override fun onRestart() {
        super.onRestart()

        val state = lifecycle.currentState

        Log.i(TAG, "onRestart : " + state.toString())
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {

        var state = lifecycle.currentState

        Log.i(TAG, "onSaveInstanceState : " + state.toString())

        super.onSaveInstanceState(outState, outPersistentState)

        state = lifecycle.currentState

        Log.i(TAG, "onSaveInstanceState : " + state.toString())
    }
}
