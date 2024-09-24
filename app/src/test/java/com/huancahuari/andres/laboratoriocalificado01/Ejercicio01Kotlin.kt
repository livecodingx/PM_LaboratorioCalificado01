package com.huancahuari.andres.laboratoriocalificado01
import org.junit.Test
import org.junit.Assert.*

class Ejercicio01Kotlin {
    @Test
    fun validate_anagram() {
        // palabras a validar
        var word1 = "L i STE n"
        var word2 = "sil ent"
        // se pasan los parametros a la funcion creada para obtener la respuesta en booleano
        val result = areAnagrams(word1, word2)
        // se usa para que la consola nos de la respuesta si es verdadero no botara error si es falso si
        assertTrue(result)
    }
    //funcion creada aparte que devolvera booleano
    private fun areAnagrams(word1: String, word2: String): Boolean {
        // esto servira para quitar los espacios y tambien convertir a minuscula todo
        val word1 = word1.toLowerCase().replace("\\s".toRegex(), "")
        val word2 = word2.toLowerCase().replace("\\s".toRegex(), "")
        // ahora se comprueba si tienen la misma cantidad de letras ya sanitisada
        if (word1.length != word2.length) {
            return false
        }
        // y se separa cada letra sola y se ordena para validar que la lista esten indenticas
        val sortedWord1 = word1.toCharArray().sorted()
        val sortedWord2 = word2.toCharArray().sorted()
        //se retorna la veracidad de la igualdad
        return sortedWord1 == sortedWord2
    }
}