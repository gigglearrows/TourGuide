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
 * {@link Fragment} that displays a list of hotels.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<>();
        cards.addAll(Arrays.asList(
                new Card("Radisson Blu Plaza Hotel, Oslo", "4-star hotel. Contemporary lodging with free Wi-Fi & breakfast, plus a gym, a sauna & an indoor pool.", R.drawable.hotel_plaza),
                new Card("Clarion Collection Hotel Folketeateret", "4-star hotel. Contemporary rooms & duplex suites in an art deco hotel with a bar & free breakfast.", R.drawable.hotel_folketeateret),
                new Card("Anker Apartment", "2-star hotel. Laid-back hostel with colorful rooms & dorms, plus a grocery store, a bar & a rooftop terrace.", R.drawable.hotel_anker),
                new Card("Comfort Hotel Xpress Youngstorvet", "4-star hotel. Vibrant, modern hotel with a gym open 24 hours, a rooftop terrace & a lobby shop.", R.drawable.hotel_youngstorget),
                new Card("Scandic Vulkan", "4-star hotel. Eclectic rooms in a modern hotel with an informal restaurant & bar, plus a fitness center.", R.drawable.hotel_vulkan),
                new Card("Scandic St. Olavs plass", "3-star hotel. Straightforward, modern rooms, plus a retro-style bar, a playroom & a gym with a sauna.", R.drawable.hotel_olavsplass),
                new Card("Thon Hotel Opera", "4-star hotel. Colorful rooms & suites, plus a free breakfast buffet, an international restaurant & a fitness room.", R.drawable.hotel_opera),
                new Card("Smarthotel Oslo", "3-star hotel. Chic hotel offering a bar, a dining room, a rooftop terrace & a bohemian outdoor seating area.", R.drawable.hotel_smarthotel)
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
