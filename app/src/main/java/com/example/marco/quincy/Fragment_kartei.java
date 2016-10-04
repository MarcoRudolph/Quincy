package com.example.marco.quincy;
import android.app.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.marco.quincy.R;

/**
 * Created by Marco on 28.09.2016.
 */

public class Fragment_kartei extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Simple array with a list of my favorite TV shows

        String[] karteiEintraege = {"30.09.2016: Rezept - Aspirin immer morgens", "12.10.2015: Diagnose - Krank",
                "12.10.2015: Leistung - Gut zugeredet", "12.10.2015: Laborauftrag - Blutanalyse", "01.05.2015: Diagnose - Oft zu faul für die Arbeit", "15.04.2015: Rezept - Tramal jeden Tag"};

        ListAdapter listAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_2,karteiEintraege);


        // ListViews display data in a scrollable list
        ListView theListView = (ListView)getActivity().findViewById(R.id.kartei_listview);


        // Tells the ListView what data to use
        theListView.setAdapter(listAdapter);


        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String tvShowPicked = "You selected " +
                        String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(getActivity(), tvShowPicked, Toast.LENGTH_SHORT).show();
            }

        });


        return inflater.inflate(R.layout.kartei_fragment, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
