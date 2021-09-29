# Practice 2

#### 1. Create a list called "list" with the elements "red", "white", "black"

a list with 3 defined data is created and displayed

```
val list = List ("Red", "White", "Black")
println (list)
```

#### 2. Add 5 more elements to "list" "green", "yellow", "blue", "orange", "pearl"

here we save the value in a variable and add it to the beginning of the list

```
val e1 = "Green" :: list
val e2 = "Yellow" :: e1
val e3 = "Blue" :: e2
val e4 = "Orange" :: e3
val e5 = "Pearl" :: e4
```

#### 3. Get the "list" elements "green", "yellow", "blue"

We declare the list what we are going to use and with the list.slice command we show a sublist where only the elements that are in the positions that we established in the range will be, it starts at 3 and goes up to 6

```
var list = List ("red", "white", "black", "green", "yellow", "blue", "orange", "pearl")
list.slice (3,6)
```

#### 4. Create an array of numbers in the range 1-1000 in steps of 5 to 5

We create the array including the range 1 to 1000 and with the by method we tell it what we want the jumps from 5 to 5, we add a for loop to display them.

```
val array = (1 to 1000) .by (5)
    for (i <- array) {
        println ("" + i)

    }
```

#### 5. What are the unique elements of the list List (1,3,3,4,6,7,3,7) use conversion to sets

We create the list with the previously mentioned elements and with the toSet method we transform the list to a set.

```
var List = List (1,3,3,4,6,7,3,7)
List.toSet
```

#### 6. Create a mutable map named names that contains the following "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"

we create the map with the mutable option separating the name and age of each person.

```
val names = collection.mutable.Map (("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana", "27"))
```

#### 6 a. Print all keys on the map

We print all the map data, with the keys method only the string data is printed, and with the values ​​method we print the numerical values

```
Names
names.keys
names.values
```

#### 7 b. Add the following value to the map ("Miguel", 23)

With the + = option we can add the new data to the existing map since, as it is mutable, it allows us to edit it, in addition to printing all the map keys

```
names + = ("Miguel" -> 23)
Names
names.keys
names.values
```