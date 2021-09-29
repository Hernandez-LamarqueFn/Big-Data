//Practice 2
// 1. Crea una lista llamada "lista" con los elementos "rojo", "blanco", "negro"

val lista = List("rojo","Blanco","Negro")
println(lista)

// 2. Añadir 5 elementos mas a "lista" "verde" ,"amarillo", "azul", "naranja", "perla"
val e1= "Verde" ::lista
val e2= "Amarillo" :: e1
val e3= "Azul" :: e2
val e4= "Naranja" :: e3
val e5= "Perla" :: e4

// 3. Traer los elementos de "lista" "verde", "amarillo", "azul"

var lista=List("rojo", "blanco", "negro", "verde", "amarillo", "azul", "naranja", "perla")
lista.slice(3,6)

// 4. Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5
val array = (1 to 1000).by(5)
    for(i <- array){
        println(""+i)

    }

// 5. Cuales son los elementos unicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversion a conjuntos

var Lista = List(1,3,3,4,6,7,3,7)
Lista.toSet

// 6. Crea una mapa mutable llamado nombres que contenga los siguiente
//     "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"

val nombres = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana", "27"))

// 6 a . Imprime todas la llaves del mapa

nombres
nombres.keys
nombres.values

// 7 b . Agrega el siguiente valor al mapa("Miguel", 23)

nombres += ("Miguel" -> 23)
nombres
nombres.keys
nombres.values