package me.andersonmelo.recyclerview.activity.acivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import me.andersonmelo.recyclerview.R;
import me.andersonmelo.recyclerview.activity.RecyclerItemClickListener;
import me.andersonmelo.recyclerview.activity.adapter.Adapter;
import me.andersonmelo.recyclerview.activity.model.Filme;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();

        //Configurar adapter
        Adapter adapter = new Adapter( listaFilmes );

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter( adapter );

        //evento de click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(
                                  getApplicationContext(),
                                        "Item pressionado: " + filme.getTituloFilme(),
                                        Toast.LENGTH_SHORT
                                ).show();

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Click longo: " + filme.getTituloFilme(),
                                        Toast.LENGTH_SHORT
                                ).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );
    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha - De volta ao lar","Aventura","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha","Fantasia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("It: A Coisa","Drama/Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem Aranha - De volta ao lar","Aventura","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha","Fantasia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("It: A Coisa","Drama/Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem Aranha - De volta ao lar","Aventura","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha","Fantasia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("It: A Coisa","Drama/Terror","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Homem Aranha - De volta ao lar","Aventura","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha","Fantasia","2017");
        this.listaFilmes.add(filme);

        filme = new Filme("It: A Coisa","Drama/Terror","2017");
        this.listaFilmes.add(filme);
    }
}
