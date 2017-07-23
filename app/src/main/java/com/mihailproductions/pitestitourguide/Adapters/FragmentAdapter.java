package com.mihailproductions.pitestitourguide.Adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.mihailproductions.pitestitourguide.Fragments.BusesFragment;
import com.mihailproductions.pitestitourguide.Fragments.MuseumsFragment;
import com.mihailproductions.pitestitourguide.Fragments.NativesFragment;
import com.mihailproductions.pitestitourguide.Fragments.ParksFragment;
import com.mihailproductions.pitestitourguide.R;

public class FragmentAdapter extends FragmentPagerAdapter {
    private String tabTitles[];

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        tabTitles = context.getResources().getStringArray(R.array.tabs);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParksFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new NativesFragment();
            case 3:
                return new BusesFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
