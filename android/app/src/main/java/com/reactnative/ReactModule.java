package com.reactnative;

import android.content.Intent;
import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.content.Context;
public class ReactModule extends ReactContextBaseJavaModule {
    ReactModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public void initialize() {
        super.initialize();
    }
    /**
     * @return the name of this module. This will be the name used to {@code require()} this module
     * from JavaScript.
     */
    @Override
    public String getName() {
        return "NativeUI";
    }
    @ReactMethod
    void navigateToExample() {
        ReactApplicationContext context = getReactApplicationContext();
//        Toast.makeText(context, "Hello Smit Doshi", Toast.LENGTH_LONG).show();
         Intent intent = new Intent(context, Lock.class);
        // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getCurrentActivity().startActivity(intent);
    }
}
