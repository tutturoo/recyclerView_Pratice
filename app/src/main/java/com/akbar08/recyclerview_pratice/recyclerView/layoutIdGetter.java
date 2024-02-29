package com.akbar08.recyclerview_pratice.recyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.akbar08.recyclerview_pratice.R;

public class layoutIdGetter extends RecyclerView.ViewHolder {

    ImageView newsThumbnailVW;
    TextView newsTitleVW,newsPublisherVW;

    public layoutIdGetter(@NonNull View itemView) {
        super(itemView);
        newsThumbnailVW = itemView.findViewById(R.id.icon_thumbnail);
        newsTitleVW = itemView.findViewById(R.id.text_header);
        newsPublisherVW = itemView.findViewById(R.id.text_publishername);
    }
}
