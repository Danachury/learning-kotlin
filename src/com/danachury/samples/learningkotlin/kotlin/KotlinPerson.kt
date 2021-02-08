package com.danachury.samples.learningkotlin.kotlin

import java.util.*

data class KotlinPerson(val id: Long,
                        val title: String,
                        val firstName: String,
                        val surname: String,
                        val dateOfBirth: Calendar? = null) {

    val age: Int
        get () = getAge(dateOfBirth)

    var favoriteColor: String? = null

    /*** Elvis operator ***/
    fun getUpperCaseFavoriteColor(): String =
        favoriteColor?.toUpperCase() ?: ""

    private fun getLastLetter(a: String) =
        a.takeLast(1)

    /*** Let Function ***/
    fun getLastLetterOfColor(): String {
        return favoriteColor?.let { getLastLetter(it) } ?: ""
    }

    /*** When expression ***/
    fun getColorType(): String {
        val color = getUpperCaseFavoriteColor()
        return when (color) {
            "" -> "empty" +
                ""
            "RED", "GREEN", "BLUE" -> "rgb"
            else -> "other"
        }
    }

    override fun toString() =
        "$title $firstName $surname"

    companion object {

        fun getAge(dateOfBirth: Calendar?): Int {
            if (dateOfBirth === null)
                return -1
            val today = GregorianCalendar()
            val years = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR)
            return if (dateOfBirth.get(Calendar.DAY_OF_YEAR) >= today.get(Calendar.YEAR)) years - 1 else years
        }
    }
}
