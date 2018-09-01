package com.example.divinkas.servioplacesapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.divinkas.servioplacesapp.R;

public class PlaceUnionsViewHolder extends RecyclerView.ViewHolder {
    TextView tvPlaceUnionsName;
    RecyclerView rvPlaceGroups;

    public PlaceUnionsViewHolder(View itemView) {
        super(itemView);
        tvPlaceUnionsName = itemView.findViewById(R.id.tvPlaceUnionsName);
        rvPlaceGroups = itemView.findViewById(R.id.rvPlaceGroups);
    }
}
