package com.pluralsight;

import java.time.LocalDateTime;

public class Vehicle extends Asset{

	private String makeModel;
	private int year;
	private int odometer;


	public Vehicle() {
		super();
	}

	public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
		super(description, dateAcquired, originalCost);
		this.makeModel = makeModel;
		this.year = year;
		this.odometer = odometer;
	}


	public String getMakeModel() {
		return makeModel;
	}

	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}


	@Override
	public double getValue() {

		int carAge = LocalDateTime.now().getYear() - this.year;
		double depreciationMultiplier = 1.0;

		depreciationMultiplier -= (n) -> {
			return 2*n;
		};


		return 0;

	}


}
