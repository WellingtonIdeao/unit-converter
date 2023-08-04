package br.com.ideao.converter.enums;

public enum TypeConvertion {

    REAL_PARA_DOLAR("De Real para Dólar", "Dolares"),
    REAL_PARA_EURO("De Real para Euro", "Euros"),
    REAL_PARA_LIBRA_ESTERLINA("De Real para Libra Esterlina", "Libras Esterlinas"),
    REAL_PARA_PESO_ARGENTINO ("De Real para Peso Argentino", "Pesos Argentinos"),
    REAL_PARA_PESO_CHILENO("De Real para Peso Chileno", "Pesos Chilenos"),
    DOLAR_PARA_REAL("De Dólar para Real", "Reais"),
    EURO_PARA_REAL("De Euro para Real", "Reais"),
    LIBRA_ESTERLINA_PARA_REAL("De Libra Esterlina para Real", "Reais"),
    PESO_ARGENTINO_PARA_REAL("De Peso Argentino para Real", "Reais"),
    PESO_CHILENO_PARA_REAL("De Peso Chileno para Real", "Reais"),

    CELSIUS_PARA_FAHRENHEIT("Celsius para Fahrenheit", "Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius para Kelvin", "Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin para Fahrenheit", "Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin para Celsius", "Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit para Celsius", "Ceusius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit para Kelvin", "Kelvin");


    private String description;
    private String reprValueConverted;

    TypeConvertion(String description, String reprValueConverted) {
        this.description = description;
        this.reprValueConverted = reprValueConverted;
    }

    @Override
    public String toString(){
        return this.description;
    }
    
    public String getReprValueConverted() {
        return this.reprValueConverted;
    }
    
}
