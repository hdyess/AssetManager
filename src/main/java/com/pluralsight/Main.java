package com.pluralsight;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Asset> assets = new ArrayList<>();

		assets.add(new House("Tokyo condo", "2024-07-18", 947_000.00, "2 CHOME 24-13, MARUNOCHI, CHIYODA-KU TOKYO-TO 100-6390", 1, 1954, 0));
		assets.add(new House("Amsterdam summer home", "2016-03-10", 465_000.00, "Nieuweburgsteeg 5, 1012 AG AMSTERDAM, NETHERLANDS", 2, 2304, 6982));
		assets.add(new Vehicle("My car", "2017-01-29", 24_000.00, "Honda Civic", 2014, 146_038));
		assets.add(new Vehicle("Moped", "2024-09-30", 5_000.00, "Vespa Elettrica 45", 2022, 8_038));

		for (Asset a: assets) {
			if (a instanceof Vehicle v) {
				System.out.println(v.toString() + " Year-Make-Model: " + v.getYear() + " " + v.getMakeModel());
			} else if (a instanceof House h) {
				System.out.println(h.toString() + " Address: " + h.getAddress());
			} else {
				System.out.println(a);
			}
		}



	} // main



} // Main

