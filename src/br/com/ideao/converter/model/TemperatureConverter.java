package br.com.ideao.converter.model;

import java.math.BigDecimal;

public class TemperatureConverter {

    public BigDecimal converterCelsiusToFahrenheit(double valor){
        return BigDecimal.valueOf(valor * 1.8 + 32);
    }

    public BigDecimal converterFahrenheitToCelsius(double valor){
        return BigDecimal.valueOf((valor - 32) /1.8);
    }

    public BigDecimal converterCelsiusToKelvin(double valor){
        return BigDecimal.valueOf(valor + 273);
    }

    public BigDecimal converterKelvinToCelsius(double valor){
        return BigDecimal.valueOf(valor - 273);
        
    }

    public BigDecimal converterKelvinToFahrenheit(double valor){
        return BigDecimal.valueOf(1.8*(valor-273)+32);
    }

    public BigDecimal converterFahrenheitToKelvin(double valor){
        return BigDecimal.valueOf((valor + 459.67) *5/9);
    }
}