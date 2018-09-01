package com.example.divinkas.servioplacesapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.divinkas.servioplacesapp.R;

public class PlaceGroupsViewHolder extends RecyclerView.ViewHolder {
    TextView tvPlaceGroupsName;
    RecyclerView rvPlacePlaceGroupSchemas;

    public PlaceGroupsViewHolder(View itemView) {
        super(itemView);
        tvPlaceGroupsName = itemView.findViewById(R.id.tvPlaceGroupsName);
        rvPlacePlaceGroupSchemas = itemView.findViewById(R.id.rvPlacePlaceGroupSchemas);
    }
}
