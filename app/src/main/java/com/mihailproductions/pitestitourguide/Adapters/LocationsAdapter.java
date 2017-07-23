package com.mihailproductions.pitestitourguide.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mihailproductions.pitestitourguide.Model.Locations;
import com.mihailproductions.pitestitourguide.R;

import java.util.ArrayList;

public class LocationsAdapter extends ArrayAdapter<Locations> {
    public LocationsAdapter(Activity context, ArrayList<Locations> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, parent, false);
        }
        Locations currentLocation = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentLocation.getName());
        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText(currentLocation.getDescription());
        ImageView image = (ImageView) listItemView.findViewById(R.id.locationIV);
        image.setImageResource(currentLocation.getPicture());
        return listItemView;
    }
}
