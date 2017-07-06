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
                new Card(getString(R.string.hotel_plaza_title), getString(R.string.hotel_plaza_desc), R.drawable.hotel_plaza),
                new Card(getString(R.string.hotel_folketeateret_title), getString(R.string.hotel_folketeateret_desc), R.drawable.hotel_folketeateret),
                new Card(getString(R.string.hotel_anker_title), getString(R.string.hotel_anker_desc), R.drawable.hotel_anker),
                new Card(getString(R.string.hotel_youngstorget_title), getString(R.string.hotel_youngstorget_desc), R.drawable.hotel_youngstorget),
                new Card(getString(R.string.hotel_vulkan_title), getString(R.string.hotel_vulkan_desc), R.drawable.hotel_vulkan),
                new Card(getString(R.string.hotel_olavsplass_title), getString(R.string.hotel_olavsplass_desc), R.drawable.hotel_olavsplass),
                new Card(getString(R.string.hotel_opera_title), getString(R.string.hotel_opera_desc), R.drawable.hotel_opera),
                new Card(getString(R.string.hotel_smarthotel_title), getString(R.string.hotel_smarthotel_desc), R.drawable.hotel_smarthotel)
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
