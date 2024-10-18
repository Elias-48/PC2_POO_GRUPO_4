/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ALVAREZ;

/**
 *
 * @author Henry
 */
import RIVERA.Forma;
import TIZNADO.Herramienta;
import TIZNADO.Lienzo;
import java.util.ArrayList;

public class AplicacionPaint {
    private Herramienta herramientaActual;
    private Lienzo lienzo;
    private ArrayList<Capa> capas;

    public AplicacionPaint(int anchoLienzo, int altoLienzo) {
        this.lienzo = new Lienzo(anchoLienzo, altoLienzo);
        this.capas = new ArrayList<>();
    }

    public void seleccionarHerramienta(Herramienta herramienta) {
        this.herramientaActual = herramienta;
    }

    public void dibujarForma(Forma forma) {
        lienzo.agregarForma(forma);
    }

    public void cambiarCapa(Capa capa) {
   
    }
}