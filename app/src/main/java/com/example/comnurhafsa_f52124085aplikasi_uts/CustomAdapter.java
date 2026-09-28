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
    private final Context context;
    private final String[] titles;
    private final String[] descriptions;
    private final int[] images;

    public CustomAdapter(Context context, String[] titles, String[] descriptions, int[] images) {
        super(context, R.layout.item_row, titles);
        this.context = context;
        this.titles = titles;
        this.descriptions = descriptions;
        this.images = images;
    }

    // ViewHolder pattern untuk menghemat memori dan meningkatkan performa scroll
    static class ViewHolder {
        ImageView icon;
        TextView title;
        TextView description;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.item_row, parent, false);

            holder = new ViewHolder();
            holder.icon = convertView.findViewById(R.id.icon);
            holder.title = convertView.findViewById(R.id.title);
            holder.description = convertView.findViewById(R.id.description);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        // Set data ke tampilan
        holder.icon.setImageResource(images[position]);
        holder.title.setText(titles[position]);
        holder.description.setText(descriptions[position]);

        return convertView;
    }
}