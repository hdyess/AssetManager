package com.pluralsight;

import java.time.LocalDateTime;
import java.util.Locale;

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


	public double getValue() {

		int carAge = LocalDateTime.now().getYear() - this.year;
		double japaneseMultiplier = ((odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) ? 0.75:1);
		double depreciationMultiplier = 1.0;

		if(carAge > 10){return 1000 * japaneseMultiplier;}
		else if(carAge > 6){depreciationMultiplier -= .08;}
		else if(carAge > 3){depreciationMultiplier -= .06;}
		else {depreciationMultiplier = .97;}

		return originalCost * Math.pow(depreciationMultiplier, carAge) * japaneseMultiplier;
	}

	@Override
	public String toString() {
		return this.getDescription() + " purchased on " + this.getDateAcquired() + " for " + this.getOriginalCost() + "USD.";
	}

}
