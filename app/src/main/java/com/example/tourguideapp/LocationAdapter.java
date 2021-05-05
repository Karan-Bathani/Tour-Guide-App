package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Location location = getItem(position);
        ImageView mImageView = itemView.findViewById((R.id.imageView));
        if (location != null) {
            mImageView.setImageResource(location.getmImageResourceId());

            TextView tvName = itemView.findViewById(R.id.tv_name);
            tvName.setText(parent.getContext().getString(location.getmNameStringId()));

            TextView tvAddress = itemView.findViewById(R.id.tv_address);
            tvAddress.setText(parent.getContext().getString(location.getmAddressStringId()));
        }
        return itemView;
    }
}
