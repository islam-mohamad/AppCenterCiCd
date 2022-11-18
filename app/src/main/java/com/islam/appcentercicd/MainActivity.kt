package com.islam.appcentercicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCenter.start(getApplication(), "78a15f84-5697-4886-88c8-cd9cc3bcfaf2",
                  Analytics.class, Crashes.class);
    }
}
