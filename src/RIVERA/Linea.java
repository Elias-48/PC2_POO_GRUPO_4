package RIVERA;

import java.awt.Color;

public class Linea extends Forma {
    private int xFinal;
    private int yFinal;

    public Linea(int xPosicion, int yPosicion, Color colorBorde, int xFinal, int yFinal) {
        super(xPosicion, yPosicion, colorBorde, null);
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    @Override
    public void dibujar() {
       
    }
}

