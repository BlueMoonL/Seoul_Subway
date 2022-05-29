package com.bluemoonl.ch27findsubway.data.db.entity.mapper

import com.bluemoonl.ch27findsubway.data.db.entity.StationEntity
import com.bluemoonl.ch27findsubway.data.db.entity.StationWithSubwaysEntity
import com.bluemoonl.ch27findsubway.data.db.entity.SubwayEntity
import com.bluemoonl.ch27findsubway.domain.Station
import com.bluemoonl.ch27findsubway.domain.Subway

fun StationWithSubwaysEntity.toStation() =
    Station(
        name = station.stationName,
        isFavorited = station.isFavorited,
        connectedSubways = subways.toSubways()
    )

fun Station.toStationEntity() =
    StationEntity(
        stationName = name,
        isFavorited = isFavorited,
    )


fun List<StationWithSubwaysEntity>.toStations() = map { it.toStation() }

fun List<SubwayEntity>.toSubways(): List<Subway> = map { Subway.findById(it.subwayId) }
