package com.example.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.Adapter.Adaptador;
import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Postagem> listaPosts = new ArrayList<>();
    private RecyclerView recyclerPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPost = findViewById(R.id.recyclerPost);

        // Definir Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPost.setLayoutManager(layoutManager);
        recyclerPost.setHasFixedSize(true);

        // Listar filmes
        this.criarPost();

        // Definir Adapter
        Adaptador adaptador = new Adaptador(listaPosts);

        recyclerPost.setAdapter(adaptador);
    }

    public void criarPost(){
        Postagem postagem = new Postagem("Eduardo Sampaio", "17h",
                "#TBT Hello World!", R.drawable.imagem1);
        this.listaPosts.add(postagem);
        postagem = new Postagem("Building Company", "3h",
                "#City", R.drawable.imagem2);
        this.listaPosts.add(postagem);
        postagem = new Postagem("Paris Views", "8h",
                "#Eiffel", R.drawable.imagem3);
        this.listaPosts.add(postagem);
        postagem = new Postagem("Trip Advisor", "1h",
                "#TravelTheWorld", R.drawable.imagem4);
        this.listaPosts.add(postagem);
    }

}