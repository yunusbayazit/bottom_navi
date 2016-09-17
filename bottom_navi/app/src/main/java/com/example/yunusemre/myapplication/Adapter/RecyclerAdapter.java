package com.example.yunusemre.myapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.yunusemre.myapplication.Model.food;
import com.example.yunusemre.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YunusEmre on 16.9.2016.
 */
public class RecyclerAdapter extends  RecyclerView.Adapter<RecyclerViewHolder> {

   private List<food> _food ;
    Context context;
    public RecyclerAdapter(Context context,
                           List<food> arrayList){
        this.context = context;
        this._food = arrayList;

    }


    @Override
    public int getItemCount() {
        return (null != _food ? _food.size() : 0);

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder,
                                 final int position) {
        final RecyclerViewHolder mainHolder = (RecyclerViewHolder) holder;
        //Setting text over textview
        mainHolder.foodName.setText(_food.get(position).getFoodName());
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(
            ViewGroup viewGroup, int viewType) {
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());

        ViewGroup mainGroup = (ViewGroup) mInflater.inflate(
                R.layout.item_layout, viewGroup, false);
        RecyclerViewHolder mainHolder = new RecyclerViewHolder(mainGroup) {
            @Override
            public String toString() {
                return super.toString();
            }
        };


        return mainHolder;

    }
}