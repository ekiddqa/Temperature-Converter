package com.qa.main;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TempTest {
	TemperatureConverter test = new TemperatureConverter();
	@Test
	public void fahrenToCel() {

		assertEquals("Expected: 32'F approx 0'C", 0, test.convertFahrenheitToCelsius(32), 0.009);
}
	@Test
	public void celToFahren() {
	
		assertEquals("Expected: 0'C approx 32'F", 32, test.convertCelsiusToFahrenheit(0), 0.009);
	}
	
	@Test public void parity() {

		assertEquals("Expected: -40F approx -40C", test.convertFahrenheitToCelsius(-40), test.convertCelsiusToFahrenheit(-40), 0.009);
	}
	@Test
	public void fToC0() {
		

		assertEquals("Expected: 32'F approx 0'C", -17 - (77/99), (double) test.convertFahrenheitToCelsius(0), 0.009);
	}
	
	@Test
	public void fToC50() {
		
		assertEquals("Expected: 32'F approx 0'C", 10, (double) test.convertFahrenheitToCelsius(50), 0.009);
	}
	
	@Test
	public void kToC() {
		assertEquals("Expected: -273C", -273,  test.convertKelvinToCelsius(0),0.9f);
	}
	@Test
	public void kToC500() {
		assertEquals("Expected: 227C", 227,  test.convertKelvinToCelsius(500),0.9f);
	}
	
	@Test
	public void cToK() {
		assertEquals("Expected: 0k", 0,  test.convertCelsiusToKelvin(-273),0.9f);
		
	}
	
	@Test
	public void cToK200() {
		assertEquals("Expected: 473K", 473,  test.convertCelsiusToKelvin(200),0.9f);
	}
	@Test
	public void cToK500() {
		assertEquals("Expected: 773k", 773,  test.convertCelsiusToKelvin(500),0.9f);
	}

	@Test
	public void cToKMinus200() {
		assertEquals("Expected: 73k", 73,  test.convertCelsiusToKelvin(-200),0.9f);
	}
	
	@Test
	public void KtoF0() {
		assertEquals("Expected: -459F", -459, test.convertKelvinToFahrenheit(0),0.9f);
	}
	@Test
	public void KtoF255() {
		assertEquals("Expected: 0F", 0, test.convertKelvinToFahrenheit(255),0.9f);
	}
	@Test
	public void KtoF99() {
		assertEquals("Expected: -281F", -281F, test.convertKelvinToFahrenheit(99),0.9f);
	}
	
	@Test
	public void fToK0() {
		assertEquals("Expected: 255K", 255, test.convertFahrenheitToKelvin(0),0.9f);
	}
	@Test
	public void fToKMinus459() {
		assertEquals("Expected: 0K", 0, test.convertFahrenheitToKelvin(-459),0.9f);
	}
	@Test
	public void fToKMinus300() {
		assertEquals("Expected: 88K", 88, test.convertFahrenheitToKelvin(-300),0.9f);
	}
	@Test
	public void fToK500() {
		assertEquals("Expected: 533K", 533, test.convertFahrenheitToKelvin(500),0.9f);
	}

}
