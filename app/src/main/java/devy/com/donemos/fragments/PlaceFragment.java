package devy.com.donemos.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import devy.com.donemos.R;
import devy.com.donemos.adapters.RecyclerItemAdapter;
import devy.com.donemos.adapters.RecyclerPlacesAdapter;
import devy.com.donemos.entidades.ItemEntity;
import devy.com.donemos.entidades.PlaceEntity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceFragment extends Fragment {

    private RecyclerView rvPlaces;
    private ArrayList<PlaceEntity> listPlaces;
    private RecyclerPlacesAdapter adapter;



    public PlaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_place, container, false);
        rvPlaces  = (RecyclerView) view.findViewById(R.id.rvPlaces);
        listPlaces = new ArrayList<>();
        //listPlaces.add(new PlaceEntity());
        adapter = new RecyclerPlacesAdapter(listPlaces);
        rvPlaces.setAdapter(adapter);
        rvPlaces.setLayoutManager(new LinearLayoutManager(getContext()));

        // Inflate the layout for this fragment
        return view;
    }

}
