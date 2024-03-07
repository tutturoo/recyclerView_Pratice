package com.akbar08.recyclerview_pratice.recyclerView;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akbar08.recyclerview_pratice.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.layoutIdGetter>{

    Context konteks;
    private ItemClickListener mClickListener;
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
        Glide.with(holder.itemView.getContext()).load(item.get(position).getImgUrl()).into(holder.newsThumbnailVW);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class layoutIdGetter extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView newsThumbnailVW;
        TextView newsTitleVW, newsPublisherVW;

        public layoutIdGetter(@NonNull View itemView) {
            super(itemView);
            newsThumbnailVW = itemView.findViewById(R.id.icon_thumbnail);
            newsTitleVW = itemView.findViewById(R.id.text_header);
            newsPublisherVW = itemView.findViewById(R.id.text_publishername);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
        }
    }
