package com.example.divinkas.servioplacesapp.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.divinkas.servioplacesapp.R;

public class BillsViewHolder extends RecyclerView.ViewHolder {
    TextView tvBillsNumber, tvBillsTotal, tvBillsOpenUser, tvBillsOpened;

    public BillsViewHolder(View itemView) {
        super(itemView);
        tvBillsNumber = itemView.findViewById(R.id.tvBillsNumber);
        tvBillsTotal = itemView.findViewById(R.id.tvBillsTotal);
        tvBillsOpenUser = itemView.findViewById(R.id.tvBillsOpenUser);
        tvBillsOpened = itemView.findViewById(R.id.tvBillsOpened);
    }
}
