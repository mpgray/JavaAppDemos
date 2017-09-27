/**
 * 
 */
package gps;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author graymi
 *
 */
public class GpsCoordinatesTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link gps.GpsCoordinates#GpsCoordinates(double, double)}.
	 * Test several doubles and make sure everything is ok. Also checks if GpsCoords exists
	 */
	@Test
	public void testGpsCoordinates() {
		double latTest = 1.5;
		double lonTest = 1.5;
		GpsCoordinates myCoordinates;
		do{
			myCoordinates = new GpsCoordinates(latTest,lonTest);
			assertNotNull(myCoordinates);
			latTest++;
			lonTest++;
		}while(latTest < 10 && lonTest < 10);
	}

	/**
	 * Test method for {@link gps.GpsCoordinates#getLatitude()}.
	 * test several values of lat and get them
	 */
	@Test
	public void testGetLatitude() {	
		double latTest = 1.5;
		do{
			GpsCoordinates myCoordinates = new GpsCoordinates(latTest,1);
			assertNotNull(myCoordinates.getLatitude());
			assertTrue(myCoordinates.getLatitude() == latTest);
			latTest++;
		}while(latTest < 10);
	}

	/**
	 * Test method for {@link gps.GpsCoordinates#setLatitude(double)}.
	 * checks to make sure setLatitude is changing the value
	 */
	@Test
	public void testSetLatitude() {
		GpsCoordinates myCoordinates = new GpsCoordinates(1,1);
		myCoordinates.setLatitude(2);
		assertFalse(myCoordinates.getLatitude() == 1);
		myCoordinates.setLatitude(1);
		assertTrue(myCoordinates.getLatitude() == 1);		
	}

	/**
	 * Test method for {@link gps.GpsCoordinates#getLongitude()}.
	 * test several values of long and gets them
	 * 
	 */
	@Test
	public void testGetLongitude() {
		double lonTest = 1.5;
		do{
			GpsCoordinates myCoordinates = new GpsCoordinates(1,lonTest);
			assertNotNull(myCoordinates.getLongitude());
			assertTrue(myCoordinates.getLongitude() == lonTest);
			lonTest++;
		}while(lonTest < 10);
	}

	/**
	 * Test method for {@link gps.GpsCoordinates#setLongitude(double)}.
	 * Make sure setLongitude is changing the values
	 */
	@Test
	public void testSetLongitude() {
		GpsCoordinates myCoordinates = new GpsCoordinates(1,1);
		myCoordinates.setLongitude(2);	
		assertFalse(myCoordinates.getLongitude() == 1);
		myCoordinates.setLongitude(1);
		assertTrue(myCoordinates.getLongitude() == 1);
	}

	/**
	 * Test method for {@link gps.GpsCoordinates#toString()}.
	 */
	@Test
	public void testToString() {
		GpsCoordinates myCoordinates = new GpsCoordinates(1,1);
		assertNotNull(myCoordinates);
		assertNotNull(myCoordinates.toString());
	}

}
