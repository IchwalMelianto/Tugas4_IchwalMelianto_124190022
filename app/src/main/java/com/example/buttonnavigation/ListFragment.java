package com.example.buttonnavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<CatalogModel> listItem = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.rvCon);
        recyclerView.setHasFixedSize(true);
        listItem.addAll(CatalogData.getListDataM());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        CatalogAdapter catalogAdapter = new CatalogAdapter(CatalogData.getListDataM(), getActivity());
        recyclerView.setAdapter(catalogAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }
}