package br.com.ideao.converter.model;

import java.math.BigDecimal;

import br.com.ideao.converter.enums.Coin;

public class CoinConverterLibraEsterlina extends CoinConverter{

    @Override
    public BigDecimal convertToCoin(Coin coin, BigDecimal valueInReal) {
       coin = Coin.LIBRA_ESTERLINA;
        return super.convertToCoin(coin, valueInReal);
    }

    @Override
    public BigDecimal convertToReal(Coin coin, BigDecimal valueInCoin) {
        coin = Coin.LIBRA_ESTERLINA;
        return super.convertToReal(coin, valueInCoin);
    }
    
}
