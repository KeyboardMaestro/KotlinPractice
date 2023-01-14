import kotlin.*;
import kotlin.math.PI
import kotlin.math.abs
import practice.Person

fun main() {
    val intro : String = "Hello, World";
    val num : Int = 20;
    println("intro : $intro, num: $num")
    println(PI);
    println(abs(-12.6))
    val human = Person("Jude", 25)
    println("My name is ${human.name} and I am ${human.age} years old")
    println("\$")
}