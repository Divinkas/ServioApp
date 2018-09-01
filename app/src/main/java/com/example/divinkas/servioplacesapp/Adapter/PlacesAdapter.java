package com.example.divinkas.servioplacesapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.divinkas.servioplacesapp.Model.Places;
import com.example.divinkas.servioplacesapp.R;

import java.util.List;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesViewHolder> {
    List<Places> placesList;
    Context context;

    public PlacesAdapter(List<Places> list, Context context){
        placesList = list;
        this.context = context;
    }

    @NonNull
    @Override
    public PlacesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.places, parent, false);
        return new PlacesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesViewHolder holder, int position) {
        holder.tvPlaceName.setText(placesList.get(position).Name);
        holder.tvPlaceCode.setText(placesList.get(position).Code);
        holder.tvPlaceHeight.setText(String.valueOf(placesList.get(position).Height));
        holder.tvPlaceLeft.setText(String.valueOf(placesList.get(position).Left));
        holder.tvPlaceTop.setText(String.valueOf(placesList.get(position).Top));
        holder.tvPlaceWidth.setText(String.valueOf(placesList.get(position).Width));

        holder.rvBills.setLayoutManager(new LinearLayoutManager(context));
        holder.rvBills.setAdapter(new BillsAdapter(placesList.get(position).getBills(), context));
    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
