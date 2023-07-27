package br.com.ideao.converter.interfaces;

import java.math.BigDecimal;

import br.com.ideao.converter.enums.Coin;

public interface CoinConvertable {
    BigDecimal convertToCoin(Coin coin, BigDecimal valueInReal);
    BigDecimal convertToReal(Coin coin, BigDecimal valueInCoin);
}
