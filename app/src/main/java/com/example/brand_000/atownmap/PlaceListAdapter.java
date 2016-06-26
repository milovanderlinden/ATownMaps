package com.example.brand_000.atownmap;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Brand_000 on 25/06/2016.
 *
 * Adapter for Places List
 */
public class PlaceListAdapter extends RecyclerView.Adapter<PlaceListAdapter.PlaceHolder>{

    List<MapInfo> places;

    public class PlaceHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView name;
        TextView description;

        PlaceHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.name);
            description = (TextView)itemView.findViewById(R.id.description);
        }
    }

    public PlaceListAdapter(List<MapInfo> places){
        this.places = places;
    }

    @Override
    public PlaceHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.location_card, viewGroup, false);
        PlaceHolder ph = new PlaceHolder(v);
        return ph;
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    @Override
    public void onBindViewHolder(PlaceHolder pHolder, int pos) {
        pHolder.name.setText(places.get(pos).getName());
        pHolder.description.setText(places.get(pos).getDescription());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
