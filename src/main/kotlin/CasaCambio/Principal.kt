import java.text.DecimalFormat

var tasaCambio = 0.0
var pesosEnCaja = 0.0
var dolaresEnCaja =0.0

fun main () {
    print("Ingrese la tasa de cambio de dolar a pesos: $")
    tasaCambio = readln()!!.toDouble()


    print("Ingrese la cantidad de pesos para la apertura de la caja: $")
    pesosEnCaja = readln()!!.toDouble()


    print("Ingrese la cantidad de dolares para la apertura de la caja: $")
    dolaresEnCaja = readln()!!.toDouble()

          controlOperaciones()

}

   fun  controlOperaciones() {

       print("\nIngrese la cantidad de dolares acambiar:$")
       val dolaresACambiar = readln()!!.toDouble()

       dolaresEnCaja += dolaresACambiar
       val pesosAEntregar = tasaCambio * dolaresACambiar

       pesosEnCaja -= pesosAEntregar

       val formato = "#,###.00"

       println(
           """
        ***Recibo***
        Pesos mexicanos a enregar : $${DecimalFormat(formato).format(pesosAEntregar)}
        
        Pesos en caja : $${DecimalFormat(formato).format(pesosEnCaja)}
        Dolares en caja : $${DecimalFormat(formato).format(dolaresEnCaja)}
        
    """.trimIndent()
       )

       controlOperaciones()

   }
