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
 * {@link Fragment} that displays a list of events.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(
                new Card(getString(R.string.events_parliament_title), getString(R.string.events_parliament_desc), R.drawable.events_parliament),
                new Card(getString(R.string.events_amsterdam_title), getString(R.string.events_amsterdam_desc), R.drawable.events_amsterdam),
                new Card(getString(R.string.events_botanical_title), getString(R.string.events_botanical_desc), R.drawable.events_botanical),
                new Card(getString(R.string.events_oslouniversity_title), getString(R.string.events_oslouniversity_desc), R.drawable.events_oslouniversity)
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
