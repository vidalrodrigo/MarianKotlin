fun main(args: Array<String>) {
    //soma()

    pedirDatos("hola",123 )
}
fun soma(){
    println("Ingresa valor 1")
    val num1 = readln()!!.toInt();
    println("Ingresa valor 2")
    val num2 = readln()!!.toInt();
    val resultado = num1 + num2
    println(resultado)
}

fun pedirDatos(datoUno: String, datoDos: Int){
    println(datoUno)
    println(datoDos)
}
