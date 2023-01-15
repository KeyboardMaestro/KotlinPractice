import java.util.StringJoiner

fun main(args: Array<String>){
    val num = 10;
    val formattedSting =
        """
        var a = 6;
        var = "Kotlin;
        println(a + num);
        """
    println(formattedSting);
    nullTest();
    tripleEqualTest();
    test();
    checkArg("Love")
    checkArg(12L)
    checkArg(12)
    testFun()
}

fun nullTest(){
    var str1 : String? ="Hello World";
    str1 = null;
    //println("${str1!!.length}"); /* NPE */
    println("${str1?.length}"); // Safe Call
    println("${str1?.length ?: -1}"); // Safe call with Elvis operation.
}

fun tripleEqualTest(){
    val a = 128 // Saved as primitive type
    val b: Int? = 128 // Saved as Reference (an Instance/Object)
    val f: Int? = 128 // Saved as Reference (an Instance/Object)
    println(a === b) // true b referenced a
    println(b === f) // false
    val a1: Int = 128
    val b1 = a1
    println(a1 === b1) // true
    val c: Int? = a1
    val d: Int? = a1
    val e: Int? = c
    println(c == d) // true
    println(c === d) // false
    println(c === e) // true
}

fun test() {
    var tValue : Number = 12.2; // Smart cast
    println(tValue)
    tValue = 128
    println(tValue)
    if (tValue is Number) // Type Check
        println("Yes")
    else
        println("No")
    val tValue2: Any = 123
    tValue2.toString()
    if (tValue2.toString() is String)
        println("Yes")
    else
        println("No")
    println(tValue2.javaClass)
}
fun checkArg(x: Any){
    if (x is String)
        println("String")
    else if(x is Int)
        println("Int")
    else if(x is Long)
        println("Long")
}
fun testFun(){
    var local : Number = 12.2;
    var local2 : Number = 1.2;
    var x : Float = 12.2f;
    x -= 1.2f
    println(local.javaClass) // Double
    var y = 0b0000_1010
    println(y shl 1)
}