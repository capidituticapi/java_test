package com.test.tres;

public class CarFactory extends VehicleFactory {

	@Override
	public Moveable getVehicle() {
		return new Car();
	}
}
