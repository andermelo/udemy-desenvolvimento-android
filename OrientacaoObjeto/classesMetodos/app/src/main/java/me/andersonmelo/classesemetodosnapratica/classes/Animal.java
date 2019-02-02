package me.andersonmelo.classesemetodosnapratica.classes;

public class Animal {

    int tamanho;
    protected String cor;

    double pedo;

    //Getter e Setter

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return this.cor;
    }

    void dormir(){
        System.out.println("Dormir como um animal");
    }

    void correr(){
        System.out.println("Correr como um ");
    }

}
