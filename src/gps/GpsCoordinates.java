package gps;

public class GpsCoordinates {
	private double latitude;
	private double longitude;
	
	/**
	 * Sets latitude and longitude to
	 * @param lat
	 * @param lon
	 */
	public GpsCoordinates(double lat, double lon) {
		latitude = lat;
		longitude = lon;
		
	}
	
	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double lat) {
		this.latitude = lat;
	}
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double lon) {
		this.longitude = lon;
	}
	
	public String toString(){
		return String.format("%.6f, %.6f", latitude, longitude);
	}
}
