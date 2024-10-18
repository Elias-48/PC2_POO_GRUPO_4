/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ALVAREZ;

import TIZNADO.Lienzo;

/**
 *
 * @author Henry
 */
public class Capa {
    private Lienzo lienzo;
    private boolean visibilidad;

    public Capa(Lienzo lienzo) {
        this.lienzo = lienzo;
        this.visibilidad = true;
    }

    public void mostrar() {
        visibilidad = true;
    }

    public void ocultar() {
        visibilidad = false;
    }
}  

