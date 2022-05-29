package com.bluemoonl.ch27findsubway.data.repository

import com.bluemoonl.ch27findsubway.domain.ArrivalInformation
import com.bluemoonl.ch27findsubway.domain.Station
import kotlinx.coroutines.flow.Flow

interface StationRepository {

    val stations: Flow<List<Station>>

    suspend fun refreshStations()

    suspend fun getStationArrivals(stationName: String): List<ArrivalInformation>

    suspend fun updateStation(station: Station)
}
