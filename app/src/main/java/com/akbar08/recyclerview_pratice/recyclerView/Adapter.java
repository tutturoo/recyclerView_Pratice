package com.akbar08.recyclerview_pratice.recyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akbar08.recyclerview_pratice.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<layoutIdGetter>{

    Context konteks;
    List<itemSetter> item;

    public Adapter(Context konteks, List<itemSetter> item) {
        this.konteks = konteks;
        this.item = item;
    }


    @NonNull
    @Override
    public layoutIdGetter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new layoutIdGetter(LayoutInflater.from(konteks).inflate(R.layout.recyclerview_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull layoutIdGetter holder, int position) {
        holder.newsTitleVW.setText(item.get(position).getNewsTitleHeader());
        holder.newsPublisherVW.setText(item.get(position).getNewsPublisherName());
        holder.newsThumbnailVW.setImageResource(item.get(position).getNewsThumbnail());

    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
