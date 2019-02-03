package me.andersonmelo.classesemetodosnapratica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.andersonmelo.classesemetodosnapratica.classes.Animal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Obama obama = new Obama();
        obama.direitosDeveres();
































        //ContaBancaria conta =  new ContaBancaria( );





















        //Pessoa pessoa = new Pessoa();
        //pessoa.exibirDados("Pedro",2);




















        //Animal animal = new Animal();

        /*
        Conta conta = new Conta();
        conta.depositar(100);//200
        conta.sacar(50);//150
        System.out.println( conta.recuperarSaldo() );
        */

        //Passaro passaro = new Passaro();
        //passaro.correr();

        //Cao cao = new Cao();
        //cao.correr();

        /*
        Animal animal = new Animal();
        animal.correr();
        */
        //Funcionario funcionario = new Funcionario();
        //funcionario.nome = "Jamilton";
        //funcionario.salario = 920;

        //double salarioRecuperado = funcionario.recuperarSalario( 120, 20 );
        //System.out.println( "O Salário é " + salarioRecuperado );

        //        Casa minhaCasa = new Casa();
        //        minhaCasa.cor = "Cor";
        //
        //        Casa minhaCasa2 = new Casa();
        //        minhaCasa2.cor = "Branca";
        //
        //        System.out.println(minhaCasa.cor);
        //        minhaCasa.abrirPorta();
    }
}
