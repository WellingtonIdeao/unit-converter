package br.com.ideao.converter.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.ideao.converter.enums.Coin;
import br.com.ideao.converter.interfaces.CoinConvertable;

public class CoinConverter implements CoinConvertable{

    @Override
    public BigDecimal convertToCoin(Coin coin, BigDecimal valueInReal) {
       return valueInReal.divide(coin.getFATOR_CONVERSAO(), 2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal convertToReal(Coin coin, BigDecimal valueInCoin) {
        return valueInCoin.multiply(coin.getFATOR_CONVERSAO());
    }

}