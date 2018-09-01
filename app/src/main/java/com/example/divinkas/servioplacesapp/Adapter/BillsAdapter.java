package com.example.divinkas.servioplacesapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.divinkas.servioplacesapp.Model.Bills;
import com.example.divinkas.servioplacesapp.R;

import java.util.List;

public class BillsAdapter extends RecyclerView.Adapter<BillsViewHolder> {
    List<Bills> billsList;
    Context context;

    public BillsAdapter(List<Bills> list, Context context){
        billsList = list;
        this.context = context;
    }
    @NonNull
    @Override
    public BillsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bills, parent, false);
        return new BillsViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull BillsViewHolder holder, int position) {
        holder.tvBillsNumber.setText(String.valueOf(billsList.get(position).Number));
        holder.tvBillsOpened.setText(billsList.get(position).Opened);
        holder.tvBillsOpenUser.setText(billsList.get(position).OpenUser);
        holder.tvBillsTotal.setText(String.valueOf(billsList.get(position).Total) + "грн." );
    }

    @Override
    public int getItemCount() {
        return billsList.size();
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
