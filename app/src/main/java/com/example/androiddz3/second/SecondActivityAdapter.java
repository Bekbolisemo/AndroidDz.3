package com.example.androiddz3.second;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz3.R;
import com.example.androiddz3.main.Contry;

import java.util.ArrayList;

public class SecondActivityAdapter extends RecyclerView.Adapter<SecondActivityAdapter.ViewHolder> {
    private ArrayList<Contry> list = new ArrayList<>();

    public void updateData(ArrayList<Contry> List){
       this.list.addAll(List);
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view_second, parent, false );
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
        public void bind(Contry contry){
            strana.setText(contry.getCountry());
            gorod.setText(contry.getTown());
            imageView.setImageResource(contry.getImageView());
        }

    }


}
