package com.tomkuenzler.skippersapp;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tom on 11/24/2015.
 */
public class CustomListAdapter extends BaseAdapter{
    private ArrayList<MenuItem> listData;
    private LayoutInflater layoutInflater;

    public CustomListAdapter(Context context, ArrayList<MenuItem> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        String instructionString = "<u>" + "Instructions" + "</u>" + ": " + listData.get(position).getInstructions();
        String ingredientString = "<u>" + "Ingredients" + "</u>" + ": " + listData.get(position).getIngredients();
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.menu_row, null);
            holder = new ViewHolder();
            holder.itemView = (TextView) convertView.findViewById(R.id.menu_item);
            holder.ingredientsView = (TextView) convertView.findViewById(R.id.menu_ingredients);
            holder.instructionsView = (TextView) convertView.findViewById(R.id.menu_instructions);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.itemView.setText(listData.get(position).getItem());
        holder.ingredientsView.setText(Html.fromHtml(ingredientString));
        //holder.ingredientsView.setText("Ingredients: " + listData.get(position).getIngredients());
        holder.instructionsView.setText(Html.fromHtml(instructionString));
        //holder.instructionsView.setText("Instructions: " + listData.get(position).getInstructions());
        if(listData.get(position).getInstructions() == null) {
            holder.instructionsView.setText("");
        }
        return convertView;
    }

    static class ViewHolder {
        TextView itemView;
        TextView ingredientsView;
        TextView instructionsView;
    }
}
