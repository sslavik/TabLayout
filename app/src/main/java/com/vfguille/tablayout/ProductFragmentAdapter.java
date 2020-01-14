package com.vfguille.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ProductFragmentAdapter extends FragmentPagerAdapter {

    public ProductFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return null;
            case 1:
                return ProductInfoFragment.newInstance();
            case 2:
                return ProductDescriptionFragment.newInstance();
            case 3:
                return ProductMapFragment.newInstance();
        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return ("");
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 0;
    }
}
