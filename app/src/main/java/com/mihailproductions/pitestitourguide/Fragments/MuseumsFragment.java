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

public class MuseumsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_museums, container, false);
        ArrayList<Locations> locations = new ArrayList<Locations>();
        String[] museumName = getActivity().getResources().getStringArray(R.array.museumsNames);
        String[] museumDesc = getActivity().getResources().getStringArray(R.array.museumsDescriptions);
        locations.add(new Locations(museumName[0], museumDesc[0], R.drawable.museum_arges_county));
        locations.add(new Locations(museumName[1], museumDesc[1], R.drawable.museum_golesti));
        LocationsAdapter locationsAdapter = new LocationsAdapter(getActivity(), locations);
        ListView listView = (ListView) view.findViewById(R.id.listview_museums);
        listView.setAdapter(locationsAdapter);
        return view;
    }
}
