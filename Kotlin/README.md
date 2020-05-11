# Android com Kotlin

![Kotlin banner](../assets/images/kotlin.png)

1. [Recursos utilizados](#recursos-utilizados)
1. [AppSorteio](/AppSorteio)
1. [Arrays](#arrays)
1. [Funções](#funções)
1. [Classes e objetos](#classes-e-objetos)
1. [Construtores](#construtores)
1. [Herança](#herança)
1. [Modificadores de acesso](#modificadores-de-acesso)
1. [App Gasolina ou Álcool](AppGasolinaXAlcool)

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

## Herança

## Modificadores de acesso

## Recursos utilizados

- [Kotlin](https://kotlinlang.org/) - documentação oficial
- [Kotlin Playground](https://play.kotlinlang.org/)
