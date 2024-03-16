package com.example.dart_vm_bug

import android.content.Context
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.embedding.engine.FlutterEngineGroup
import io.flutter.embedding.engine.dart.DartExecutor

class ShareActivity: FlutterActivity() {
    override fun provideFlutterEngine(context: Context): FlutterEngine? {
        var engine: FlutterEngine? = null

        val dartEntrypoint = DartExecutor.DartEntrypoint(
            appBundlePath,
            dartEntrypointLibraryUri,
            dartEntrypointFunctionName
        )
        val group = FlutterEngineGroup(
            getContext(),
            flutterShellArgs.toArray()
        )

        engine = group.createAndRunEngine(this, dartEntrypoint)
        return engine
    }

    override fun getAppBundlePath(): String {
        return "flutter_assets"
    }

    override fun getDartEntrypointLibraryUri(): String {
        return "package:dart_vm_bug/main.dart"
    }

    override fun getDartEntrypointFunctionName(): String {
        return "mainTwo"
    }
}
