package RIVERA;

import java.awt.Color;

    public class Circulo extends Forma {
    private float radio;

    public Circulo(int xPosicion, int yPosicion, Color colorBorde, Color colorRelleno, float radio) {
        super(xPosicion, yPosicion, colorBorde, colorRelleno);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
      
    }

    public float obtenerArea() {
        return (float) (Math.PI * radio * radio);
    }
}
