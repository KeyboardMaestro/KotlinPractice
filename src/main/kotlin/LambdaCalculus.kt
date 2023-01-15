fun main() {
    var a = 10;
    var b = 20;
    var c = 2;
    var d = 1;
    println(highDimension({ x, y -> x * y}, c, d));
    val result = callByValue(lambda());
    println(result)
    val test = callByName(lambda)
    println(test)
}

fun highDimension (sum : (Int, Int) -> Int, a : Int, b : Int) : Int{
    return sum(a,b);
}

fun callByValue(b : Boolean) : Boolean {
    println("Call by value")
    return b;
}

fun callByName(l : () -> Boolean): Boolean {
    println("call by name Function");
    return l();
}

val lambda: () -> Boolean = {
    println("Lambda Function")
    true
}