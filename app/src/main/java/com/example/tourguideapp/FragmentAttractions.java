package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class FragmentAttractions extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.attraction1, R.string.attraction_1, R.string.attraction_address_1));
        locations.add(new Location(R.drawable.attraction2, R.string.attraction_2, R.string.attraction_address_2));
        locations.add(new Location(R.drawable.attraction3, R.string.attraction_3, R.string.attraction_address_3));
        locations.add(new Location(R.drawable.attraction4, R.string.attraction_4, R.string.attraction_address_4));
        locations.add(new Location(R.drawable.attraction5, R.string.attraction_5, R.string.attraction_address_5));
        locations.add(new Location(R.drawable.attraction6, R.string.attraction_6, R.string.attraction_address_6));
        locations.add(new Location(R.drawable.attraction7, R.string.attraction_7, R.string.attraction_address_7));
        locations.add(new Location(R.drawable.attraction8, R.string.attraction_8, R.string.attraction_address_8));
        locations.add(new Location(R.drawable.attraction9, R.string.attraction_9, R.string.attraction_address_9));
        locations.add(new Location(R.drawable.attraction10, R.string.attraction_10, R.string.attraction_address_10));

        LocationAdapter locationAdapter = new LocationAdapter(container.getContext(), 0, locations);

        View rootView = inflater.inflate(R.layout.mylistview, container, false);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
