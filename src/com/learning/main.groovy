package com.learning

static void main(args){
    Student student = new Student()
    Car car = new Car()
    Fruits fruit = new Fruits()
    def read = {System.in.newReader().readLine()}
    println("What do you want to save?")
    switch (read.call()){
        case "car":
            println("Type de name of car: ")
            car.setName(read.call())
            println("Type de model of car: ")
            car.setModel(read.call() as Integer)
            println("Type de color of car: ")
            car.setColor(read.call())
            break
        case "fruit":
            println("Type de name of fruit: ")
            fruit.setName(read.call())
            println("Type de color of fruit: ")
            fruit.setColor(read.call())
            break
        case "student":
            println("Type de name of student: ")
            student.setName(read.call())
            println("Type de id of student: ")
            student.setId(read.call())
            break
        default:
            break
    }
}
