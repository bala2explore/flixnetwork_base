package Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import wolfsoft1.flixnetwork.LibraryFragment;

public class LibraryAdapter extends FragmentStatePagerAdapter {
    int mnumoftabs;

    public LibraryAdapter(FragmentManager fm, int numoftabs) {
        super(fm);
        this.mnumoftabs = numoftabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                LibraryFragment tab1 = new LibraryFragment();
                return tab1;
            case 1:
                LibraryFragment tab2 = new LibraryFragment();
                return tab2;

            case 2:
                LibraryFragment tab3 = new LibraryFragment();
                return tab3;

            case 3:
                LibraryFragment tab4 = new LibraryFragment();
                return tab4;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mnumoftabs;
    }
}

