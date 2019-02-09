package me.andersonmelo.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import me.andersonmelo.cardview.R;
import me.andersonmelo.cardview.adapter.PostagemAdapter;
import me.andersonmelo.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager( this );
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager( layoutManager );

        //define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter( adapter );

    }

    public void prepararPostagens(){

        Postagem p;

        p = new Postagem("Anderson Melo", "#tbt Viagem legal!", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Hotel JM", "Viaje, aproveite nossos...", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Pedro Melo", "#Paris", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Marcos Paulo", "Que foto linda!", R.drawable.imagem4);
        this.postagens.add(p);

    }


}
