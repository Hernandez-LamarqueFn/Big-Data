// Practice_1/Practica 1
//1. Desarrollar un algoritmo en scala que calcule el radio de un circulo
val circu = 15
val pi = 2*3.1416
val rad = circu / pi


println(rad)

//2. Desarrollar un algoritmo en scala que me diga si un numero es primo
val numero = 3
var cont = 0
for(i <- Range(1, numero + 1)) {
 if( num % i == 0) {
   cont += 1
 }
}
if(cont != 2) {
 println("Numero no primo")
} else {
 println("El numero es primo ")
}
//3. Dada la variable bird = "tweet", utiliza interpolacion de string para
//   imprimir "Estoy ecribiendo un tweet"
val bird = "tweet"
val interpolar = "Estoy escribiendo un "+ bird

//4. Dada la variable mensaje = "Hola Luke yo soy tu padre!" utiliza slilce para extraer la
//   secuencia "Luke"
val mensaje = "Hola Luke yo soy tu padre!"
mensaje slice (5,9)

//5. Cual es la diferencia entre value y una variable en scala?
the object assigned to a val cannot be replaced, 
and the object assigned to a var can. However, 
said object can have its internal state modified.

//6. Dada la tupla (2,4,5,1,2,3,3.1416,23) regresa el numero 3.1416 
val x = List(2,4,5,1,2,3,3.1416,23)
x(7)