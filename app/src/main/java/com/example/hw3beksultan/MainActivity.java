package com.example.hw3beksultan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Country> arrayList;
    private Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createFlags();
        initrv();
        setClick();
        createRegion();

    }

    private void createRegion() {

    }

    private void setClick() {
        adapter.setListener(country -> {

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("key1", country.getId());
            startActivity(intent);
        });
    }



    private void createFlags() {
        arrayList = new ArrayList<>();
        arrayList.add(new Country(R.drawable.ic_caf,"Eurasia","", 111));

        arrayList.add(new Country(R.drawable.ic_cas,"Africa","", 222));

        arrayList.add(new Country(R.drawable.ic_ceu,"North America","", 333));

        arrayList.add(new Country(R.drawable.ic_csa,"South America","",444));

        arrayList.add(new Country(R.drawable.ic_sever_am,"Australia","",555));

        arrayList.add(new Country(R.drawable.ic_coc,"Antarktica","",666));

    }

    private void initrv() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        adapter = new Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);
    }}