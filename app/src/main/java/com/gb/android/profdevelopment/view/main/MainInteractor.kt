package com.gb.android.profdevelopment.view.main

import com.gb.android.profdevelopment.model.data.AppState
import com.gb.android.profdevelopment.model.data.DataModel
import com.gb.android.profdevelopment.model.repository.Repository
import com.gb.android.profdevelopment.presenter.Interactor
import io.reactivex.Observable

class MainInteractor(
    private val remoteRepository: Repository<List<DataModel>>,
    private val localRepository: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}
