package com.test.tres;

public class TrainFactory extends VehicleFactory {

	@Override
	public Moveable getVehicle() {
		return new Train();
	}	
}