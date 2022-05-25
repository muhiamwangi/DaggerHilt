package com.mm.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

/**
-Module :Class that defines how dependencies can be provided
-Modules are containers for dependencies that live for a specific amount of time
//ie modules that live as long as our app does. ie Retrofit/Room instance
   modules that live contain dependencies that live as long as our MainActivity does

--------------------------------------------

Hilt supports the following Android classes:
1.Application (by using @HiltAndroidApp)
2.ViewModel (by using @HiltViewModel)
3.Activity
4.Fragment
5.View
6.Service
7.BroadcastReceiver

-Hilt MODULE is a class that informs Hilt how to provide instances of certain types
-You must annotate Hilt modules with @InstallIn to tell Hilt which ANDROID CLASS each module will be used or installed in.
**/
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
   @Singleton
   @Provides
   @Named("String1")
   fun provideTestString()="String that we will inject"


   @Singleton
   @Provides
   @Named("String2")
   fun provideTestString2()="Dagger Hilt String that will be injected"


}