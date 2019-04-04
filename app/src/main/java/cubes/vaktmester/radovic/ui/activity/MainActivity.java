package cubes.vaktmester.radovic.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import cubes.vaktmester.radovic.R;

public class MainActivity  extends Activity {

    private TextView textViewTickets, textViewChat, textViewBuildings, textViewTimesheet;
    private ImageView imageViewTickets, imageViewChat, imageViewBuildings, imageViewTimesheet;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        initComponents();
        addListener();
    }

    private void addListener() {

        imageViewTickets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewBuildings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imageViewTimesheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }

    private void initComponents() {

        textViewTickets = findViewById(R.id.textTickets);
        textViewBuildings = findViewById(R.id.textBuildings);
        textViewChat = findViewById(R.id.textChat);
        textViewTimesheet = findViewById(R.id.textTimesheet);
        imageViewTickets = findViewById(R.id.imageTickets);
        imageViewBuildings = findViewById(R.id.imageBuildings);
        imageViewChat = findViewById(R.id.imageChat);
        imageViewTimesheet = findViewById(R.id.imageTimesheet);
    }


}
