package br.com.ideao.converter.enums;

import java.math.BigDecimal;

public enum Coin {
    DOLAR(BigDecimal.valueOf(4.73)),
    EURO(BigDecimal.valueOf(5.19)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(6.08)),
    PESO_ARGENTINO(BigDecimal.valueOf(0.017)),
    PESO_CHILENO(BigDecimal.valueOf(0.0057));

    private BigDecimal FATOR_CONVERSAO;

    Coin(BigDecimal FATOR_CONVERSAO){
        this.FATOR_CONVERSAO = FATOR_CONVERSAO;
    }

    public BigDecimal getFATOR_CONVERSAO() {
        return this.FATOR_CONVERSAO;
    }
}
