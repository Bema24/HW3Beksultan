package com.example.hw3beksultan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private com.example.hw3beksultan.Adapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Country> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        creatList();
        initRecucler();

    }

    private void creatList() {
        int id = getIntent().getIntExtra("key1", 1);
        if (111 == id) {
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_kg, "Kyrgyzstan", "Bishkek"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_kz, "Kazakstan", "Astana"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_kr, "KNDR", "Pihonia"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_tr, "Turkey", "Ankara"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_tg, "Egipet", "Kair"));


        } else if (222 == id) {
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_me, "Algir", "Algir"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_mk, "Angola", "Launda"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_jp, "Benin", "Porto"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_il, "Burundu", "Bujumburu"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_tg, "Komoro", "Moroni"));


        } else if (333 == id) {
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_jp, "Antigua", "Send-Djons" ));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_tj, "Angilia", "Valli"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_sc, "Martinka", "For-De-Frans"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_me, "Terks", "Kobern-Taun"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_sr, "Gvandelup", "Bas-Ter"));

        } else if (444 == id) {
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_sr, "Gvandelup", "Bas-Ter"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_tj, "Gvandelup", "Bas-Ter"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_jp, "Gvandelup", "Bas-Ter"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_il, "Gvandelup", "Bas-Ter"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_me, "Gvandelup", "Bas-Ter"));


        } else if (555 == id) {
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_sr, "Algir", "Algir"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_il, "Angola", "Launda"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_me, "Benin", "Porto"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_mk, "Burundu", "Bujumburu"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_jp, "Komoro", "Moroni"));

        } else if (666 == id) {
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_mk, "Antigua", "Send-Djons" ));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_sr, "Angilia", "Valli"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_sc, "Martinka", "For-De-Frans"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_me, "Terks", "Kobern-Taun"));
            arrayList.add(new com.example.hw3beksultan.Country(R.drawable.ic_tj, "Gvandelup", "Bas-Ter"));

        }
    }private void initRecucler() {
        recyclerView = findViewById(R.id.r_of_continents);
        adapter = new com.example.hw3beksultan.Adapter();
        adapter.setList(arrayList);
        recyclerView.setAdapter(adapter);


    }}
