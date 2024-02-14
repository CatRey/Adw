package com.example.aboba;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PersonAdapter adapter = new PersonAdapter(this,makePerson());
        ListView lv = (ListView) findViewById(R.id.persons);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PetsAdapter adapter1 = new PetsAdapter(getApplicationContext(),makePerson()[position].petsList);
                ListView lv1 = (ListView) findViewById(R.id.lv);
                lv1.setAdapter(adapter1);
            }
        });

        lv.setAdapter(adapter);



    }
    Person[] makePerson(){
        Person[] arr = new Person[6];
        int[] id = {122,1290,12322,2323,10023,8};
        String[] name = {"Aleksandr","ABOBA","SDWF","SOBAKKA","El' Primo","Polina"};
        String[] phone = {"+79810822222","7(666)204-03-69","7(186)627-91-60"," ","None","7(55)256-95-61"};
        Pets[][] pets = {{new Pets("Charik","aaa.jpg","o"), new Pets("Charika","aaa","o"), new Pets("Charik","aaa","o"), new Pets("Charik","aaa","o"), new Pets("Charik","aaa","o"), new Pets("Charik","aaa","o")}};
        for (int i=0;i<id.length;i++){
            Person p = new Person();
            p.id = id[i];
            p.name = name[i];
            p.phone = phone[i];
            p.petsList = Arrays.asList(pets[0]);
            arr[i] = p;
        }
        return arr;
    }
}