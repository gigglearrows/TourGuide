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
                new Card("Guided tour of the Parliament building", "7 Jul 2017, 13:00\n" + "Guided tour in English at the Norwegian Parliament building, Stortinget. The tour is free, lasts for about 45 minutes and is open for everyone.", R.drawable.events_parliament),
                new Card("Summer Celebration Party", "8 Jul 2017, 21:00\n" + "Summer Celebration Party at Cafe Amsterdam. Indonesian Kitchen will serve great street food, there will be special summer drinks in the bar and a DJ will make you dance the night away. Free entrance.", R.drawable.events_amsterdam),
                new Card("Guided tour of the Botanical Garden", "2 Jul - 30 Jul 2017, 14:00 - 15:00\n" + "The tour comprises a general introduction to the garden, including its themes, history, Tøyen hovedgård (one of the oldest wooden houses in Oslo), and of course information about trees, flowers and other plants growing in the garden.", R.drawable.events_botanical),
                new Card("Guided tour of the Oslo University campus", "29 Jun - 24 Aug 2017, 11:00 - 12:00\n" + "The tour takes you through the main campus called Blindern, where the university's guides inform you about faculties, study options, student life, art installations and history of the University.", R.drawable.events_oslouniversity)
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
