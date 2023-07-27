package br.com.ideao.converter.model;

import java.math.BigDecimal;

import br.com.ideao.converter.enums.Coin;

public class CoinConverterEuro  extends CoinConverter{

    @Override
    public BigDecimal convertToCoin(Coin coin, BigDecimal valueInReal) {
       coin = Coin.EURO;
        return super.convertToCoin(coin, valueInReal);
    }

    @Override
    public BigDecimal convertToReal(Coin coin, BigDecimal valueInCoin) {
        coin = Coin.EURO;
        return super.convertToReal(coin, valueInCoin);
    }
    
}
