package com.app.lifehackstudiotestapp.di.components

import android.content.Context
import android.content.SharedPreferences
import com.app.lifehackstudiotestapp.di.modules.AppModule
import com.app.lifehackstudiotestapp.di.modules.NetworkModule
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Component(
    modules = [
        NetworkModule::class,
        AppModule::class
    ]
)
@Singleton
interface CoreComponent {

    fun provideContext(): Context
    fun provideRetrofit(): Retrofit
    fun provideOkHttpClient(): OkHttpClient

}