package cubes.vaktmester.radovic.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import cubes.vaktmester.radovic.R;
import cubes.vaktmester.radovic.ui.activity.adapter.LanguageAdapter;
import cubes.vaktmester.radovic.ui.activity.data.SharedPrefs;

public class ChooseLanguageActivity extends Activity {

    private Button buttonConfirm;
    private Spinner spinnerLanguage;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);


        initConponent();
        addListener();
    }

    private void addListener() {

        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ChooseLanguageActivity.this, LoginActivity.class));
                finish();

                SharedPrefs.setFirstTime(getApplicationContext());


            }
        });
    }

    private void initConponent() {

        buttonConfirm = findViewById(R.id.buttonConfirm);
        spinnerLanguage = findViewById(R.id.spinnerLanguage);

        spinnerLanguage.setAdapter(new LanguageAdapter(getApplicationContext()));


    }
}
