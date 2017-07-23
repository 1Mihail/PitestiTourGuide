package com.mihailproductions.pitestitourguide.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.mihailproductions.pitestitourguide.Model.Natives;
import com.mihailproductions.pitestitourguide.R;

import java.util.ArrayList;

public class NativesAdapter extends ArrayAdapter<Natives> {
    public NativesAdapter(Activity context, ArrayList<Natives> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.native_list_item, parent, false);
        }
        Natives currentNative = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentNative.getName());
        ImageView image = (ImageView) listItemView.findViewById(R.id.nativeIV);
        image.setImageResource(currentNative.getPicture());
        return listItemView;
    }
}
