package com.example.androiddz3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondActivityAdapter extends RecyclerView.Adapter<SecondActivityAdapter.ViewHolder> {
    private ArrayList<Conty2> list = new ArrayList<>();

    public void updateData(ArrayList<Conty2> List){
       this.list.addAll(List);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView strana,gorod;
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_second);
            strana = itemView.findViewById(R.id.namestr);
            gorod = itemView.findViewById(R.id.gorod);
        }
        public void bind(Conty2 conty2){
            strana.setText(conty2.getStrana());
            gorod.setText(conty2.getGorod());
            imageView.setImageResource(conty2.getImageView());
        }

    }


}
