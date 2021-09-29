import org.apache.spark.sql.SparkSession
 
 // Pregunta 1 Comienze una simple sesion de spark
val spark = SparkSession.builder().getOrCreate() 

//inferimos el esquema
val df = spark.read.option("header", "true").option("inferSchema","true")csv("/home/leonardo/DatosMasivos/Big_Data/Evaluation") 

// Pregunta 3 mostramos las columnas
df.columns 

//Pregunta 4 imprimimos el esquema
df.printSchema()

// Pregunta 5 mostramos las 5 primeras filas
df.show(5)  

// Pregunta 6 funcion describe
df.describe().show()

//Pregunta 7 creacion de nuevo dataframe 
val df2 = df.withColumn("HV Ratio", df("High")+df("Volume")) 
df2.show()

// 8.- ¿Qué día tuvo el pico mas alto en la columna “Close”?
df.orderBy($"Close".desc).show(1)

// 9.- Escribe con tus propias palabras en un comentario de tu codigo. ¿Cuál es el
// significado de la columna Cerrar “Close”?

// La columna close representa el valor en el mercado con el que cerro el dia la plataforma de netflix.

// 10.- ¿Cuál es el máximo y mínimo de la columna “Volume”?
df.select(max("Volume")).show()
df.orderBy(desc("Volume")).show(1)

df.select(min("Volume")).show()
df.orderBy(asc("Volume")).show(1)

// 11.- Con Sintaxis Scala/Spark $ conteste los siguiente:

    //Hint: Basicamente muy parecido a la session de dates, tendran que crear otro
    //dataframe para contestar algunos de los incisos.

    // a. ¿Cuántos días fue la columna “Close” inferior a $ 600?
    df.filter($"close"<600).count()

    // b. ¿Qué porcentaje del tiempo fue la columna “High” mayor que $ 500?
    
    val porcentaje1 = df.filter($"High">500).count()
    val porcentaje2 = df.filter($"High">0).count()
    val porcentaje3:Double = porcentaje1 * 100
    porcentaje3 / porcentaje2

    // c. ¿Cuál es la correlación de Pearson entre columna “High” y la columna “Volumen”?
    df.select(corr("High", "Volume")).show

    // d. ¿Cuál es el máximo de la columna “High” por año?
    import spark.implicits._
    val year1 = df.withColumn("Year", year(df("Date")))
    val year2 = year1.select($"Year", $"High").groupBy("Year").max()
    year2.select($"Year", $"max(High)").orderBy(asc("Year")).show()

    // e. ¿Cuál es el promedio de columna “Close” para cada mes del calendario?
    val mes1 = df.withColumn("Mes", month(df("Date")))
    val mes2 = mes1.select($"Mes", $"Close").groupBy("Mes").avg()
    mes2.select($"Mes", $"avg(Close)").orderBy(asc("Mes")).show()
