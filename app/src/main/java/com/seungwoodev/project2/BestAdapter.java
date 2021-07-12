package com.seungwoodev.project2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BestAdapter extends RecyclerView.Adapter<BestAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Product_Best> list;

    public BestAdapter(Context context, ArrayList<Product_Best> list){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.basket_item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.mTextView_title.setText(list.get(position).getName());
        holder.mTextView_price.setText(String.valueOf(list.get(position).getPrice()));
        holder.mTextView_qty.setText(String.valueOf(list.get(position).getQty()));
//        holder.mImageView.setImageResource(images.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        TextView mTextView_title, mTextView_price, mTextView_qty;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.imageview);
            mTextView_title = itemView.findViewById(R.id.text_title);
            mTextView_price = itemView.findViewById(R.id.text_price);
            mTextView_qty = itemView.findViewById(R.id.text_qty);
        }
    }
}