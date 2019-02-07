package me.andersonmelo.calculadoragorjeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editValor;
    private TextView textPorcetagem;
    private TextView textGorjeta;
    private TextView textTotal;
    private SeekBar seekGorjeta;

    private double porcetagem = 0; //porcentagem inicial da gorjeta


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editValor = findViewById(R.id.editValor);
        textGorjeta = findViewById(R.id.textGorjeta);
        textPorcetagem = findViewById(R.id.textPorcetagem);
        textTotal = findViewById(R.id.textTotal);
        seekGorjeta = findViewById(R.id.seekGorjeta);

        //Controlar seekbar
        seekGorjeta.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                porcetagem = seekBar.getProgress();
                textPorcetagem.setText(Math.round(porcetagem) + "%");
                calcular();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void calcular(){
        //Recupaer valor digitado
        double valorDigitado = Double.parseDouble( editValor.getText().toString());

        //calcular a gorjea total

        double gorjeta =valorDigitado * (porcetagem/100);
        double total = gorjeta + valorDigitado;

        //exibir gorjeta total
        textGorjeta.setText("R$ " + gorjeta);
        textTotal.setText("R$ " + total);
    }
}
