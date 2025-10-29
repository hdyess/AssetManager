package com.pluralsight;

public class House extends Asset {

	String address;
	int condition;
	int squareFoot;
	int lotSize;


	public House() {
		super();
	}

	public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
		super (description, dateAcquired, originalCost);
		this.address = address;
		this.condition = condition;
		this.squareFoot = squareFoot;
		this.lotSize = lotSize;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCondition() {
		return condition;
	}

	public void setCondition(int condition) {
		this.condition = condition;
	}

	public int getSquareFoot() {
		return squareFoot;
	}

	public void setSquareFoot(int squareFoot) {
		this.squareFoot = squareFoot;
	}

	public int getLotSize() {
		return lotSize;
	}

	public void setLotSize(int lotSize) {
		this.lotSize = lotSize;
	}

	@Override
	public double getValue() {
		return (squareFoot * new int[]{180, 130, 90, 80}[condition-1]) + (.25 * lotSize);
	}

	@Override
	public String toString() {
		return this.getDescription() + " purchased on " + this.getDateAcquired() + " for " + this.getOriginalCost() + "USD.";
	}


}
