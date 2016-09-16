package com.example.yunusemre.myapplication.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.yunusemre.myapplication.R;

/**
 * Created by YunusEmre on 16.9.2016.
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView foodName;
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        this.foodName = (TextView) itemView.findViewById(R.id.foodName);
    }
}