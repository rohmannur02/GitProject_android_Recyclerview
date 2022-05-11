package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initRecyclerView();




    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add (new ModelClass(R.drawable.picis2,
                "Rohman","pa kabs?","10:45 Am","_______________________"));

        userList.add (new ModelClass(R.drawable.picis3,
                "cuplis","Sehatt atuhhh boy","10:45 Am","_______________________"));

        userList.add (new ModelClass(R.drawable.picis4,
                "si goblog","pa kabs?","10:45 Am","_______________________"));

        userList.add (new ModelClass(R.drawable.picis,
                "picisan","Sarua aing geh sehat","10:45 Am","_______________________"));

        userList.add (new ModelClass(R.drawable.picis2,
                "Rohman","pa kabs?","10:45 Am","_______________________"));

        userList.add (new ModelClass(R.drawable.picis3,
                "cuplis","kan lu udah nanya tadi","10:45 Am","_______________________"));

        userList.add (new ModelClass(R.drawable.picis4,
                "si goblog","gajelas sia kabehan","10:45 Am","_______________________"));
    }

    private void initRecyclerView() {

        recyclerView=findViewById(R.id.recyclerview);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(recyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter= new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();





    }
}