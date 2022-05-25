package com.mm.hilt
/**
 https://www.youtube.com/watch?v=ZE2Jkvnk2Bs&t=73s
 DATE:25/5/2022
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

//we did set up Hilt in Application class- 'MyApplication.kt'
//We use @AndroidEntryPoint annotation so as Hilt can provide this class with dependencies

//If you annotate an Android class with @AndroidEntryPoint, then you also must annotate Android classes that depend on it.
//i.e Annotate a fragment, then you must also annotate any activities where you use that fragment.

//@AndroidEntryPoint generates an individual Hilt component for each Android class in your project.
//These components can receive dependencies from their respective parent classes as described in Component hierarchy.

//To obtain dependencies from a component, use the @Inject annotation to perform field injection:

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("String2")
    lateinit var testString:String
    //Injecting strings to MainActivity & in ViewModel

    @Inject
    @Named("String3")
    lateinit var testString3:String

    private val viewModel:TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d( "MainActivity", "Test String from MainActivity: $testString")
        Log.d( "MainActivity", "Test String from MainActivity: $testString3")
        viewModel
    }
}

//testString  -> AppModule
//testString2 -> ActivityModule
//testString3 -> ActivityModule

//Search 'test' in logcat