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
                new Card("Ekebergrestauranten", "Eclectic European cuisine, chic dining rooms & terraces in a modernist, 1920s hillside restaurant.", R.drawable.restaurant_ekebergrestauranten),
                new Card("Maaemo", "Norwegian menu with wine pairings, in minimalist setting.", R.drawable.restaurant_maaemo),
                new Card("Engebret Cafe", "Traditional Norwegian cuisine in elegant, white tablecloth dining room in an 18th-century building.", R.drawable.restaurant_engebretcafe),
                new Card("Solsiden Restaurant", "Excellent seafood. Good view and nice atmosphere.", R.drawable.restaurant_solsiden),
                new Card("Mehfel Restaurant", "Sophisticated, white-tablecloth restaurant serving menu of traditional Indian cuisine.", R.drawable.restaurant_mehfel),
                new Card("Lofoten Fish Restaurant", "Seasonal fish & seafood menus in glass-fronted, white-tablecloth restaurant next to the harbor.", R.drawable.restaurant_lofotenfish),
                new Card("Jaipur Restaurant", "Expansive, traditional Indian menu offered in a restaurant decorated with wall hangings & pictures.", R.drawable.restaurant_jaipur),
                new Card("Brasserie France", "French-style brasserie with 3 levels & sidewalk terrace tables, offering traditional cuisine.", R.drawable.restaurant_brasseriefrance),
                new Card("Hanami", "Chic, contemporary, waterside Japanese restaurant specialising in sushi & robata grill dishes.", R.drawable.restaurant_hanami),
                new Card("Arakataka", "Seasonal Nordic & international cuisine in contemporary room with designer lighting & open kitchen.", R.drawable.restaurant_arakataka)
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
