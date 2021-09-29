# Practice 1

#### 1. Develop a scala algorithm that calculates the radius of a circle

We declare the variable circu what would be the value of the area of ​​the circle, and we carry out the appropriate operation with the clearing of the formula.
Finally we print the value of the radius.


```
val circu = 15
val pi = 2 * 3.1416
val rad = circu / pi


println (rad)
```

#### 2. Develop an algorithm in scala that tells me if a number is prime

We declare the number that we will review and the counter, taking into account that a number is prime if it can only be divided between itself and 1 and that the remainder is 0, a loop starts that if certain conditions are met and it will tell us if the number is or is not cousin,

```
val number = 3
var cont = 0
for (i <- Range (1, number + 1)) {
 if (num% i == 0) {
   cont + = 1
 }
}
if (cont! = 2) {
 println ("Non-prime number")
} else {
 println ("The number is prime")
}
```

#### 3. Given the variable bird = "tweet", use string interpolation to print "I'm writing a tweet"

we assign the tweet value to the bird variable and we interpolate it with the text I am writing a in the interpolate variable

```
val bird = "tweet"
val interpolate = "I'm writing a" + bird
```

#### 4. Given the variable message = "Hello Luke, I am your father!" use slilce to extract the sequence "Luke"

we assign the value to the message variable, we use the slice function to bring the data from the range 5 to 9

```
val message = "Hi Luke, I'm your father!"
message slice (5,9)
```

#### 5. What is the difference between value and a variable in scala?


the object assigned to a value cannot be overridden, and the object assigned to a var can, however, said object can have its internal state modified.


#### 6. Given the tuple (2,4,5,1,2,3,3.1416,23) returns the number 3.1416

we create the tuple, and call position 7, in this case 3.1416

```
val x = List (2,4,5,1,2,3,3.1416,23)
x (7)
```
