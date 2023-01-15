tailrec fun factorial(n : Int, num : Int = 1) : Long{
    if (n == 1) return n.toLong() else return factorial(n-1, num * n);
}

fun main(){
    val num :Int = 5;
    println("Facto: $num -> ${factorial(num)}");
}