package com.example.myapplication11;

import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;


public class PageAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numoftabs = numOfTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tab1();
            case 1:
                return new tab2();
            case 2:
                return new tab3();

        }
        return null;
    }

    @Override
    public int getCount(){
        return numoftabs;
    }

    public int getItemPosition(@NonNull Object object){
        return POSITION_NONE;
    }




}
