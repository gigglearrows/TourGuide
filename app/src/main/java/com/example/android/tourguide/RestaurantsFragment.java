package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(
                new Card(getString(R.string.restaurant_ekebergrestauranten_title), getString(R.string.restaurant_ekebergrestauranten_desc), R.drawable.restaurant_ekebergrestauranten),
                new Card(getString(R.string.restaurant_maaemo_title), getString(R.string.restaurant_maaemo_desc), R.drawable.restaurant_maaemo),
                new Card(getString(R.string.restaurant_engebretcafe_title), getString(R.string.restaurant_engebretcafe_desc), R.drawable.restaurant_engebretcafe),
                new Card(getString(R.string.restaurant_solsiden_title), getString(R.string.restaurant_solsiden_desc), R.drawable.restaurant_solsiden),
                new Card(getString(R.string.restaurant_mehfel_title), getString(R.string.restaurant_mehfel_desc), R.drawable.restaurant_mehfel),
                new Card(getString(R.string.restaurant_lofotenfish_title), getString(R.string.restaurant_lofotenfish_desc), R.drawable.restaurant_lofotenfish),
                new Card(getString(R.string.restaurant_jaipur_title), getString(R.string.restaurant_jaipur_desc), R.drawable.restaurant_jaipur),
                new Card(getString(R.string.restaurant_brasseriefrance_title), getString(R.string.restaurant_brasseriefrance_desc), R.drawable.restaurant_brasseriefrance),
                new Card(getString(R.string.restaurant_hanami_title), getString(R.string.restaurant_hanami_desc), R.drawable.restaurant_hanami),
                new Card(getString(R.string.restaurant_arakataka_title), getString(R.string.restaurant_arakataka_desc), R.drawable.restaurant_arakataka)
        ));

        CardAdapter itemsAdapter = new CardAdapter(getActivity(), cards);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }

}
