package com.example.introducionakotlin
//const val direction ="ZZZZ " --> Constantes globales
//val y var
/*fun main() {
    val persona:Persona = Persona(nombre = "Shande", apellido = "Rodriguez")
    val persona2= Persona()
    persona2.nombre = "Pepe"
    persona2.apellido = "Mongol"
    persona2.Saludo()
}
class Persona(  var nombre:String="", var apellido:String=""){


    fun Saludo() {
        println("Hola $nombre $apellido")
    }
}*/
//data class ---> forma de modelar datos
/*fun main(){
    val usuario = User("Gaston", edad = 12)
    val usuario2 = usuario.copy(edad = 22)

    println(usuario.toString())
    println("Son iguales: ${usuario == usuario2}")
}

data class User(val nombre:String,val edad:Int)*/
//Constantes
/*fun main(){
    println(Constantes.direction)
}
class Constantes(){

    companion object{
        const val direction = "Otra direccion XD"
    }

}*/
//Constantes mas elegantes
/*fun main(){
    val dia =Dias.Lunes.numero
    println(dia)
}
enum class  Dias(val numero:Int){
    Lunes(0),
    Martes(1),
    Miercoles(2),
    Jueves(3),
    Viernes(4),
    Sabado(5),
    Domingo(6)
}*/
//funciones
/*fun main(){
    println(esPar(2))
}

fun esPar(a : Int):Boolean{
    return a % 2 == 0
}*/

//Control Flow

//Control IF
/*fun main(){

    val a = 4
    val b = 2
    /*var maximo = a
    if (a <b)maximo = b
    println(maximo)*/

    /*var max:Int
    max = if(a>b){
        a
    }else{
        b
    }
    println(max)*/

    /*val max = if(a>b) a else b
    println(max)*/

}*/

//Control FOR
/*fun main(){
    var listaMutable = mutableListOf("Pepe","Nig","ZZZ")
    listaMutable.add("Leoon")
    listaMutable.removeAt(1)

    val listaInmutable = listOf("M","O","N","G","O","L")


    for(nombre in listaMutable){

            println(nombre)
    }
    for ((index,value)in listaMutable.withIndex()){

        println("Nombre:$value con indice en $index")
    }
    // Esto es mas facil de acordarse que lo de arriba
    listaMutable.forEach{ elementos ->
        println(elementos)
    }
    listaInmutable.forEachIndexed { index, elementos ->
        println("Nombre: $elementos en la posicion $index")
    }
}*/

//Control WHEN = SWITCH("JAVA")

/*fun main(){

    val x = 4
    when (x){
        1 -> {
            println("Este es $x ")}
        2 -> {
            println("Este es $x ")}
        3 -> {
            println("Este es $x ")} // -> = lambda
        else -> {
            println("$x no esta declarada")
        }
    }

}*/

//Control WHILE , DO WHILE
fun main(){
    var i = 1
    while (i<=5){
        println("valor $i")
        ++i
    }
    var sum = 0
    var input:String
    do{
        println("Numero: ")
        input = readLine()!!
        sum += input.toInt()
    }while (input != "0")
    println("Sum: $sum")
}


