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
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.location_list_item, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.description = (TextView) convertView.findViewById(R.id.description);
            holder.image = (ImageView) convertView.findViewById(R.id.locationIV);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Locations currentLocation = getItem(position);
        if (currentLocation != null) {
            holder.name.setText(currentLocation.getName());
            holder.description.setText(currentLocation.getDescription());
            holder.image.setImageResource(currentLocation.getPicture());
        }
        return convertView;
    }

    private static class ViewHolder {
        TextView name;
        TextView description;
        ImageView image;
    }
}
