/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.builder;

import Modelo.Cafe;

/**
 *
 * @author Wx8-PC
 */
public class Cafeteria {
    
    private CafeBuilder builder;

    public void setBuilder(CafeBuilder builder) {
        this.builder = builder;
    }

    

   
    
    public Cafe getTazaCafe(){
        return builder.getTaza();
    }
    
    public void servirTazaCafe(){
        builder.crearTaza();
        builder.buildColor();
        builder.buildNivelAzucar();
        builder.buildTemperatura();
    }

    @Override
    public String toString() {
        return "Cafeteria{" + "builder=" + builder + '}';
    }

    

   
   
   
    
    
}
