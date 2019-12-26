package figura;
import punto.P2;

public class Triangulo {
    //Atributos
    private String colorLinea;
    private String colorFondo;
    private P2 Punto1 = new P2();
    private P2 Punto2 = new P2();
    private P2 Punto3 = new P2();

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public P2 getPunto1() {
        return Punto1;
    }

    public void setPunto1(P2 punto1) {
        Punto1 = punto1;
    }

    public P2 getPunto2() {
        return Punto2;
    }

    public void setPunto2(P2 punto2) {
        Punto2 = punto2;
    }

    public P2 getPunto3() {
        return Punto3;
    }

    public void setPunto3(P2 punto3) {
        Punto3 = punto3;
    }

    public void dibujar(){
        System.out.println("Dibujando un triangulo");

    }


}
