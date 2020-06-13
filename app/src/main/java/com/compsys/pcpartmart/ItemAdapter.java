package com.compsys.pcpartmart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private static class ViewHolder{
        public ImageView ivImage;
        public TextView tvName;
        public TextView tvPrice;
    }

    public ItemAdapter(Context context, ArrayList<Item> aItems) {
        super(context, 0, aItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get item data for current position
        final Item curryItem = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder.ivImage = (ImageView)convertView.findViewById(R.id.ivItemImage);
            viewHolder.tvPrice = (TextView)convertView.findViewById(R.id.tvItemPrice);
            viewHolder.tvName = (TextView)convertView.findViewById(R.id.tvItemName);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        // Populate the data into the template view using the data object
        viewHolder.tvName.setText(curryItem.getName());
        viewHolder.tvPrice.setText(curryItem.getPrice());

        int resID = curryItem.getImage(0);
        viewHolder.ivImage.setImageResource(resID);

        return convertView;
    }

}
