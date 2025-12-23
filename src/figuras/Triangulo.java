/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.awt.Graphics;

/**
 *
 * @author b6
 */
public class Triangulo extends FiguraGeometrica {

    private static int base;
    private static int altura;

    public Triangulo(int pBase, int pAltura) {
        super();
        base = pBase;
        altura = pAltura;
    }

    public static int getBase() {
        return base;
    }

    public static void setBase(int pbase) {
        base = pbase;
    }

    public static int getAltura() {
        return altura;
    }

    public static void setAltura(int paltura) {
        altura = paltura;
    }

    @Override
    public float Area() {
        return (float) ((base * altura) / 2);
    }

    @Override
    public float Perimetro() {
        float a = (float) Math.atan(((base / 2) / altura));
        return (float) (base + 2 * (float) ((base / 2) / Math.cos(a)));
    }

    @Override
    public void drawFigure(Graphics g) {
        int xpoints[] = {(int) (155 - (base / 2)), (int) (155), (int) (155 + (base / 2))};
        int ypoints[] = {(int) (110 + (altura / 2)), (int) (110 - altura), (int) (110 + (altura / 2))};
        int npoints = 3;
        g.drawPolygon(xpoints, ypoints, npoints);
    }
}
