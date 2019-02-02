package me.andersonmelo.classesemetodosnapratica.classes;

class Cao extends Animal {

    void latir(){
        System.out.println("Latir como um Cão");
    }

    void correr(){
        super.correr();
        System.out.println("cão");
    }

}
