package cubes.vaktmester.radovic.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import cubes.vaktmester.radovic.R;
import cubes.vaktmester.radovic.ui.activity.adapter.BuildingsListAdapter;

public class BuildingsActivity extends Activity {

    private TextView textViewTitle, textViewDescription, textViewTasks;
    private ImageView imageView;
    private ImageView imageViewBack;
    private EditText editTextSearch;
    private ImageView imageSearch;
    private ListView listView;
    BuildingsListAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buildings);

        initComponent();
        addListener();


    }

    private void addListener() {

        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

    private void initComponent() {

        imageViewBack = findViewById(R.id.imageBack);
        editTextSearch = findViewById(R.id.editTextSearch);
        imageSearch = findViewById(R.id.imageSearch);

        textViewTitle = findViewById(R.id.textViewTitle);
        textViewTasks = findViewById(R.id.textViewTasks);
        textViewDescription = findViewById(R.id.textViewDescription);
        imageView = findViewById(R.id.imageViewB);
    }

}
