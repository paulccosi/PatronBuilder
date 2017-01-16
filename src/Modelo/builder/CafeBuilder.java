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
public abstract class CafeBuilder {
    protected Cafe taza;
    
    public Cafe getTaza(){
        return taza;
    }
    public void crearTaza(){
        taza = new Cafe();
    }
    public abstract void buildColor();
    public abstract void buildNivelAzucar();
    public abstract void buildTemperatura();
    }
