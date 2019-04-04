package cubes.vaktmester.radovic.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import cubes.vaktmester.radovic.R;

public class BuildingDetailActivity extends Activity {

    private TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), BuildingMapActivity.class);
                startActivity(intent);

            }
        });


        initComponent();
    }

    private void initComponent() {

        textView = findViewById(R.id.textViewButton);
    }

}
