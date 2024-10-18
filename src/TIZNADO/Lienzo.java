/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIZNADO;

/**
 *
 * @author Usuario
 */
import RIVERA.Forma;
import java.util.ArrayList;

public class Lienzo {
    private int ancho;
    private int alto;
    private ArrayList<Forma> formas;

    public Lienzo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.formas = new ArrayList<>();
    }

    public void agregarForma(Forma forma) {
        formas.add(forma);
    }

    public void limpiar() {
        formas.clear();
    }
}
