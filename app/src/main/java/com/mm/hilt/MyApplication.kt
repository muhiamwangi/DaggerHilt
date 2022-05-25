package com.mm.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**

-All apps that use Hilt must contain an Application class that's annotated with @HiltAndroidApp.
-@HiltAndroidApp triggers Hilt's code generation -including a base class for your app that serves as the application-level dependency container.
-This generated Hilt component is attached to the Application object's lifecycle & provides dependencies to it.
-Its the parent component of the app- other components can access the dependencies that it provides.


-Once Hilt is set up in your Application class and an application-level component is available,
Hilt can provide dependencies to other Android classes that have the @AndroidEntryPoint annotation
**/
@HiltAndroidApp
class MyApplication : Application()