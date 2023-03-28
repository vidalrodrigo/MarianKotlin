package seccionUno

fun main(){
    println("Ingresa tu nombre :")
    val nombre= readLine()
    println("Ingresa tu edad :")
     val edad = readLine()


   // println("tu nombre es : $nombre \n y tu edad es : $edad")

    println("""
        ***Datos***
        Nombre:$nombre
        Edad:  $edad 
        
        
        
    """.trimIndent())

}