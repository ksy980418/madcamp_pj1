package com.example.myapplication11;


import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */



public class tab1 extends Fragment {
    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;




    public tab1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab1, container, false);
        lv = (ListView) v.findViewById(R.id.contract);
        //al = new ArrayList<String>();
        //aa = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_activated_1,al);
        //lv.setAdapter(aa);

        Cursor cursor = getActivity().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
        getActivity().startManagingCursor(cursor);

        String[] from = {ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};

        int[] to = {android.R.id.text1,android.R.id.text2};

        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(getActivity(),android.R.layout.simple_expandable_list_item_2,cursor,from,to);
        lv.setAdapter(simpleCursorAdapter);
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        /*al.add("Bangalre");
        al.add("natasya");
        al.add("stiid");
        al.add("Hydra");
        al.add("Bjanka");*/
        // Inflate the layout for this fragment
        return v;
    }


}
