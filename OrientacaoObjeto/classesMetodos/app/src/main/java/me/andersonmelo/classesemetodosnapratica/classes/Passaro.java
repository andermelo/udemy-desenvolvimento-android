package me.andersonmelo.classesemetodosnapratica.classes;

class Passaro extends Animal {

    void voar(){
        System.out.println("Voar como passaro");
    }

    void correr(){
        super.correr();
        System.out.println("passaro");
    }
}
