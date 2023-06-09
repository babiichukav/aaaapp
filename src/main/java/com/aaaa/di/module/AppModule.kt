package com.aaaa.di.module

import android.app.Application
import androidx.room.Room
import com.aaaa.data.dao.ScofindViewByIdTextViewRidtvappnameo
import com.aaaa.data.source.local.CaramfindViewByIdTextViewRidtvappnameomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provfindViewByIdTextViewRidtvappnametabase(
        app: Application,
        callfindViewByIdTextViewRidtvappnamek: CaramfindViewByIdTextViewRidtvappnameomDatabase.CallfindViewByIdTextViewRidtvappnamek
    ): CaramfindViewByIdTextViewRidtvappnameomDatabase =
        Room.databaseBuilder(
            app,
            CaramfindViewByIdTextViewRidtvappnameomDatabase::class.java,
            "cccDatabase"
        )
            .addCallback(callfindViewByIdTextViewRidtvappnamek)
            .build()

    @Provides
    @Singleton
    fun profindViewByIdTextViewRidtvappnameDao(db: CaramfindViewByIdTextViewRidtvappnameomDatabase): ScofindViewByIdTextViewRidtvappnameo =
        db.getSfindViewByIdTextViewRidtvappnameeDao()
}
