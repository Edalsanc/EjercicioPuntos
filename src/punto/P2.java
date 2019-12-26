package punto;

/**
 * Esta clase representa un punto en 2d con las coordenadas x, y
 * @author Edwin Sánchez
 */
public class P2 {
    //Atributos
    private int x;
    private int y;

    /**
     * Crea una instancia de la clase P2 inicializa x, y en 0
     */
    public P2(){

        this.x = this.y=0;
    }

    /**
     * Crea una instancia del objeto P2
     * @param x coordenada x
     * @param y coordenada y
     */

    public P2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instancia del objeto P2
     * @param p2 es un objeto de punto de 2 dimensiones (P2)
     */
    public P2(P2 p2){
        this.x=p2.getX();
        this.y= p2.getY();
    }

    /**
     * Retorna el valor de x
     * @return coordenada x
     */
    public int getX(){
        return this.x;
    }

    /**
     * Asigna el valor de x
     * @param   x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Retorna el valor de y
     * @return coordenada y
     */
    public int getY(){
        return this.y;
    }

    /**
     * Asigna el valor de y
     * @param y
     */
    public void setY(int y ){
        this.y=y;
    }

    /**
     * Calcula la distancia entre dos puntos
     * @param x coordenada x del otro punto
     * @param y coodenada y del otro punto
     */
    public double CalcularDistancia(int x,int y){
        double d=0 ;
        double diferenciaCuadradosX = Math.pow(this.x - x,2);
        double diferenciaCuadradosY = Math.pow(this.y - y,2);

       return d= Math.sqrt(diferenciaCuadradosX+diferenciaCuadradosY);

    }

    /**
     * Calcula la distancia de los 2 puntos del objeto
     * @param p2 objeto de la clase P2
     * @return d
     */
    public double CalcularDistancia(P2 p2){
        return this.CalcularDistancia(p2.getX(),p2.getY());

    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("x:").append(this.x).append("y:").append(this.y);
       return sb.toString();

    }
}
