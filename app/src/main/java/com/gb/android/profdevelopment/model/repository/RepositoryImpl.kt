package com.gb.android.profdevelopment.model.repository

import com.gb.android.profdevelopment.model.data.DataModel
import com.gb.android.profdevelopment.model.datasource.DataSource
import io.reactivex.Observable

class RepositoryImpl(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}