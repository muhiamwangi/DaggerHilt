package com.mm.hilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)

object ActivityModule {

    //Needing Dependencies to construct other dependencies
@ActivityScoped
@Provides
@Named("String3")
fun providedTestString3(@ApplicationContext context:Context,@Named("String1")testString1:String)=
   "${context.getString(R.string.string_to_inject)}- $testString1"

}