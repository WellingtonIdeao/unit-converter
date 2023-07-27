package br.com.ideao.converter.model;

import java.math.BigDecimal;

import br.com.ideao.converter.enums.Coin;
import br.com.ideao.converter.interfaces.Operable;

public class CurrencyExchange implements Operable {

    private static final String REAL_TO_DOLAR = "De Real para Dólar";
    private static final String REAL_TO_EURO = "De Real para Euro";
    private static final String REAL_TO_LIBRA_ESTERLINA = "De Real para Libra Esterlina";
    private static final String REAL_TO_PESO_ARGENTINO = "De Real para Peso Argentino";
    private static final String REAL_TO_PESO_CHILENO = "De Real para Peso Chileno";
    private static final String DOLAR_TO_REAL = "De Dólar para Real";
    private static final String EURO_TO_REAL = "De Euro para Real";
    private static final String LIBRA_ESTERLINA_TO_REAL = "De Libra Esterlina para Real";
    private static final String PESO_ARGENTINO_TO_REAL = "De Peso Argentino para Real";
    private static final String PESO_CHILENO_TO_REAL = "De Peso Chileno para Real";
    private CoinConverterDolar coinConverterToDolar = new CoinConverterDolar();
    private CoinConverterEuro coinConverterToEuro = new CoinConverterEuro();
    private CoinConverterLibraEsterlina coinConverterToLibraEsterlina = new CoinConverterLibraEsterlina();
    private CoinConverterPesoArgentino coinConverterToPesoArgentino = new CoinConverterPesoArgentino();
    private CoinConverterPesoChileno coinConverterToPesoChileno = new CoinConverterPesoChileno();

    private Coin coin;
    
    @Override
    public BigDecimal makeOperation(String operation, double initialValue) throws Exception {
        switch (operation) {
            case REAL_TO_DOLAR -> {
                return coinConverterToDolar.convertToCoin(coin, BigDecimal.valueOf(initialValue));
            }
            case REAL_TO_EURO -> {
                return coinConverterToEuro.convertToCoin(coin, BigDecimal.valueOf(initialValue));
            }
            case REAL_TO_LIBRA_ESTERLINA -> {
                return coinConverterToLibraEsterlina.convertToCoin(coin, BigDecimal.valueOf(initialValue));
            }
            case REAL_TO_PESO_ARGENTINO -> {
                return coinConverterToPesoArgentino.convertToCoin(coin, BigDecimal.valueOf(initialValue));
            }
            case REAL_TO_PESO_CHILENO -> {
                return coinConverterToPesoChileno.convertToCoin(coin, BigDecimal.valueOf(initialValue));
            }
            case DOLAR_TO_REAL -> {
                return coinConverterToDolar.convertToReal(coin, BigDecimal.valueOf(initialValue));
            }
            case EURO_TO_REAL -> {
                return coinConverterToEuro.convertToReal(coin, BigDecimal.valueOf(initialValue));
            }
            case LIBRA_ESTERLINA_TO_REAL -> {
                return coinConverterToLibraEsterlina.convertToReal(coin, BigDecimal.valueOf(initialValue));
            }
            case PESO_ARGENTINO_TO_REAL -> {
                return  coinConverterToPesoArgentino.convertToReal(coin, BigDecimal.valueOf(initialValue));
            }
            case PESO_CHILENO_TO_REAL -> {
                return coinConverterToPesoChileno.convertToReal(coin, BigDecimal.valueOf(initialValue));
            }
            default -> throw new Exception("ESCOLHA INVÁLIDA");
        }
    }
    
}
