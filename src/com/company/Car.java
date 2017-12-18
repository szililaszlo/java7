package com.company;

enum EngineType {DIESEL, GAS}

public class Car extends MotoricVehicle {
    private static final int speeding =130;

    private EngineType engineType;

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public void go() {
        if(getSpeed()>speeding){
            throw new SpeedingException();
        }
    }
}
