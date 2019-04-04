package cubes.vaktmester.radovic.ui.activity.adapter;

import android.content.Context;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import cubes.vaktmester.radovic.R;
import cubes.vaktmester.radovic.ui.activity.model.BuildingItem;

public class BuildingsListAdapter extends BaseAdapter {

    private ArrayList <BuildingItem> list;
    private Context context;


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        HolderClass holder;

        if (row == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            row = inflater.inflate(R.layout.activity_buildings, parent, false);

            holder = new HolderClass();

            holder.imageView = row.findViewById(R.id.imageView);
            holder.txtDesc = row.findViewById(R.id.textViewDescription);
            holder.txtTasks = row.findViewById(R.id.textViewTasks);
            holder.txtTitle = row.findViewById(R.id.textViewTitle);

            row.setTag(holder);


        }
        else {
            holder = (HolderClass) row.getTag();
        }

        holder.txtTitle.setText(list.get(position).title);
        holder.txtTasks.setText(list.get(position).tasks);
        holder.txtDesc.setText(list.get(position).description);
        holder.imageView.setImageResource(R.drawable.buildings);


        return row;
    }

    public class HolderClass {
        public TextView txtTitle, txtDesc, txtTasks;
        public ImageView imageView;

    }
}
