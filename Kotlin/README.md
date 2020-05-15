# Android com Kotlin

![Kotlin banner](../assets/images/kotlin.png)

1. [Recursos utilizados](#recursos-utilizados)
1. [AppSorteio](https://github.com/andermelo/udemy-desenvolvimento-android/tree/master/Kotlin/AppSorteio)
1. [Arrays](#arrays)
1. [Funções](#funções)
1. [Classes e objetos](#classes-e-objetos)
1. [Construtores](#construtores)
1. [Herança](#herança)
1. [Modificadores de acesso](#modificadores-de-acesso)
1. [App Gasolina ou Etanol](https://github.com/andermelo/udemy-desenvolvimento-android/tree/master/Kotlin/WhichFuel)

## Arrays
```kotlin
fun main(args: Array<String>) {
    
    var nomes = arrayOf("Anderson", "Luana", "Melo")
    var numeros = intArrayOf(10,15,20)
    var i = 0
    nomes[2] = "Pedro"
    var soma = numeros[0] + numeros[1]
    println(soma)
    for(nome in nomes)
    	println(nome)
}
```
## Funções
```kotlin
fun somar(numero1 : Int, numero2 : Int) : Int{
    	
    var resultado = numero1+numero2
    return resultado
}

fun main(args: Array<String>) {
    print(somar(5,6))
}
```

## Classes e objetos
```kotlin
class Animal{
    //propriedades
    var cor: String = ""
	
	//metodos/funções
	fun som(emite: String){
        print(emite)
    }
    
    fun come(tipoComida: String){
        print(tipoComida)
    }
    
    fun teste(){
        this.som("auaua ")
        this.come("carne")
    }
}

fun main(args: Array<String>) {

    var animal = Animal()
    animal.cor = "verde"
    
    animal.som("latido")
    animal.teste()
}
```

## Construtores
```kotlin
class Animal(cor:String,tamanho:String){
    //propriedades
    var cor: String
    var tamanho: String
	
    init{
        this.cor = cor
        this.tamanho = tamanho
    }
	//metodos/funções
	fun detalhesAnimal(){
        print("animal tem a cor $cor do tamanho $tamanho")
    }
	fun som(emite: String){
        print(emite)
    }
    
    fun come(tipoComida: String){
        print(tipoComida)
    }
    
    fun teste(){
        this.som("auaua ")
        this.come("carne")
    }
}

fun main(args: Array<String>) {
    
    var animal = Animal("azul","pequeno")
    animal.detalhesAnimal()

}
```

## Herança
```kotlin
open class Animal(){
	
	 open fun dormir(){
        print("dormir ")
    }

}

class Cao : Animal(){
  override fun dormir(){
      super.dormir()
      print("como um Cão")
  }
  
  fun latir(){
      print("latir")
  }
  
}

class Passaro : Animal(){
  override fun dormir(){
      super.dormir()
      print("como um Passaro")
  }
  
}

fun main(args: Array<String>) {
    val cao = Cao()
    cao.dormir()
    
//     val passaro = Passaro()
//     passaro.dormir()

}
```

## Modificadores de acesso

* private -> Visivel apenas dentro da classe 3 
* protected -> Funciona como o "private", mas é visivel em subclasses
* public -> Visivel em todo lugar, caso não seja definido é o padrão.
* internal -> Lembra o Public, mas sua visibilidade é restringida ao módulo, sendo então visivel dentro de um 7 mesmo módulo.

```kotlin
class Animal(){
	
	//private, protected, public
    private var nome =  "Marley"
	 open fun dormir(){
        print("dormir ")
    }

}


fun main(args: Array<String>) {
   
	val animal = Animal()
    print(animal.nome)
}
```

## Recursos utilizados

- [Kotlin](https://kotlinlang.org/) - documentação oficial
- [Kotlin Playground](https://play.kotlinlang.org/)
