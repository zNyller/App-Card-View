package com.example.cardview.Adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {
    private List<Postagem> listaPosts;
    public Adaptador(List<Postagem> lista) {
        this.listaPosts = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_layout, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = listaPosts.get(position);
        holder.textNome.setText(postagem.getNome());
        holder.textData.setText(postagem.getData());
        holder.imagePost.setImageResource(postagem.getImagem());
        holder.textDescricao.setText(postagem.getDescricao());
    }


    @Override
    public int getItemCount() {
        return listaPosts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView textNome, textData, textDescricao;
        ImageView imagePost;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textData = itemView.findViewById(R.id.textData);
            textDescricao = itemView.findViewById(R.id.textDescricao);
            imagePost = itemView.findViewById(R.id.imagePost);
        }
    }

}
