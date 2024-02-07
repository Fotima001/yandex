package com.example.yandex_upp

import io.flutter.embedding.android.FlutterActivity
import com.yandex.mapkit.MapKitFactory
import androidx.annotation.NonNull
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant;

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        MapKitFactory.setApiKey("046ea181-62ec-4f93-b500-cf5f9227031c")
        super.configureFlutterEngine(flutterEngine)
    }
}
