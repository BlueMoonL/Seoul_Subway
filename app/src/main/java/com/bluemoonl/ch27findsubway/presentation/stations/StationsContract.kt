package com.bluemoonl.ch27findsubway.presentation.stations

import com.bluemoonl.ch27findsubway.domain.Station
import com.bluemoonl.ch27findsubway.presentation.BasePresenter
import com.bluemoonl.ch27findsubway.presentation.BaseView


interface StationsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showStations(stations: List<Station>)
    }

    interface Presenter : BasePresenter {

        fun filterStations(query: String)

        fun toggleStationFavorite(station: Station)
    }
}
