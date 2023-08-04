package br.com.ideao.converter;

import javax.swing.SwingUtilities;

import br.com.ideao.converter.model.Converter;

public class App {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     * @throws Exception
     */
    private static void createAndShowGUI() throws Exception {
        new Converter("Unit Converter");    
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                createAndShowGUI();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
