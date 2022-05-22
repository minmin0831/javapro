package data_structure;

import java.util.ArrayList;
import java.util.HashMap;

public class Geo {
	// create instance by Builder object
	private final double latitude;
	private final double longitude;
	
	public static class Builder {
		private final double latitude;
		private final double longitude;
		
		public Builder(double latitude, double longitude) {
			this.latitude = latitude;
			this.longitude = longitude;
		}
		
		public Geo build() {
			return new Geo(this);
		}
	}
	
	private Geo(Builder builder) {
		latitude = builder.latitude;
		longitude = builder.longitude;
	}
	
	// Getters (No Setters due to final member variables)
	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}
	
	// factory
	public static void showGeoByObj(Geo ...goose) {
		for(Geo gg:goose) {
			System.out.printf("showGeoByObj   ) latitude: %f, longitude: %f \n", gg.getLatitude(), gg.getLongitude());
		}
	}
	
	public static void showGeoWithCountryByHashMap(HashMap<String, Geo> cities, String[] keyArray) {
		for(int i=0; i<keyArray.length; i++) {
			String key = keyArray[i];
			if(cities.containsKey(key)) {
				String country = key;
				System.out.printf("showGeoByHashMap   ) country: %s, latitude: %f, longitude: %f \n", country ,cities.get(key).getLatitude(), cities.get(key).getLongitude());
			}
		}
	}
	
	public static void showGeoByArrayList(ArrayList<Geo> goose) {
		for(int i=0; i<goose.size(); i++) {
			System.out.printf("showGeoByArrayList   ) latitude: %f, longitude: %f \n", goose.get(i).getLatitude(), goose.get(i).getLongitude());
		}
	}
	
}
