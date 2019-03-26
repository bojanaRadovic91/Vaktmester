package cubes.vaktmester.radovic.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cubes.vaktmester.radovic.R;
import cubes.vaktmester.radovic.ui.activity.data.SharedPrefs;

public class LoadingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);


        if (SharedPrefs.isFirstTime(getApplicationContext())){
            startActivity(new Intent(LoadingActivity.this, ChooseLanguageActivity.class));

        }
        else {
            startActivity(new Intent(LoadingActivity.this, LoginActivity.class));
        }


    }
}
