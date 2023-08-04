package br.com.ideao.converter.interfaces;

import java.math.BigDecimal;

public interface Operable {
    BigDecimal makeOperation(String operacao, double initialValue) throws Exception;
}
