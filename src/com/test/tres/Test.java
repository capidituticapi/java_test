package com.test.tres;

public class Test {

	public static void main(String[] args) {
		
        VehicleFactory cf = new TrainFactory();
        Moveable tar = cf.getVehicle();
        tar.run(); 

	}

}
