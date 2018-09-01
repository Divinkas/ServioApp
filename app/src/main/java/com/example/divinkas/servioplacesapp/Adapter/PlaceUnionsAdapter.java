package com.example.divinkas.servioplacesapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.divinkas.servioplacesapp.Model.PlaceUnions;
import com.example.divinkas.servioplacesapp.R;

import java.util.List;

public class PlaceUnionsAdapter extends RecyclerView.Adapter<PlaceUnionsViewHolder> {
    List<PlaceUnions> placeUnionsList;
    Context context;

    public PlaceUnionsAdapter(List<PlaceUnions> placeUnionsList, Context context) {
        this.placeUnionsList = placeUnionsList;
        this.context = context;
    }

    @NonNull
    @Override
    public PlaceUnionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.place_unions, parent,false);
        return new PlaceUnionsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceUnionsViewHolder holder, int position) {
        holder.tvPlaceUnionsName.setText(placeUnionsList.get(position).Name);
        holder.rvPlaceGroups.setLayoutManager(new LinearLayoutManager(context));
        holder.rvPlaceGroups.setAdapter(new PlaceGroupsAdapter(placeUnionsList.get(position).PlaceGroups, context));
    }

    @Override
    public int getItemCount() {
        return placeUnionsList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
