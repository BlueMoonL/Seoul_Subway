package com.bluemoonl.ch27findsubway.presentation

interface BaseView<PresenterT : BasePresenter> {

    val presenter: PresenterT
}
