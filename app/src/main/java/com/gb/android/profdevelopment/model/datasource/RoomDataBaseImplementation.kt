package com.gb.android.profdevelopment.model.datasource

import com.gb.android.profdevelopment.model.data.DataModel
import io.reactivex.Observable

class RoomDataBaseImplementation: DataSource<List<DataModel>> {
    override fun getData(word: String): Observable<List<DataModel>> {
        TODO("Not yet implemented")
    }
}