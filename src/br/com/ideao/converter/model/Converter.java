// janela principal
package br.com.ideao.converter.model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import br.com.ideao.converter.enums.TypeConvertion;
import br.com.ideao.converter.interfaces.Operable;

public class Converter extends JFrame {
    
    public Converter(String title) throws Exception{
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
        Map<String, Integer> operations = new HashMap<>();
        operations.put("Converter moeda", 1);
        operations.put("Converter temperatura", 2);

        boolean toContinue = true;
        
        while(toContinue) {
            String operation = (String)JOptionPane.showInputDialog(this, "Escolha uma opção", "Converter",
            JOptionPane.QUESTION_MESSAGE, null, operations.keySet().toArray() ,"Escolha");
            
            if(operation != null) {
                Operable operationConvertion = null;  
                String op = null;
                TypeConvertion typeConvertion = null;
                List<TypeConvertion> typeConvertions = new ArrayList<>();

                switch(operations.get(operation)) {
                    case 1:
                        operationConvertion = new CurrencyExchange();
                       
                        typeConvertions.add(TypeConvertion.REAL_PARA_DOLAR);
                        typeConvertions.add(TypeConvertion.REAL_PARA_EURO);
                        typeConvertions.add(TypeConvertion.REAL_PARA_LIBRA_ESTERLINA);
                        typeConvertions.add(TypeConvertion.REAL_PARA_PESO_ARGENTINO);
                        typeConvertions.add(TypeConvertion.REAL_PARA_PESO_CHILENO);
                        typeConvertions.add(TypeConvertion.DOLAR_PARA_REAL);
                        typeConvertions.add(TypeConvertion.EURO_PARA_REAL);
                        typeConvertions.add(TypeConvertion.LIBRA_ESTERLINA_PARA_REAL);
                        typeConvertions.add(TypeConvertion.PESO_ARGENTINO_PARA_REAL);
                        typeConvertions.add(TypeConvertion.PESO_CHILENO_PARA_REAL);

                        typeConvertion = (TypeConvertion)JOptionPane.showInputDialog(null,
                            "Escolha uma moeda para a qual você deseja trocar seu dinheiro",
                            "Moedas", JOptionPane.QUESTION_MESSAGE, null,
                            typeConvertions.toArray(), "Escolha");
                        if(typeConvertion != null) {
                            op = typeConvertion.toString();
                        }        
                        break;
                    case 2:
                        operationConvertion = new TemperatureExchange();
                        typeConvertions.add(TypeConvertion.CELSIUS_PARA_FAHRENHEIT);
                        typeConvertions.add(TypeConvertion.CELSIUS_PARA_KELVIN);
                        typeConvertions.add(TypeConvertion.FAHRENHEIT_PARA_CELSIUS);
                        typeConvertions.add(TypeConvertion.FAHRENHEIT_PARA_KELVIN);
                        typeConvertions.add(TypeConvertion.KELVIN_PARA_CELSIUS);
                        typeConvertions.add(TypeConvertion.KELVIN_PARA_FAHRENHEIT);

                        typeConvertion = (TypeConvertion)JOptionPane.showInputDialog(null,
                                "Escolha a escala de temperatura",
                                "Moedas", JOptionPane.QUESTION_MESSAGE, null, typeConvertions.toArray(),
                                "Escolha");
                        if(typeConvertion != null){
                            op = typeConvertion.toString();
                        }        
                        break;
                }
               
                if(op != null){
                    String input = JOptionPane.showInputDialog("Insira um valor");
                    Validator  validator = new Validator();
                    if(input!= null){
                        if(!validator.check(input)) {    
                            JOptionPane.showMessageDialog(this, "Valor Inválido");
                        }else {
                            double initialValue = validator.parseDouble(input);
                            BigDecimal convertedValue = operationConvertion.makeOperation(op, initialValue);
                            showConvertedValue(convertedValue, typeConvertion.getReprValueConverted());
                            
                        }
                    }    
                }
            }
            toContinue = toRepeat();
        }
           
    }
    
    private void showConvertedValue(BigDecimal convertedValue, String reprValueConverted){
        JOptionPane.showMessageDialog(this, "O valor da conversão é "+convertedValue + " " + reprValueConverted);
    }

    private void finishedConverter(String msg) {
        JOptionPane.showMessageDialog(this, msg);
        System.exit(0);
    }

    private boolean toRepeat() {
        boolean b = false;

        int optionselect = JOptionPane.showConfirmDialog(this, "Deseja continuar?"); 
        if(optionselect == 0){
            b = true;
        }else if(optionselect == 1){
            b = false;
            finishedConverter("Programa finalizado");
        }else {
            b = false;
            finishedConverter("Programa concluído");
        }    
        return b; 
    }
}