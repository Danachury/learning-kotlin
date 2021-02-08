package com.danachury.samples.learningkotlin.kotlin

// Public Class / Class to be stored as entity
data class Customer// Primary constructor
(var name: String, var address: String, var age: Int) {

    // Secondary constructor
    constructor(name: String, age: Int) : this(name, "", age) {
        println("Secondary constructor")
    }

    init {
        println("Init block")
    }
}

class AlternativeCustomer(val name: String, val age: Int) {

    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

class AnotherAlternativeCustomer(val name: String, var age: Int, val address: String = "") {
    var approved: Boolean = false
        // Override Set method
        set(value) {
            if (age >= 21)
                field = value
            else
                println("You can't approve a customer under 21 years old.")
        }

    val nextAge
        get() = age + 1

    /*** ComponentN ***/
    operator fun component1() = name
    operator fun component2() = age

    fun uppercaseName() =
        name.toUpperCase()

    override fun toString() =
        "$name - $address - $age"

    companion object {
        fun getInstance() =
            AnotherAlternativeCustomer("Diego", 22, "Some Address")
    }
}


fun main(args: Array<String>) {
    val customer = Customer("Denilson", "Cl. 152D # ...", 23)
    val customer2 = Customer("Lore", 23)
    customer.age = 22
    println("${customer.name} is ${customer.age} year old")
    println("${customer2.name} is ${customer2.age} year old")

    val altCustomer = AnotherAlternativeCustomer("Denilson", 21, "Some Cl. 152 ...")
    altCustomer.age = 19
    altCustomer.approved = true
    println("${altCustomer.name} is ${altCustomer.age} year old. Has an address: ${altCustomer.address} and is ${altCustomer.approved}")
    println("Next year ${altCustomer.uppercaseName()} will be ${altCustomer.nextAge}")
    println(altCustomer.toString())

    val staticCustomer = AnotherAlternativeCustomer.getInstance()
    println(staticCustomer)

    val dataCustomer = Customer("Sally", 29)
    println(dataCustomer)

    val copyCustomer = dataCustomer.copy("Diana")
    println(copyCustomer)

    /*** Destructing and ComponentN ***/

    val (name, address, age) = copyCustomer
    println(age)

    val (name2, age2) = altCustomer
    println("Component => $name2 is $age2 years old.")
}
