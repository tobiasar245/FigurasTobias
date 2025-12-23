package figuras;
import java.awt.Graphics;

public class Cuadrado extends FiguraGeometrica{
    private static int lado;
    public Cuadrado(int pLado) {
        super();
            lado = pLado;
        }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int plado) {
        plado = lado;
    }

    @Override
    public void drawFigure(Graphics g) {
       g.drawRect((int) (155 - (lado / 2)), (int) (110 - (lado / 2)), lado, lado);
    }

    @Override
    public float Area() {
        return (float) (lado * lado);
    }

    @Override
    public float Perimetro() {
        return (float) (4 * lado);
    }

}
