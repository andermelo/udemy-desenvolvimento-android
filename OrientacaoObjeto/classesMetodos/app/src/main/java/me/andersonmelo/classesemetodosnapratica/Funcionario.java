package me.andersonmelo.classesemetodosnapratica;

class Funcionario {

    //propriedades
    String nome;
    double salario;

    //métodos
    double recuperarSalario( double bonus, double descontoAdicional ){
        this.salario = this.salario - (this.salario * 0.1);
        return this.salario + bonus - descontoAdicional;
        //System.out.println( this.salario );
    }
}
