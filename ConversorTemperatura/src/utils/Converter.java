package utils;

public class Converter {
    public static double ZERO_ABSOLUTE_KELVIN = 0;
    public static double ZERO_ABSOLUTE_CELSIUS = -273;
    public static double ZERO_ABSOLUTE_FAHRENHEIT = -459;


    public static double celsiusToFahrenheit(double celsius) {
        if (celsius<ZERO_ABSOLUTE_CELSIUS)
            throw new IllegalArgumentException("Valor abaixo do zero absoluto");
        
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + ZERO_ABSOLUTE_KELVIN;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius - ZERO_ABSOLUTE_CELSIUS;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin + ZERO_ABSOLUTE_CELSIUS;
    }
}
