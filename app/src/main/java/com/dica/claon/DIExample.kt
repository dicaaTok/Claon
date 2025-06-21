package com.dica.claon


fun  main() {
val engine = Engine()
    val car = Car()
    car.setEngine(engine)
    car.start()

}
open class Car (

){
    private val engine: Engine? = null
    fun setEngine(engine: Engine){
        _engine = engine
    }

    fun start() {
        _engine?.startEngine()
    }
}
//class ElectricCar: Car(){}

class Engine() {

    fun startEngine() {
        println("Engine started")
    }

}
