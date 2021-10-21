package com.example.androiddz3.second;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androiddz3.R;
import com.example.androiddz3.main.Contry;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private final ArrayList<Contry> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initRecyclerView();

    }
    private ArrayList<Contry> createList() {
        int id = getIntent().getIntExtra("key",1);
        if (id >= 1 && id <= 6){
            switch (id){
                case 1:
                    list.add(new Contry(R.drawable.ic_australia,getString(R.string.Australia),getString(R.string.Canberra)));
                    list.add(new Contry(R.drawable.ic_new_zealand,getString(R.string.New_Zealand),getString(R.string.Wellington)));
                    list.add(new Contry(R.drawable.ic_fiji,getString(R.string.Fiji),getString(R.string.Suva)));
                    list.add(new Contry(R.drawable.ic_samoa,getString(R.string.Samoa),getString(R.string.Apia)));
                    list.add(new Contry(R.drawable.ic_tonga,getString(R.string.Tonga),getString(R.string.Nukualofa)));
                    list.add(new Contry(R.drawable.ic_palau,getString(R.string.Palau),getString(R.string.Ngerulmud)));
                    list.add(new Contry(R.drawable.ic_vanuatu,getString(R.string.Vanuatu),getString(R.string.Port_Vila)));
                    list.add(new Contry(R.drawable.ic_papua_new_guinea,getString(R.string.Papua_New_Guinea),getString(R.string.Port_Moresby)));
                    list.add(new Contry(R.drawable.ic_french_polynesia,getString(R.string.French_polynesia),getString(R.string.Papeete)));
                    list.add(new Contry(R.drawable.ic_cook_lslands, getString(R.string.Cook_Islands),getString(R.string.Avarua)));
                    break;
                case 2:
                    list.add(new Contry(R.drawable.ic_south_africa,getString(R.string.South_Africa),getString(R.string.Cape_Town)));
                    list.add(new Contry(R.drawable.ic_nigeria,getString(R.string.Nigeria),getString(R.string.Abuja)));
                    list.add(new Contry(R.drawable.ic_ghana,getString(R.string.Ghana),getString(R.string.Accra)));
                    list.add(new Contry(R.drawable.ic_kenya,getString(R.string.Kenya),getString(R.string.Nairobi)));
                    list.add(new Contry(R.drawable.ic_ethiopia,getString(R.string.Ethiopia),getString(R.string.Addis_Ababa)));
                    list.add(new Contry(R.drawable.ic_tanzania,getString(R.string.Tanzania),getString(R.string.Dodoma)));
                    list.add(new Contry(R.drawable.ic_morocco,getString(R.string.Morocco),getString(R.string.Rabat)));
                    list.add(new Contry(R.drawable.ic_sudan,getString(R.string.Sudan),getString(R.string.Khartoum)));
                    list.add(new Contry(R.drawable.ic_dr_congo,getString(R.string.DR_Congo),getString(R.string.Kinshasa)));
                    list.add(new Contry(R.drawable.ic_senegal,getString(R.string.Senegal),getString(R.string.Dakar)));
                    break;
                case 3:
                    list.add(new Contry(R.drawable.ic_germany,getString(R.string.Germany),getString(R.string.Berlin)));
                    list.add(new Contry(R.drawable.ic_armenia,getString(R.string.Armenia),getString(R.string.Yerevan)));
                    list.add(new Contry(R.drawable.ic_azerbaijan,getString(R.string.Azerbaijan),getString(R.string.Baku)));
                    list.add(new Contry(R.drawable.ic_italy ,getString(R.string.Italy),getString(R.string.Rome)));
                    list.add(new Contry(R.drawable.ic_united_kingdom,getString(R.string.United_Kingdom),getString(R.string.London)));
                    list.add(new Contry(R.drawable.ic_kyrgyzstan,getString(R.string.Kyrgyzstan),getString(R.string.Bishkek)));
                    list.add(new Contry(R.drawable.ic_kz,getString(R.string.Kazakhstan),getString(R.string.Nur_Sultan)));
                    list.add(new Contry(R.drawable.ic_lithuania,getString(R.string.Lithuania),getString(R.string.Vilnius)));
                    list.add(new Contry(R.drawable.ic_uzbekistan,getString(R.string.Uzbekistan), getString(R.string.Tashkent)));
                    list.add(new Contry(R.drawable.ic_ukraine,getString(R.string.Ukraine),getString(R.string.Kiev)));

                case 4:
                    list.add(new Contry(R.drawable.ic_canada,getString(R.string.Canada),getString(R.string.Ottawa)));
                    list.add(new Contry(R.drawable.ic_netherlands,getString(R.string.Netherlands),getString(R.string.Amsterdam)));
                    list.add(new Contry(R.drawable.ic_greece, getString(R.string.Greece),getString(R.string.Athens)));
                    list.add(new Contry(R.drawable.ic_switzerland,getString(R.string.Switzerland),getString(R.string.Berne)));
                    list.add(new Contry(R.drawable.ic_poland,getString(R.string.Poland),getString(R.string.Warsaw)));
                    list.add(new Contry(R.drawable.ic_austria,getString(R.string.Austria),getString(R.string.Vein)));
                    list.add(new Contry(R.drawable.ic_belgium,getString(R.string.Belgium),getString(R.string.Brussels)));
                    list.add(new Contry(R.drawable.ic_denmark,getString(R.string.Denmark),getString(R.string.Copenhagen)));
                    list.add(new Contry(R.drawable.ic_puerto_rico,getString(R.string.Puerto_Rico),getString(R.string.San_Juan)));
                    list.add(new Contry(R.drawable.ic_costa_rica,getString(R.string.Costa_Rica),getString(R.string.San_Jose)));
                    break;
                case 5:
                    list.add(new Contry(R.drawable.ic_colombia,getString(R.string.Colombia),getString(R.string.Bogota)));
                    list.add(new Contry(R.drawable.ic_peru,getString(R.string.Peru),getString(R.string.Lima)));
                    list.add(new Contry(R.drawable.ic_chile,getString(R.string.Chile),getString(R.string.Santiago)));
                    list.add(new Contry(R.drawable.ic_ecuador,getString(R.string.Ecuador),getString(R.string.Quito)));
                    list.add(new Contry(R.drawable.ic_bolivia,getString(R.string.Bolivia),getString(R.string.La_Paz)));
                    list.add(new Contry(R.drawable.ic_guyana,getString(R.string.Guyana),getString(R.string.Georgetown)));
                    list.add(new Contry(R.drawable.ic_uruguay,getString(R.string.Uruguay),getString(R.string.Montevideo)));
                    list.add(new Contry(R.drawable.ic_suriname,getString(R.string.Suriname), getString(R.string.Paramaribo)));
                    list.add(new Contry(R.drawable.ic_trinidad_and_tobago,getString(R.string.Trinidad_and_Tobago),getString(R.string.Port_of_Spain)));
                    list.add(new Contry(R.drawable.ic_aruba,getString(R.string.Aruba),getString(R.string.Oranjestad)));
                    break;
            }
        }else {
            Toast.makeText(this,getString(R.string.Error), Toast.LENGTH_SHORT).show();
        } 
        return list;
    }
    private void initRecyclerView() {
        SecondActivityAdapter secondActivityAdapter = new SecondActivityAdapter();
        RecyclerView recyclerView = findViewById(R.id.recycler_View_second);
        recyclerView.setAdapter(secondActivityAdapter);
        secondActivityAdapter.updateData(createList());

    }
}