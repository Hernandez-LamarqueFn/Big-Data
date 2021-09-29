//Fibonacci 1

//algoritm recursive version
val n=10 
def fib1(n:Int):Int={
    if(n<2)
    {
        return n
    }
    else 
    {
        return(fib1(n-1)+fib1(n-2))
    }
}
println(fib1(n))

//Fibonacci algoritm 2

val n = 8
var phi=((1+math.sqrt(5))/2) 
var j=((math.pow(phi,n)-math.pow((1-phi),n))/(math.sqrt(5))) 


def fib2(n:Double) : Double ={
if (n<2){
return n
}
else {

    return j
}
}
println(fib2(n))

//Algorithm 3 Iterative version

def fib3(n:Int):Int={
var n : Int = 7 
var a = 0 
var b = 1 
var c = 0 



    for(k <- 1 to n) {
        
        c = b + a 
        a = b 
        b = c   
    }
     return a  
}
println(fib3(n)) 

//Algoritm 4 iterative version 2 variables

def fib4(n:Int):Int={  
var n : Int = 6 
var a = 0 
var b = 1  

for (k <- 1 to n){
    b = b + a 
    a = b - a 
}
return a 
}
println(fib4(n))

//Algoritm 5

def fib5(n:Int):Int={
    var n = 7 
    var vector = new Array[Int](n+1) 
    vector(0) = 0 
    vector(1) = 1
    if(n< 2){ 
        return n 
    }
    for( k <- 2 to n){ 
        vector(k) = vector(k - 1) + vector(k - 2)  
        
    }
    return vector(n)
}
println(fib5(n))