
    /**
     * Solicita un número entero en un rango.
     *
     * @param min Int - valor mínimo
     * @param max Int - valor máximo
     *
     * @return Int - número entero válido dentro del rango especificado
     */

    fun pedirNum(min:Int,max:Int):Int{
        val porcien = Array(max) { i -> i + min }


        do {
            print("Introduce un numero del $min al $max: ")
            try {
            val respuesta = readln().toInt()
                if (respuesta !in porcien){
                    println("**ERROR**, Del $min al $max , no ves el mensaje????")
                }else
                    return respuesta
            }catch (e:Exception){
                println("**ERROR**, Pon un numero")
            }

        }while (true)

    }
    /**
     * Realiza una pregunta para contestar con s/si ó n/no
     *
     * @param text String - Texto de la pregunta
     *
     * @return Boolean - true/false dependiendo de la respuesta válida a la pregunta
     */
    fun pregunta(text:String):Boolean{
        do {
            print(text)
            val respuesta = readln()
             if (respuesta.lowercase() == "s" || respuesta.lowercase() == "si"){
                return true
            }else if (respuesta.lowercase() == "n" || respuesta.lowercase() == "no") {
                return false
            }else{
                println("**ERROR** Tienes que poner si/s o no/n muchacho")
            }
        }while(true)
    }

    fun main() {
        var estado: Boolean
        do {
            //TODO: Solicitar la introducción de un número entre 1 y 100 y mostrar su table de multiplicar...
            //Hasta que se responda negativamente a la pregunta "¿Desea generar otra tabla de multiplicación? (s/n)"
            val min = 1
            val max = 100
            val num = pedirNum(min,max)
            val tabla = Array<String>(11){i -> "$i -> $num x $i = ${num * i }"}
            tabla.forEach { println(it) }

            val pregunta = "¿Quieres generar otra tabla de multiplicar?(s/n): "
            estado = pregunta(pregunta)
        }while (estado)
    }
