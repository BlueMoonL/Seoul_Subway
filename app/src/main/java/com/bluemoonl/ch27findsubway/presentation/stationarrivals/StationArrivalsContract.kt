package com.bluemoonl.ch27findsubway.presentation.stationarrivals

import com.bluemoonl.ch27findsubway.domain.ArrivalInformation
import com.bluemoonl.ch27findsubway.presentation.BasePresenter
import com.bluemoonl.ch27findsubway.presentation.BaseView

interface StationArrivalsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showErrorDescription(message: String)

        fun showStationArrivals(arrivalInformation: List<ArrivalInformation>)
    }

    interface Presenter : BasePresenter {

        fun fetchStationArrivals()

        fun toggleStationFavorite()
    }
}