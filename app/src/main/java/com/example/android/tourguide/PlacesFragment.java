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
 * {@link Fragment} that displays a list of interesting places.
 */
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(
                new Card(getString(R.string.places_universityoslo_title), getString(R.string.places_universityoslo_desc), R.drawable.places_universityoslo),
                new Card(getString(R.string.places_culturalhistory_title), getString(R.string.places_culturalhistory_desc), R.drawable.places_culturalhistory),
                new Card(getString(R.string.places_operahouse_title), getString(R.string.places_operahouse_desc), R.drawable.places_operahouse),
                new Card(getString(R.string.places_royalpalace_title), getString(R.string.places_royalpalace_desc), R.drawable.places_royalpalace),
                new Card(getString(R.string.places_parliament_title), getString(R.string.places_parliament_desc), R.drawable.places_parliament),
                new Card(getString(R.string.places_vigeland_title), getString(R.string.places_vigeland_desc), R.drawable.places_vigeland),
                new Card(getString(R.string.places_reptilpark_title), getString(R.string.places_reptilpark_desc), R.drawable.places_reptilpark),
                new Card(getString(R.string.places_christianradich_title), getString(R.string.places_christianradich_desc), R.drawable.places_christianradich)
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
