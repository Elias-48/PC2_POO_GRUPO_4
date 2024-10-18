/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIZNADO;

/**
 *
 * @author Usuario
 */
public abstract class Herramienta {
    protected String nombreHerramienta;

    public Herramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public abstract void usarHerramienta();
    
}
