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
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.native_list_item, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.name);
            holder.image = (ImageView) convertView.findViewById(R.id.nativeIV);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Natives currentNative = getItem(position);
        if (currentNative != null) {
            holder.name.setText(currentNative.getName());
            holder.image.setImageResource(currentNative.getPicture());
        }
        return convertView;
    }

    private static class ViewHolder {
        TextView name;
        ImageView image;
    }
}
