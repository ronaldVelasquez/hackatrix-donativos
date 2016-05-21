package devy.com.donemos.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tismart.tsmviews.views.CustomButton;

import java.util.ArrayList;

import devy.com.donemos.R;
import devy.com.donemos.adapters.RecyclerItemAdapter;
import devy.com.donemos.entidades.ItemEntity;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListItemFragment extends Fragment {

    private RecyclerView rvItems;
    private RecyclerItemAdapter adapter;
    private ArrayList<ItemEntity> entities;
    private CustomButton btnDonate;

    public ListItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_items, container, false);
        rvItems = (RecyclerView) view.findViewById(R.id.rv_items);
        btnDonate = (CustomButton) view.findViewById(R.id.btn_donate);
        entities = new ArrayList<>();
        adapter = new RecyclerItemAdapter(entities);
        rvItems.setAdapter(adapter);
        rvItems.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
