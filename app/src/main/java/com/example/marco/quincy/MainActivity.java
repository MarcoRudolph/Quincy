package com.example.marco.quincy;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtons();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
/*
        Fragment_dashboard fragment_dashboard = new Fragment_dashboard();
        fragmentTransaction.replace(R.id.main_content, fragment_dashboard);
*/
        Fragment_kartei fragment_kartei = new Fragment_kartei();
        fragmentTransaction.replace(R.id.main_content, fragment_kartei);
    }

    private void setButtons() {
        TextView tx = (TextView) findViewById(R.id.btnPatientIconText);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "font/quincy-font1.ttf");

        tx.setTypeface(custom_font);
        tx.setText("H");
    }

}
