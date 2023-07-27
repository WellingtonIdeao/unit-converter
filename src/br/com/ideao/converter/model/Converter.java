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
            String operation = (String)JOptionPane.showInputDialog(this, "Escolha uma operacao", "Converter",
            JOptionPane.QUESTION_MESSAGE, null, operations.keySet().toArray() ,"Escolha");
            
            if(operation != null) {
                Operable operationConvertion = null;  
                String op = null;
                switch(operations.get(operation)) {
                    case 1:
                        operationConvertion = new CurrencyExchange();
                        List<String> typeConvertions = new ArrayList<>();
                        typeConvertions.add(TypeConvertion.REAL_PARA_DOLAR.getDescription());
                        typeConvertions.add(TypeConvertion.REAL_PARA_EURO.getDescription());
                        typeConvertions.add(TypeConvertion.REAL_PARA_LIBRA_ESTERLINA.getDescription());
                        typeConvertions.add(TypeConvertion.REAL_PARA_PESO_ARGENTINO.getDescription());
                        typeConvertions.add(TypeConvertion.REAL_PARA_PESO_CHILENO.getDescription());
                        typeConvertions.add(TypeConvertion.DOLAR_PARA_REAL.getDescription());
                        typeConvertions.add(TypeConvertion.EURO_PARA_REAL.getDescription());
                        typeConvertions.add(TypeConvertion.LIBRA_ESTERLINA_PARA_REAL.getDescription());
                        typeConvertions.add(TypeConvertion.PESO_ARGENTINO_PARA_REAL.getDescription());
                        typeConvertions.add(TypeConvertion.PESO_CHILENO_PARA_REAL.getDescription());


                        op = (String)JOptionPane.showInputDialog(null, "Escolha uma moeda",
                            "Moedas", JOptionPane.QUESTION_MESSAGE, null,
                            typeConvertions.toArray(), "Escolha");     
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(this,"Conversor de temperatura");
                        break;
                }

                String input = JOptionPane.showInputDialog("Insira um valor");
                Validator  validator = new Validator();
                
                if(!validator.check(input)) {    
                    JOptionPane.showMessageDialog(this, "Valor Inválido");
                }else {
                    double initialValue = validator.parseDouble(input);
                    BigDecimal convertedValue = operationConvertion.makeOperation(op, initialValue);
                    JOptionPane.showMessageDialog(this, convertedValue);
                }

            }
            toContinue = toRepeat();    
            
        }
        finishedConverter();   
    }

    private void finishedConverter() {
        JOptionPane.showMessageDialog(this, "Programa finalizado");
        System.exit(0);
    }

    private boolean toRepeat() {
        int response = JOptionPane.showConfirmDialog(this, "Deseja continuar?");
        return response ==0; 
    }
}