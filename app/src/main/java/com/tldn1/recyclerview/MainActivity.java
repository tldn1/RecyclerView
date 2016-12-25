package com.tldn1.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tldn1.recyclerview.Adapter.RecyclerViewAdapter;
import com.tldn1.recyclerview.Model.RecyclerViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<RecyclerViewModel> arrayList = new ArrayList<RecyclerViewModel>();
    String[] name = {"Muamer","Zoran","Mile","Dragan","Semir","Muamer","Zoran","Mile","Dragan","Semir","Muamer","Zoran","Mile","Dragan","Semir"};
    String[] lName = {"Beginovic","Tintor","Cacanovic","Komarica","Salihbasic","Beginovic","Tintor","Cacanovic","Komarica","Salihbasic","Beginovic","Tintor","Cacanovic","Komarica","Salihbasic"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        for(int i=0;i<name.length;i++){
            arrayList.add(new RecyclerViewModel(name[i],lName[i]));
        }
        adapter = new RecyclerViewAdapter(arrayList);
        recyclerView.setAdapter(adapter);

    }
}
