package com.gb.android.profdevelopment.presenter


import com.gb.android.profdevelopment.model.data.AppState
import com.gb.android.profdevelopment.view.base.View

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)

    fun detachView(view: V)

    fun getData(word: String, isOnline: Boolean)
}
