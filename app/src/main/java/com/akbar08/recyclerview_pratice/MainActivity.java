package com.akbar08.recyclerview_pratice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.akbar08.recyclerview_pratice.recyclerView.Adapter;
import com.akbar08.recyclerview_pratice.recyclerView.itemSetter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvMakananFav;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMakananFav = findViewById(R.id.mRecycleView);
        List<itemSetter> headerList = new ArrayList<itemSetter>();
        headerList.add(new itemSetter("Heboh! Pemuda bernama Akbar melakukan aksi berbahaya di jalan umum, lihat apa yang dia lakukan!", "Viva", R.drawable.foto_whatsapp));
        headerList.add(new itemSetter("Harga BBM Naik Lagi?! Cek Harganya di Sini!", "Kompas", R.drawable.foto_whatsapp));
        headerList.add(new itemSetter("Tol Cisumdawu Resmi Dibuka! Siap-siap Macet di Puncak?", "Detikcom", R.drawable.foto_whatsapp));
        headerList.add(new itemSetter("Gempa M 5,6 Guncang Cianjur! Korban Jiwa Berjatuhan?", "Tempo", R.drawable.foto_whatsapp));
        headerList.add(new itemSetter("Timnas Indonesia Bungkam Thailand! Garuda Terbang Tinggi!", "CNN Indonesia", R.drawable.foto_whatsapp));
        headerList.add(new itemSetter("Elon Musk Beli Twitter Rp 634 Triliun! Buat Apa? Cek Faktanya!", "CNBC Indonesia", R.drawable.foto_whatsapp));

        rvMakananFav.setLayoutManager(new LinearLayoutManager(this));
        rvMakananFav.setAdapter(new Adapter(getApplicationContext(), headerList));
    }
}