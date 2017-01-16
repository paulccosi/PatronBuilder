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
public class CafeAmericanoBuilder extends  CafeBuilder{

    @Override
    public void buildColor() {
        taza.setColor("Oscuro");  
    }

    @Override
    public void buildNivelAzucar() {
        taza.setNivelAzucar("Medio");
    }

    @Override
     public void buildTemperatura() {
        taza.setTemperatura("Muy alta");
    }
    
    
}
