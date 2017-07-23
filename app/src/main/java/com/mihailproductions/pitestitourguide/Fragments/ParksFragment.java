package com.mihailproductions.pitestitourguide.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mihailproductions.pitestitourguide.Adapters.LocationsAdapter;
import com.mihailproductions.pitestitourguide.Model.Locations;
import com.mihailproductions.pitestitourguide.R;

import java.util.ArrayList;

public class ParksFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_parks, container, false);
        String[] parkName = getActivity().getResources().getStringArray(R.array.parkNames);
        String[] parkDesc = getActivity().getResources().getStringArray(R.array.parkDescriptions);
        ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(parkName[0], parkDesc[0], R.drawable.park_strand));
        locations.add(new Locations(parkName[1], parkDesc[1], R.drawable.park_the_meadow_of_arges));
        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), locations);
        ListView listView = (ListView) view.findViewById(R.id.listview_parks);
        listView.setAdapter(locationsAdapter);
        return view;
    }
}
