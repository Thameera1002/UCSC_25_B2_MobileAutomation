package util;

import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.util.Objects;

public class CapabilityOptions {

    public static UiAutomator2Options getAndroidCapabilities(){
        File file = new File(Objects.requireNonNull((CapabilityOptions.class)
                .getClassLoader()
                .getResource("android.wdio.native.app.v1.0.8.apk")
                .getFile()));
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("11");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("Pixel 2 API 30");
        options.setAppPackage("com.wdiodemoapp");
        options.setAppActivity(".MainActivity");
        options.setApp(file.getAbsolutePath());
        return  options;
    }
}
