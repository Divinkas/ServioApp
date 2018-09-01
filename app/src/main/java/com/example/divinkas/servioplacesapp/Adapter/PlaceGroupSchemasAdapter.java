package com.example.divinkas.servioplacesapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.divinkas.servioplacesapp.Model.PlaceGroupSchemas;
import com.example.divinkas.servioplacesapp.R;

import java.util.List;

public class PlaceGroupSchemasAdapter extends RecyclerView.Adapter<PlaceGroupSchemasViewHolder> {
    List<PlaceGroupSchemas> groupSchemasList;
    Context context;

    public PlaceGroupSchemasAdapter(List<PlaceGroupSchemas> list, Context context){
        groupSchemasList = list;
        this.context = context;
    }

    @NonNull
    @Override
    public PlaceGroupSchemasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.place_group_schemas, parent, false);
        return new PlaceGroupSchemasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceGroupSchemasViewHolder holder, int position) {
        holder.tvPlaceGroupSchemasName.setText(groupSchemasList.get(position).Name);
        holder.rvPlaces.setLayoutManager(new LinearLayoutManager(context));
        holder.rvPlaces.setAdapter(new PlacesAdapter(groupSchemasList.get(position).Places, context));
    }

    @Override
    public int getItemCount() {
        return groupSchemasList.size();
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
