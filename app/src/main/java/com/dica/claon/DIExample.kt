package com.dica.claon

fun main(){
    val engine = Engine()
    val electricEngine = ElectricEngine()
    val gasEngine = GasEngine()

    val car= Car(gasEngine )
    val car2= Car(electricEngine )
    val car3= Car(engine )

    car.start()
    car2.start()
    car3.start()
}

class Car(

    private val engine: Engine
){

    fun start(){
        engine.startEngine()
        println("Машина заведена")
    }
}

open class Engine{
    open fun startEngine(){
        println("Двигатель запущен")
    }
}

class ElectricEngine: Engine(){
    override fun startEngine() {
        println("Электронная машина заведена")

    }
}

class GasEngine: Engine(){
    override fun startEngine() {
        println("Газовая машина  заведена")
    }
}
