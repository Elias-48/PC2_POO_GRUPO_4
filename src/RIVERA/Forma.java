package RIVERA;

import java.awt.Color;

    public abstract class Forma {
    protected int xPosicion;
    protected int yPosicion;
    protected Color colorBorde;
    protected Color colorRelleno;

    public Forma(int xPosicion, int yPosicion, Color colorBorde, Color colorRelleno) {
        this.xPosicion = xPosicion;
        this.yPosicion = yPosicion;
        this.colorBorde = colorBorde;
        this.colorRelleno = colorRelleno;
    }

    public abstract void dibujar();

    public void mover(int x, int y) {
        this.xPosicion = x;
        this.yPosicion = y;
    }

    public void redimensionar(float factor) {
    }
}
