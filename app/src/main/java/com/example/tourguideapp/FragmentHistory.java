package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FragmentHistory extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.image1, R.string.history_1, R.string.address_1));
        locations.add(new Location(R.drawable.image2, R.string.history_2, R.string.address_2));
        locations.add(new Location(R.drawable.image3, R.string.history_3, R.string.address_3));
        locations.add(new Location(R.drawable.image4, R.string.history_4, R.string.address_4));
        locations.add(new Location(R.drawable.image5, R.string.history_5, R.string.address_5));
        locations.add(new Location(R.drawable.image6, R.string.history_6, R.string.address_6));
        locations.add(new Location(R.drawable.image7, R.string.history_7, R.string.address_7));
        locations.add(new Location(R.drawable.image8, R.string.history_8, R.string.address_8));
        locations.add(new Location(R.drawable.image9, R.string.history_9, R.string.address_9));
        locations.add(new Location(R.drawable.image10, R.string.history_10, R.string.address_10));

        LocationAdapter locationAdapter = new LocationAdapter(container.getContext(), 0, locations);

        View rootView = inflater.inflate(R.layout.mylistview, container, false);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}