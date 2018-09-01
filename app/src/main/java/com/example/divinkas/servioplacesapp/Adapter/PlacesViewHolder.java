package com.example.divinkas.servioplacesapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.divinkas.servioplacesapp.R;

public class PlacesViewHolder extends RecyclerView.ViewHolder {
    TextView tvPlaceName, tvPlaceCode, tvPlaceLeft, tvPlaceTop, tvPlaceWidth, tvPlaceHeight;
    RecyclerView rvBills;
    public PlacesViewHolder(View itemView) {
        super(itemView);
        tvPlaceCode = itemView.findViewById(R.id.tvPlaceCode);
        tvPlaceName = itemView.findViewById(R.id.tvPlaceName);
        tvPlaceLeft = itemView.findViewById(R.id.tvPlaceLeft);
        tvPlaceTop = itemView.findViewById(R.id.tvPlaceTop);
        tvPlaceWidth = itemView.findViewById(R.id.tvPlaceWidth);
        tvPlaceHeight = itemView.findViewById(R.id.tvPlaceHeight);
        rvBills = itemView.findViewById(R.id.rvBills);
    }
}
