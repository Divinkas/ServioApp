package com.example.divinkas.servioplacesapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.divinkas.servioplacesapp.Model.PlaceGroups;
import com.example.divinkas.servioplacesapp.R;

import java.util.List;

public class PlaceGroupsAdapter extends RecyclerView.Adapter<PlaceGroupsViewHolder> {
    List<PlaceGroups> groupsList;
    Context context;

    public PlaceGroupsAdapter(List<PlaceGroups> list, Context context){
        groupsList = list;
        this.context = context;
    }

    @NonNull
    @Override
    public PlaceGroupsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.place_groups, parent, false);
        return new PlaceGroupsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceGroupsViewHolder holder, int position) {
        holder.tvPlaceGroupsName.setText(groupsList.get(position).Name);
        holder.rvPlacePlaceGroupSchemas.setLayoutManager(new LinearLayoutManager(context));
        holder.rvPlacePlaceGroupSchemas.setAdapter(
                new PlaceGroupSchemasAdapter(groupsList.get(position).PlaceGroupSchemas, context));
    }

    @Override
    public int getItemCount() {
        return groupsList.size();
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
