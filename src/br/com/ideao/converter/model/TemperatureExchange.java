package br.com.ideao.converter.model;

import java.math.BigDecimal;

import br.com.ideao.converter.interfaces.Operable;

public class TemperatureExchange implements Operable {
    TemperatureConverter temperatureConverter = new TemperatureConverter();
    private static final String CELSIUS_PARA_FAHRENHEIT = "Celsius para Fahrenheit";
    private static final String CELSIUS_PARA_KELVIN = "Celsius para Kelvin";
    private static final String KELVIN_PARA_FAHRENHEIT = "Kelvin para Fahrenheit";
    private static final String KELVIN_PARA_CELSIUS = "Kelvin para Celsius";
    private static final String FAHRENHEIT_PARA_CELSIUS = "Fahrenheit para Celsius";
    private static final String FAHRENHEIT_PARA_KELVIN = "Fahrenheit para Kelvin";

    @Override
    public BigDecimal makeOperation(String operation, double initialValue) throws Exception {
        switch (operation){
            case CELSIUS_PARA_FAHRENHEIT -> {
                return temperatureConverter.converterCelsiusToFahrenheit(initialValue);
            }
            case CELSIUS_PARA_KELVIN -> {
                return temperatureConverter.converterCelsiusToKelvin(initialValue);
            }
            case KELVIN_PARA_CELSIUS -> {
                return temperatureConverter.converterKelvinToCelsius(initialValue);
            }
            case KELVIN_PARA_FAHRENHEIT -> {
                return temperatureConverter.converterKelvinToFahrenheit(initialValue);
            }
            case FAHRENHEIT_PARA_CELSIUS -> {
                return temperatureConverter.converterFahrenheitToCelsius(initialValue);
            }
            case FAHRENHEIT_PARA_KELVIN -> {
                return temperatureConverter.converterFahrenheitToKelvin(initialValue);
            }
            default -> throw new Exception("Escolha Inválida");
        }
    }
    
}
