package com.bluemoonl.ch27findsubway.data.api

import com.bluemoonl.ch27findsubway.data.db.entity.StationEntity
import com.bluemoonl.ch27findsubway.data.db.entity.SubwayEntity


interface StationApi {

    suspend fun getStationDataUpdatedTimeMillis(): Long

    suspend fun getStationSubways(): List<Pair<StationEntity, SubwayEntity>>
}
