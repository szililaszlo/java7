package com.company;

/**
 * Created by java1 on 2017.12.18..
 */
public class NonMotoricVehicle extends AbstractVehicle {

    @Override
    public void go() {
        throw new com.company.NotImplementedException();
    }
}
