package br.com.ideao.converter.model;


public class Validator {
    public boolean check(String operacao){
        return operacao.matches("[+-]?\\d*(\\.\\d+)?");
    }

    public double parseDouble(String operacao){
        return Double.parseDouble(operacao);
    }
}