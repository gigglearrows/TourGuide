package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Card} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 4;
    private Context context;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context contextParam, FragmentManager fm) {
        super(fm);
        context = contextParam;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new PlacesFragment();
        }
    }

    /**
     * Return page titles
     *
     * @param position
     * @return str
     */
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return context.getString(R.string.category_restaurants);
        } else if (position == 1) {
            return context.getString(R.string.category_hotels);
        } else if (position == 2) {
            return context.getString(R.string.category_events);
        } else {
            return context.getString(R.string.category_places);
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}