package com.example.androiddz3.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.androiddz3.R;
import com.example.androiddz3.second.SecondActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainActivityAdapter.onClick {

    private RecyclerView recyclerView;
    private MainActivityAdapter adapter;
    private ArrayList<Contry> List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List = new ArrayList<>();
        List.add(new Contry(getString(R.string.oceania),R.drawable.ic_oceania,1));
        List.add(new Contry(getString(R.string.africa),R.drawable.ic_africa,2));
        List.add(new Contry(getString(R.string.eurasia),R.drawable.ic_eurasia,3));
        List.add(new Contry(getString(R.string.north_america),R.drawable.ic_north_usa,4));
        List.add(new Contry(getString(R.string.south_america),R.drawable.ic_south_america,5));
        initRecyclerView();

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler_View);
        adapter = new MainActivityAdapter();
        adapter.updateData(List,this);
        recyclerView.setAdapter(adapter);

    }

     @Override
    public void onItemClick(Contry contry) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key",contry.getId());
        startActivity(intent);
    }
}
