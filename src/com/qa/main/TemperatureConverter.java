package com.qa.main;

public class TemperatureConverter {

    public float convertFahrenheitToCelsius(int fahrenheit) {
        return 5*(fahrenheit - 32)/9;
    }

    public float convertCelsiusToFahrenheit(int celsius) {
        return 9*celsius/5 + 32;
    }

    public float convertKelvinToCelsius(int kelvin) {
    	
        return (kelvin - 273.15f);
    }

    public float convertCelsiusToKelvin(int celsius) {
    	return (celsius + 273.15f);
    }

    public float convertKelvinToFahrenheit(int kelvin) {
    	
    	return 9 * (kelvin - 273.15f)/5 + 32;
    }

    public float convertFahrenheitToKelvin(int fahrenheit) {
    	
        return (fahrenheit - 32)/1.8f + 273.15f;
    }
//custom test idea - restricting input to disallow values under 0K - may need to write a custom test class for this
}