package com.mm.hilt

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject  //deprecated
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

//Injecting strings to ViewModel

@HiltViewModel
class TestViewModel  @Inject constructor(@Named("String2")testString2:String) : ViewModel(){
//class TestViewModel  @ViewModelInject constructor(@Named("String2")testString2:String) : ViewModel() -->@ViewModelInject is deprecated
    init {
        Log.d("ViewModel","Test --All apps that use Hilt must contain an Application class that's annotated with @HiltAndroidApp: $testString2")
    }
}