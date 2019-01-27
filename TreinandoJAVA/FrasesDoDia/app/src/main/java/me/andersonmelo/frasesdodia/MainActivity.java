package me.andersonmelo.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Ninguém existe por um propósito. Ninguém pertence a lugar nenhum. Todo mundo vai morrer. Vem ver TV.",
                "Sr. Presidente, se eu aprendi alguma coisa hoje, é que as vezes você tem que ligar o f*da-se!",
                "Casamentos são basicamente funerais com bolo",
                "Eu sei que essa situação pode ser intimidadora. Você olha ao redor e é tudo assustador e diferente, mas sabe… encará-las, avançar contra elas como um touro - é assim que crescemos como pessoas.",
                "Eu me transformei em um picles, Morty! Eu sou Picles Riiiick!"
        };

        int numero = new Random().nextInt(frases.length);

        TextView texto = findViewById(R.id.text_result);

        texto.setText(frases[numero]);


    }
}
