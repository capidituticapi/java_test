package com.test.dos;

public class CropDuster extends AirplaneBuilder {

	CropDuster(String customer) {
		super.customer = customer;
		super.type = "Crop Duster";
	}

	public void buildWings() {
		airplane.setWingspan(9f);
	}

	public void buildPowerplant() {
		airplane.setPowerplant("single piston");
	}

	public void buildAvionics() {
	}

	public void buildSeats() {
		airplane.setNumberSeats(1, 1);
	}

}
