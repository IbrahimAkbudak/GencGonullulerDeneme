package com.example.gencgonulluler;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gencgonulluler.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class EtkinliklerAdapter extends RecyclerView.Adapter<EtkinliklerAdapter.EtkinliklerHolder> {

    ArrayList<Etkinlikler> etkinliklerList;

    public EtkinliklerAdapter(ArrayList<Etkinlikler> etkinliklerList) {
        this.etkinliklerList = etkinliklerList;

    }

    @NonNull
    @Override
    public EtkinliklerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new EtkinliklerHolder(recyclerRowBinding);
    }


    @Override
    public void onBindViewHolder(EtkinliklerAdapter.EtkinliklerHolder holder, int position) {


        holder.binding.recyclerViewTextView.setText(etkinliklerList.get(position).name);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(holder.itemView.getContext(),DetailActivity.class);
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenEtkinlikler(etkinliklerList.get(position));
                // intent.putExtra("landmark",landmarkList.get(position));
                holder.itemView.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return etkinliklerList.size();
    }

    public class EtkinliklerHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;

        public EtkinliklerHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

