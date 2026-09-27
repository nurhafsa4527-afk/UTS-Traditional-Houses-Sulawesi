package com.example.comnurhafsa_f52124085aplikasi_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] titles;
    private String[] descriptions;
    private int[] images;

    public CustomAdapter(Context context, String[] titles, String[] descriptions, int[] images) {
        super(context, R.layout.item_row, titles);
        this.context = context;
        this.titles = titles;
        this.descriptions = descriptions;
        this.images = images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(R.layout.item_row, parent, false);
        ImageView icon = row.findViewById(R.id.icon);
        TextView title = row.findViewById(R.id.title);
        TextView description = row.findViewById(R.id.description);
        icon.setImageResource(images[position]);
        title.setText(titles[position]);
        description.setText(descriptions[position]);
        return row;
    }
}