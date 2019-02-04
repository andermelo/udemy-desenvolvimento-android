package me.andermelo.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlerta(View view){

        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //Configurar título e mensagem
        dialog.setTitle("Alerta!!!");
        dialog.setMessage("Olá AlertDialog :)");

        //Configura o cancelamento
        dialog.setCancelable(false);

        //Configura um icone
        dialog.setIcon(android.R.drawable.ic_lock_idle_low_battery);

        //configurar ações sim e nao
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(), "Sim foi pressionado", Toast.LENGTH_LONG).show();

            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_LONG).show();

            }
        });

        //Criar e exibir AlertDialog
        dialog.create();
        dialog.show();

    }

}
