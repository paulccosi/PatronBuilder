/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.builder;

/**
 *
 * @author Wx8-PC
 */
public class CafeCaapuccinoBuilder extends  CafeBuilder{

   
   

    
    @Override
    public void buildColor() {
        taza.setColor("Claro");
    }

    @Override
    public void buildNivelAzucar() {
        taza.setNivelAzucar("Alto");
    }

    @Override
    public void buildTemperatura() {
        taza.setTemperatura("Frio");
    }
    
}
