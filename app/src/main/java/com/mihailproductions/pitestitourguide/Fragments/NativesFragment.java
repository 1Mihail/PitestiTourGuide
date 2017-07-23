package com.mihailproductions.pitestitourguide.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.mihailproductions.pitestitourguide.Adapters.NativesAdapter;
import com.mihailproductions.pitestitourguide.Model.Natives;
import com.mihailproductions.pitestitourguide.R;

import java.util.ArrayList;

public class NativesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_natives, container, false);
        String[] nativesList = getActivity().getResources().getStringArray(R.array.natives);
        ArrayList<Natives> natives = new ArrayList<Natives>();
        natives.add(new Natives(nativesList[0], R.drawable.antonescu));
        natives.add(new Natives(nativesList[1], R.drawable.bratianu));
        natives.add(new Natives(nativesList[2], R.drawable.calinescu));
        NativesAdapter nativesAdapter = new NativesAdapter(getActivity(), natives);
        ListView listView = (ListView) view.findViewById(R.id.listview_natives);
        listView.setAdapter(nativesAdapter);
        return view;
    }
}
