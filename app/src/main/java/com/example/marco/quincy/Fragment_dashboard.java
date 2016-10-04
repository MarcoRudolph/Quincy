package com.example.marco.quincy;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marco.quincy.R;

/**
 * Created by Marco on 28.09.2016.
 */

public class Fragment_dashboard extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dashboard_fragment, container, false);
    }
}
