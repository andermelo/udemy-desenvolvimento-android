package me.andersonmelo.componentesdeinterface2;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleEstado;
    private Switch switchEstado;
    private CheckBox checkEstado;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleEstado = findViewById(R.id.toggleEstado);
        switchEstado = findViewById(R.id.switchEstado);
        checkEstado = findViewById(R.id.checkEstado);
        textResultado = findViewById(R.id.textResultado);

    }

    public void enviar(View view){

        if (switchEstado.isChecked()) {
            textResultado.setText("Switch ligado");
        }else{
            textResultado.setText("Switch desligado");
        }
    }
}
