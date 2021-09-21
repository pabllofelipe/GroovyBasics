package com.learning

class Toyota extends Car{

    String filial
    Date date
    String mechanicName
    int maxspeed

    String getFilial() {
        return filial
    }

    void setFilial(String filial) {
        this.filial = filial
    }

    Date getDate() {
        return date
    }

    void setDate(Date date) {
        this.date = date
    }

    String getMechanicName() {
        return mechanicName
    }

    void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName
    }

    @Override
    def topSpeed(int maxspeed){
        this.maxspeed = maxspeed
    }

    def getTopSpeed(){
        return this.maxspeed
    }
}
