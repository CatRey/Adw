package com.example.aboba;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class PetsAdapter extends ArrayAdapter<Pets> {

    public PetsAdapter(Context context, List<Pets> arr) {
        super(context, R.layout.pets, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Pets person = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.pets, null);
        }

        assert person != null;
        ((ImageView) convertView.findViewById(R.id.tv1)).setImageURI(Uri.parse(String.valueOf(person.imgUrl)));
        ((TextView) convertView.findViewById(R.id.tv2)).setText(String.valueOf(person.name));
        ((TextView) convertView.findViewById(R.id.tv3)).setText(String.valueOf(person.breed));

        return convertView;
    }
}
