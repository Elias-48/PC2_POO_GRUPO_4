package RIVERA;

import java.awt.Color;

  public class Rectangulo extends Forma {
    private float ancho;
    private float alto;

    public Rectangulo(int xPosicion, int yPosicion, Color colorBorde, Color colorRelleno, float ancho, float alto) {
        super(xPosicion, yPosicion, colorBorde, colorRelleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void dibujar() {
   
    }

    public float obtenerArea() {
        return ancho * alto;
    }
}  
