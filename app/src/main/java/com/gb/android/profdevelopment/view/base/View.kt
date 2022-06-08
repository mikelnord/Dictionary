package com.gb.android.profdevelopment.view.base

import com.gb.android.profdevelopment.model.data.AppState

interface View {
    fun renderData(appState: AppState)
}