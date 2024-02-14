package com.example.aboba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



    public class PersonAdapter extends ArrayAdapter<Person> {

        public PersonAdapter(Context context, Person[] arr) {
            super(context, R.layout.person, arr);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            final Person person = getItem(position);

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.person, null);
            }

            assert person != null;
            ((TextView) convertView.findViewById(R.id.tv1)).setText(String.valueOf(person.id));
            ((TextView) convertView.findViewById(R.id.tv2)).setText(String.valueOf(person.name));
            ((TextView) convertView.findViewById(R.id.tv3)).setText(String.valueOf(person.phone));

            return convertView;
        }
    }
