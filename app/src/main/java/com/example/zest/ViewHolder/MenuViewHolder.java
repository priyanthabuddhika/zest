package com.example.zest.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zest.Interface.ItemClickListener;
import com.example.zest.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;


    private ItemClickListener itemClickListener;



        public MenuViewHolder(@NonNull View itemView) {

            super(itemView);

            txtMenuName=(TextView)itemView.findViewById(R.id.menu_name);
            imageView =(ImageView)itemView.findViewById(R.id.menu_image);

            itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener){
            this.itemClickListener=itemClickListener;
        }

        @Override
        public void onClick(View v) {
            itemClickListener.onClick(v,getAdapterPosition(),false);

        }
    }


