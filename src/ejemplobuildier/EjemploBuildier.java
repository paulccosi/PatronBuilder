/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobuildier;

import javax.swing.JOptionPane;
import Modelo.Cafe;
import Modelo.builder.CafeAmericanoBuilder;
import Modelo.builder.CafeCaapuccinoBuilder;
import Modelo.builder.Cafeteria;

/**
 *
 * @author Wx8-PC
 */
public class EjemploBuildier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.setBuilder(new CafeAmericanoBuilder());
        cafeteria.servirTazaCafe();
        Cafe taza = cafeteria.getTazaCafe();
        JOptionPane.showMessageDialog(null, taza);
        
       
        cafeteria.setBuilder(new CafeCaapuccinoBuilder());
        cafeteria.servirTazaCafe();
        taza = cafeteria.getTazaCafe();
        
        JOptionPane.showMessageDialog(null, taza);
        
    }
    
}
