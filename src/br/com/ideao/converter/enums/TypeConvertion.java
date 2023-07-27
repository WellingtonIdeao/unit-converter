package br.com.ideao.converter.enums;

public enum TypeConvertion {

    REAL_PARA_DOLAR("De Real para Dólar"),
    REAL_PARA_EURO("De Real para Euro"),
    REAL_PARA_LIBRA_ESTERLINA("De Real para Libra Esterlina"),
    REAL_PARA_PESO_ARGENTINO ("De Real para Peso Argentino"),
    REAL_PARA_PESO_CHILENO("De Real para Peso Chileno"),
    DOLAR_PARA_REAL("De Dólar para Real"),
    EURO_PARA_REAL("De Euro para Real"),
    LIBRA_ESTERLINA_PARA_REAL("De Libra Esterlina para Real"),
    PESO_ARGENTINO_PARA_REAL("De Peso Argentino para Real"),
    PESO_CHILENO_PARA_REAL("De Peso Chileno para Real");


    private String description;
    
    TypeConvertion(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return this.description;
    }

    
}
