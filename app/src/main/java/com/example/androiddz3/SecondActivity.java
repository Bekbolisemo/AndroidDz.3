package com.example.androiddz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    final private ArrayList<Conty2> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initRecyclerView();

    }
    private ArrayList<Conty2> createList() {
        int id = getIntent().getIntExtra("key",1);
        if (id >= 1 && id <= 6){

            switch (id){
                case 1:
                    list.add(new Conty2(R.drawable.ic_africa,"Австралия","Канбера"));
                    list.add(new Conty2(R.drawable.ic_africa,"Новая Зеландия","Веллингтон"));
                    break;
                case 2:
                    list.add(new Conty2(R.drawable.ic_africa,"Южная Африка","Кейптаун"));
                    list.add(new Conty2(R.drawable.ic_africa,"Нигерия","Абуджа"));
                    break;
                case 3:
                    list.add(new Conty2(R.drawable.ic_africa,"Армения","Ереван"));
                    list.add(new Conty2(R.drawable.ic_africa,"Азербайджан","Баку"));
                case 4:
                    list.add(new Conty2(R.drawable.ic_africa,"Канада","Оттава"));
                    list.add(new Conty2(R.drawable.ic_africa,"Гренландия","Нуук"));
                    break;
            }
        }else {
            Toast.makeText(this, "Error status:", Toast.LENGTH_SHORT).show();
        }
       /* if (1 == id){
            list.add(new Conty2(R.drawable.ic_africa,"Австралия","Канбера"));
            list.add(new Conty2(R.drawable.ic_africa,"Новая Зеландия","Веллингтон"));
        }else if (2 == id) {
            list.add(new Conty2(R.drawable.ic_africa,"Южная Африка","Кейптаун"));
            list.add(new Conty2(R.drawable.ic_africa,"Нигерия","Абуджа"));
        }else if (3 == id){
            list.add(new Conty2(R.drawable.ic_africa,"Армения","Ереван"));
            list.add(new Conty2(R.drawable.ic_africa,"Азербайджан","Баку"));
        }else if (4 == id){
            list.add(new Conty2(R.drawable.ic_africa,"Канада","Оттава"));
            list.add(new Conty2(R.drawable.ic_africa,"Гренландия","Нуук"));
        }else{
            Toast.makeText(this, "Error status:", Toast.LENGTH_SHORT).show();
        }*/
        return list;
    }
    private void initRecyclerView() {
        SecondActivityAdapter secondActivityAdapter = new SecondActivityAdapter();
        RecyclerView recyclerView = findViewById(R.id.recycler_View_second);
        recyclerView.setAdapter(secondActivityAdapter);
        secondActivityAdapter.updateData(createList());

    }
}