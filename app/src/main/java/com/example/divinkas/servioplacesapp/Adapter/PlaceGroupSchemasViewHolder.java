package com.example.divinkas.servioplacesapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.divinkas.servioplacesapp.R;

public class PlaceGroupSchemasViewHolder extends RecyclerView.ViewHolder {
    TextView tvPlaceGroupSchemasName;
    RecyclerView rvPlaces;

    public PlaceGroupSchemasViewHolder(View itemView) {
        super(itemView);
        rvPlaces = itemView.findViewById(R.id.rvPlaces);
        tvPlaceGroupSchemasName = itemView.findViewById(R.id.tvPlaceGroupSchemasName);
    }
}
