package com.example.yunusemre.myapplication.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yunusemre.myapplication.Adapter.RecyclerAdapter;
import com.example.yunusemre.myapplication.Model.food;
import com.example.yunusemre.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YunusEmre on 16.9.2016.
 */
public class onefragment extends android.support.v4.app.Fragment {
    private static RecyclerView recyclerView;
    private View view;
    private List<food> pliste= new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.onefragment,container,false);
        setRecyclerView();
        return view;

    }
    private void setRecyclerView() {

        recyclerView = (RecyclerView) view
                .findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView
                .setLayoutManager(new LinearLayoutManager(getActivity()));//Linear Items
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));
        pliste.add(new food("Edirne Ciğeri"));


        RecyclerAdapter adapter = new RecyclerAdapter(getActivity(), pliste);
        recyclerView.setAdapter(adapter);// set adapter on recyclerview
        recyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 2));
    }
}
