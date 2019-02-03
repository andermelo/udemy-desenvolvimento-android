package me.andersonmelo.classesemetodosnapratica;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(){
        System.out.println("Configuraçoes iniciais");
    }

    public ContaBancaria(int nConta){
        this.numeroConta = nConta;
        //System.out.println("Construtor chamado " + nConta);
    }

}
