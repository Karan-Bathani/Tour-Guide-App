package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class FragmentStreetFood extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.streetfood1, R.string.streetfood_1, R.string.streetfood_address_1));
        locations.add(new Location(R.drawable.streetfood2, R.string.streetfood_2, R.string.streetfood_address_2));
        locations.add(new Location(R.drawable.streetfood3, R.string.streetfood_3, R.string.streetfood_address_3));
        locations.add(new Location(R.drawable.streetfood4, R.string.streetfood_4, R.string.streetfood_address_4));
        locations.add(new Location(R.drawable.streetfood5, R.string.streetfood_5, R.string.streetfood_address_5));
        locations.add(new Location(R.drawable.streetfood6, R.string.streetfood_6, R.string.streetfood_address_6));
        locations.add(new Location(R.drawable.streetfood7, R.string.streetfood_7, R.string.streetfood_address_7));
        locations.add(new Location(R.drawable.streetfood8, R.string.streetfood_8, R.string.streetfood_address_8));
        locations.add(new Location(R.drawable.streetfood9, R.string.streetfood_9, R.string.streetfood_address_9));
        locations.add(new Location(R.drawable.streetfood10, R.string.streetfood_10, R.string.streetfood_address_10));


        LocationAdapter locationAdapter = new LocationAdapter(container.getContext(), 0, locations);

        View rootView = inflater.inflate(R.layout.mylistview, container, false);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
