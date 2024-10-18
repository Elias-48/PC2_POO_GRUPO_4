/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIZNADO;

import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Pincel extends Herramienta {
    private float tamanoPincel;
    private Color colorPincel;

    public Pincel(String nombreHerramienta, float tamanoPincel, Color colorPincel) {
        super(nombreHerramienta);
        this.tamanoPincel = tamanoPincel;
        this.colorPincel = colorPincel;
    }

    @Override
    public void usarHerramienta() {
      
    }
    
}
