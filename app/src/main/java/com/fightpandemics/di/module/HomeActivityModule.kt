package com.fightpandemics.di.module

import com.fightpandemics.di.scope.ActivityScope
import com.fightpandemics.home.HomeContract
import com.fightpandemics.home.HomePresenter
import dagger.Module
import dagger.Provides

@Module
class HomeActivityModule(private val view: HomeContract.View) {

    @Provides
    @ActivityScope
    fun provideView() = view

    @Provides
    @ActivityScope
    fun providePresenter() = HomePresenter(view)
}