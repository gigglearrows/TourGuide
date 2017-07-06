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
                new Card("University of Oslo", "Multi-center public university, founded in 1811, with 8 faculties, 10 research centers & 3 museums.", R.drawable.places_universityoslo),
                new Card("The Norwegian Museum of Cultural History", "Large open-air collection of Medieval buildings & indoor culture & lifestyle exhibits.", R.drawable.places_culturalhistory),
                new Card("Oslo Opera House", "Home of The Norwegian National Opera and Ballet, and the national opera theatre in Norway. The building is situated in the Bjørvika neighborhood of central Oslo, at the head of the Oslofjord.", R.drawable.places_operahouse),
                new Card("The Royal Palace", "Guided tours of the 19th-century residence of the King & Queen of Norway, plus parkland visits.", R.drawable.places_royalpalace),
                new Card("Parliament of Norway", "Free guided tours are offered of this grand building, the longtime seat of Norway's Parliament.", R.drawable.places_parliament),
                new Card("The Vigeland Park", "Sculpture park & museum displaying the works of Gustav Vigeland, plus temporary art exhibitions.", R.drawable.places_vigeland),
                new Card("Oslo Reptilpark", "Reptile park also housing mammals, birds & other animals, with feeding shows, including crocodiles.", R.drawable.places_reptilpark),
                new Card("Christian Radich", "Christian Radich is a Norwegian full-rigged ship, named after a Norwegian shipowner.", R.drawable.places_christianradich)
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
