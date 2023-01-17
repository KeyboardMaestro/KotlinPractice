import java.lang.AssertionError

class GetSet (_id: Int, _name: String, _age: Int) {
    val id : Int = _id
        get() = field

    var name : String = _name
        get() = field;

    var age : Int = _age
        get() = field
        set(value){
            field = value
            println("!")
        }
}

class Unit{
    lateinit var name : String
}

fun main(){
    val user = Unit()
    user.name = "1"
    println(user.name)
    user.name = ""
    println(user.name)
}