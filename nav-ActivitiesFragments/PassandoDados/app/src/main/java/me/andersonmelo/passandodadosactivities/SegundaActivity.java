package me.andersonmelo.passandodadosactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;
    private TextView textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        //Recuperar os dados enviados
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");
        Usuario usuario = (Usuario) dados.getSerializable("objeto");

        //Configuar valores recuperados

        //textNome.setText(nome);
        //textIdade.setText( String.valueOf(idade));

        textNome.setText(usuario.getEmail());
        textIdade.setText( usuario.getNome());

    }
}
