package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * mhm
 */

public class CardAdapter extends ArrayAdapter<Card> {

    public CardAdapter(Activity context, ArrayList<Card> cards) {
        super(context, 0, cards);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Card currentEntry = getItem(position);

        TextView itemDescription = listItemView.findViewById(R.id.item_description);
        TextView itemTitle = listItemView.findViewById(R.id.item_title);
        ImageView image = listItemView.findViewById(R.id.image);

        itemDescription.setText(currentEntry.getDescription());
        itemTitle.setText(currentEntry.getTitle());
        if (currentEntry.hasImage()) {
            Picasso.with(getContext()).load(currentEntry.getImageResourceId()).into(image);
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
