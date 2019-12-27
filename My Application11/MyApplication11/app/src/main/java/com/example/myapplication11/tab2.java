package com.example.myapplication11;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab2 extends Fragment {

    GridView gv;
    ImageAdapter ia;


    public tab2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tab2, container, false);
        gv = (GridView) v.findViewById(R.id.grid_view);
        gv.setAdapter(new ImageAdapter(getActivity()));

        // Inflate the layout for this fragment
        return v;
    }

}
