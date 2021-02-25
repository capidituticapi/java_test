package com.test.dos;

public class BuilderExample {

	public static void main(String[] args) {

		AeroplaneEngineer aero = new AeroplaneEngineer();
		AirplaneBuilder crop = new CropDuster("Farmer Test");

		aero.setAirplaneBuilder(crop);
		aero.constructAirplane();
		Airplane completedCropDuster = aero.getAirplane();
		System.out.println(completedCropDuster.getType()
				+ " is completed and ready for delivery to "
				+ completedCropDuster.getCustomer());

	}

}
