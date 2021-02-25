package com.test.dos;

public class AeroplaneEngineer {

	private AirplaneBuilder airplaneBuilder;

	public void setAirplaneBuilder(AirplaneBuilder ab) {
		airplaneBuilder = ab;
	}

	public Airplane getAirplane() {
		return airplaneBuilder.getAirplane();
	}

	public void constructAirplane() {
		airplaneBuilder.createNewAirplane();
		airplaneBuilder.buildWings();
		airplaneBuilder.buildPowerplant();
		airplaneBuilder.buildAvionics();
		airplaneBuilder.buildSeats();
	}
}
