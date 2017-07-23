package com.mihailproductions.pitestitourguide.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.mihailproductions.pitestitourguide.R;

public class BusesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buses, container, false);
        ListView listView = (ListView) view.findViewById(R.id.listview_buses);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getActivity().getResources().getStringArray(R.array.buses));
        listView.setAdapter(arrayAdapter);
        return view;
    }
}
