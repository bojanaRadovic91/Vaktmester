package cubes.vaktmester.radovic.ui.activity.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import cubes.vaktmester.radovic.R;

public class IntroFragment extends Fragment {

    public String titleString;
    public String descriptionString;
    public  int imageResource;
    public int oval1_full;
    public  int oval2;
    public  int Oval3;


    public IntroFragment(){

    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_intro, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView txtTitle = view.findViewById(R.id.textViewTitle);
        TextView txtDesc = view.findViewById(R.id.textViewDescription);
        ImageView imageView = view.findViewById(R.id.imageView);

        txtTitle.setText(titleString);
        txtDesc.setText(descriptionString);
        imageView.setImageResource(imageResource);



    }




}
