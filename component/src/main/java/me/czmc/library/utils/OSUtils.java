package me.czmc.library.utils;

import android.os.Build;

import java.io.IOException;

/**
 * 判断系统是不是miui，flyme，emui
 */
public class OSUtils {
    private static final String KEY_EMUI_VERSION_CODE = "ro.build.version.emui";
    private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String KEY_MIUI_INTERNAL_STORAGE = "ro.miui.internal.storage";
 
    private static boolean isPropertiesExist(String... keys) {
        try {
            BuildProperties prop = BuildProperties.newInstance();
            for (String key : keys) {
                String str = prop.getProperty(key);
                if (str == null)
                    return false;
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }
 
    public static boolean isEMUI() {
        return isPropertiesExist(KEY_EMUI_VERSION_CODE);
    }
 
    public static boolean isMIUI() {
        return isPropertiesExist(KEY_MIUI_VERSION_CODE, KEY_MIUI_VERSION_NAME, KEY_MIUI_INTERNAL_STORAGE);
    }
 
    public static boolean isFlyme() {
            return Build.BRAND.equals("Meizu");
    }
}