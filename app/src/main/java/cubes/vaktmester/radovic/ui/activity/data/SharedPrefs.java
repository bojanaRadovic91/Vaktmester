package cubes.vaktmester.radovic.ui.activity.data;

import android.content.Context;
import android.content.SharedPreferences;

import cubes.vaktmester.radovic.R;

public class SharedPrefs {

    private static SharedPrefs instance;

    private SharedPreferences prefs;

    private SharedPrefs(Context context){
        prefs = context.getSharedPreferences(context.getString(R.string.app_name),Context.MODE_PRIVATE);

    }

    public static SharedPrefs getInstance(Context context){

        if (instance == null){
            instance = new SharedPrefs(context);
        }
        return instance;

    }
    //IS FIRST TIME STARTED APP
    public static void setFirstTime(Context context){
        getInstance(context).prefs.edit().putBoolean("is_first_time", false).apply();
    }

    public static boolean isFirstTime(Context context){
        return getInstance(context).prefs.getBoolean("is_first_time",true);

    }
}
