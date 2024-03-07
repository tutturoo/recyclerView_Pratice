package com.akbar08.recyclerview_pratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.akbar08.recyclerview_pratice.recyclerView.Adapter;
import com.akbar08.recyclerview_pratice.recyclerView.itemSetter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Adapter.ItemClickListener{
    RecyclerView rvMakananFav;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMakananFav = findViewById(R.id.mRecycleView);
        List<itemSetter> headerList = new ArrayList<itemSetter>();
        headerList.add(new itemSetter("Heboh! Pemuda bernama Akbar melakukan aksi berbahaya di jalan umum, lihat apa yang dia lakukan!", "Viva", "https://cdn.discordapp.com/attachments/719779367911292938/1214929883294076933/photo-1603696774332-6dcf0e5aa964.png?ex=65fae6a0&is=65e871a0&hm=145df50e24f545b7e20c302cf99c47ff8f374a4a3cb33d3ecc7176581722d137&"));
        headerList.add(new itemSetter("Harga BBM Naik Lagi?! Cek Harganya di Sini!", "Kompas", "https://cdn.discordapp.com/attachments/719779367911292938/1214930046754623508/photo-1615226882893-17520863eb04.png?ex=65fae6c7&is=65e871c7&hm=c2d3a43e3f62b08495a8744ab023f96ca548b306062595852ce2d37294e4013d&"));
        headerList.add(new itemSetter("Tol Cisumdawu Resmi Dibuka! Siap-siap Macet di Puncak?", "Detikcom", "https://cdn.discordapp.com/attachments/719779367911292938/1214930247720636436/photo-1611938845621-f7d331a14255.png?ex=65fae6f7&is=65e871f7&hm=0d9dbe24369ca88b98a4bef5e03a1c1017e61a8c74dd3508dd7d39a65caa1348&"));
        headerList.add(new itemSetter("Gempa M 5,6 Guncang Cianjur! Korban Jiwa Berjatuhan?", "Tempo", "https://cdn.discordapp.com/attachments/719779367911292938/1214930421633122345/photo-1703130355553-f5c181f5ae98.png?ex=65fae720&is=65e87220&hm=260fc88aa4c00fd66f3c9a9caaa49c88f3b9ba241410d560fabd47dbe73a5029&"));
        headerList.add(new itemSetter("Timnas Indonesia Bungkam Thailand! Garuda Terbang Tinggi!", "CNN Indonesia", "https://cdn.discordapp.com/attachments/719779367911292938/1214930547306922104/photo-1617686436005-5165ec513482.png?ex=65fae73e&is=65e8723e&hm=2700218d9e76a7e25087f33cbe77f7af57d60a23544cc6f67bdcf7bb626a00b0&"));
        headerList.add(new itemSetter("Elon Musk Beli Twitter Rp 634 Triliun! Buat Apa? Cek Faktanya!", "CNBC Indonesia", "https://cdn.discordapp.com/attachments/719779367911292938/1214930692295884882/photo-1616469829167-0bd76a80c913.png?ex=65fae761&is=65e87261&hm=76a53db40912601f62e169776a2e9431b253e7c7bb43f9383c53119cd2db4557&"));

        rvMakananFav.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, headerList);
        adapter.setClickListener(this);
        rvMakananFav.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "Row number " + position, Toast.LENGTH_SHORT).show();
    }
}