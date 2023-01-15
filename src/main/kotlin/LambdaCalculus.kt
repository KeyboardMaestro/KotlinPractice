import java.util.StringJoiner

fun main() {
    oneParam { a -> "Hello $a" }
}
fun oneParam(out: (String) -> String) : Unit{
    println(out("OneParam"))
}
fun noParam(out: () -> Int) = println(out());
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