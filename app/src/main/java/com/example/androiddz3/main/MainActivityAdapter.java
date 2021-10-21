package com.example.androiddz3.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androiddz3.R;

import java.util.ArrayList;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

   private ArrayList<Contry> List ;
   private onClick click;
    public void updateData(ArrayList<Contry> List,onClick onClick){
       this.List = new ArrayList<>();
       this.List = List;
       click = onClick;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler_view, parent, false );

        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(List.get(position));
    }

    @Override
    public int getItemCount() {
        return List.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.title);
            imageView = itemView.findViewById(R.id.image);

        }

        public void bind(Contry contry) {
            name.setText(contry.getContinentName());
            imageView.setImageResource(contry.getIm());
            itemView.setOnClickListener(view -> { click.onItemClick(contry);
            });

        }
    }
    public interface onClick {
        void onItemClick(Contry contry);
    }
}
