package cubes.vaktmester.radovic.ui.activity.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cubes.vaktmester.radovic.R;

public class LanguageAdapter extends ArrayAdapter<String> {

    private ArrayList<String> list;

    public LanguageAdapter(Context context) {
        super(context, R.layout.spinner_list_item);
        list = new ArrayList<>();
        list.add("English");
        list.add("Norwegian");
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View row = inflater.inflate(R.layout.spinner_list_item, parent, false);

        TextView txtView = row.findViewById(R.id.textView);
        txtView.setText(list.get(position));

        ImageView imageView = row.findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);


        return row;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View row = inflater.inflate(R.layout.spinner_list_item, parent, false);

        TextView txtView = row.findViewById(R.id.textView);
        txtView.setText(list.get(position));

        ImageView imageView = row.findViewById(R.id.imageView);
        if (position == 0){
            imageView.setImageResource(R.drawable.drawable_englandsvg);
        }
        else if (position == 1){
            imageView.setImageResource(R.drawable.drawable_norwaysvg);

        }


        return row;
    }
}
