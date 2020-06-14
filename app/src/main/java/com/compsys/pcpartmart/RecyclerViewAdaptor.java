package com.compsys.pcpartmart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder> {

    // To make your view item clickable ensure that the view holder class implements View.OnClickListener and it has the onClick(View v) method.
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // Declare objects of all the views to be manipulated in item_contact.xml
        public TextView topPickTextView;
        public ImageView topPickImageView;

        public ViewHolder(View v) {
            super(v);
            v.setOnClickListener(this);
            // Initialize the view objects
            topPickTextView = v.findViewById(R.id.top_pick_text_view);
            topPickImageView = v.findViewById((R.id.top_pick_image_view));
        }

        @Override
        public void onClick(View v) {
            // What to do when the view item is clicked
            Item clickedContact = mContacts.get(getAdapterPosition());
            Toast.makeText(mContext, clickedContact.getName() + " is clicked in position " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
        }
    }

    // Declare the data collection object that holds the data to be populated in the RecyclerView
    private List<Item> mContacts;
    private Context mContext;

    // Pass in the contact array object into the constructor
    public RecyclerViewAdaptor(List<Item> contacts) {
        // The contacts object is sent via the activity that creates this adaptor
        mContacts = contacts;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public RecyclerViewAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.top_pick_item, parent, false);

        // Return a new holder instance
        ViewHolder holder = new ViewHolder(contactView);
        return holder;
    }

    // This method populates the data from mContacts to the view items
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdaptor.ViewHolder holder, int position) {
        // Get the data object for the item view in this position
        Item thisContact = mContacts.get(position);

        holder.topPickTextView.setText(thisContact.getName());
        int resID = thisContact.getImage(0);
        holder.topPickImageView.setImageResource(resID);
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }


}