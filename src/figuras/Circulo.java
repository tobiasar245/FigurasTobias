/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author b6
 */
public class Circulo extends FiguraGeometrica {

    private int radio;
    private JFrame frame;

    public Circulo(int pRadio) {
        super();
        radio = pRadio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public float Area() {
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public float Perimetro() {
        return (float) (2 * Math.PI * radio);
    }

    @Override
    public void drawFigure(Graphics g) {
        g.drawOval((int) (115 - (radio / 2)), (int) (110 - (radio / 2)), radio, radio);
    }
}
