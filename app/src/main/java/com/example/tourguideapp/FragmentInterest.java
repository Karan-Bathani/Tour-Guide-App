package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

public class FragmentInterest extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.drawable.interest1, R.string.interest_1, R.string.interest_address_1));
        locations.add(new Location(R.drawable.interest2, R.string.interest_2, R.string.interest_address_2));
        locations.add(new Location(R.drawable.interest3, R.string.interest_3, R.string.interest_address_3));
        locations.add(new Location(R.drawable.interest4, R.string.interest_4, R.string.interest_address_4));
        locations.add(new Location(R.drawable.interest5, R.string.interest_5, R.string.interest_address_5));
        locations.add(new Location(R.drawable.interest6, R.string.interest_6, R.string.interest_address_6));
        locations.add(new Location(R.drawable.interest7, R.string.interest_7, R.string.interest_address_7));
        locations.add(new Location(R.drawable.interest8, R.string.interest_8, R.string.interest_address_8));
        locations.add(new Location(R.drawable.interest9, R.string.interest_9, R.string.interest_address_9));
        locations.add(new Location(R.drawable.interest10, R.string.interest_10, R.string.interest_address_10));


        LocationAdapter locationAdapter = new LocationAdapter(container.getContext(), 0, locations);

        View rootView = inflater.inflate(R.layout.mylistview, container, false);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
