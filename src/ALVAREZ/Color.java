

package ALVAREZ;

public class Color {
    private int rojo;
    private int verde;
    private int azul;
    private float alfa;

    public Color(int rojo, int verde, int azul, float alfa) {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
        this.alfa = alfa;
    }

    public Color mezclar(Color otroColor) {
        int nuevoRojo = (this.rojo + otroColor.rojo) / 2;
        int nuevoVerde = (this.verde + otroColor.verde) / 2;
        int nuevoAzul = (this.azul + otroColor.azul) / 2;
        float nuevoAlfa = (this.alfa + otroColor.alfa) / 2;
        return new Color(nuevoRojo, nuevoVerde, nuevoAzul, nuevoAlfa);
    }
}

