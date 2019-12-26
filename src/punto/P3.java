package punto;

/**
 * Esta clase representa un punto en 3d con las coordenadas x, y, z
 * @author Edwin Sánchez
 */
public class P3 extends P2 {
   //Atributos
    private int z ;

    /**
     * Crea una instancia de la clase P2 inicializa x, y, z en 0
     */
    public P3() {
        super();
        this.z = 0;

    }

    /**
     *Crea una instancia u objeto de la clase P3
     * @param x
     * @param y
     * @param z
     */
    public P3(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    /**
     * Crea una instancia de la clase P3
     * @param p2
     * @param z
     */
    public P3(P2 p2, int z) {
        super(p2);
        this.z = z;
    }

    /**
     * Crea una instancia de la clase P3
     * @param p3
     */
    public P3(P3 p3){
        this(p3.getY(),p3.getX(),p3.getZ());
    }

    /**
     * Retorna el valor de la variable z
     * @return z
     */
    public int getZ() {
        return z;
    }

    /**
     * Asigna valor a la variable z
     * @param z
     */
    public void setZ(int z) {

        this.z = z;
    }

    /**
     * Calcula la distancia entre dos puntos de tres dimensiones
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @return d
     */
    public double CalcularDistancia(int x,int y,int z){
        double d=0 ;
        double diferenciaCuadradosX = Math.pow(super.getX() - x,2);
        double diferenciaCuadradosY = Math.pow(super.getY() - y,2);
        double diferenciaCuadradosZ = Math.pow(this.z - z,2);

        return d= Math.sqrt(diferenciaCuadradosX+diferenciaCuadradosY);

    }

    /**
     * Calcula la distancia entre dos puntos de tres dimensiones
     * @param p2 objeto de la clase P2
     * @return
     */
    public double CalcularDistancia(P2 p2, int z){
        return this.CalcularDistancia(p2.getX(),p2.getY(),this.z);

    }

    public double CalcularDistancia(P3 p3){
        return CalcularDistancia(p3.getX(),p3.getY(),p3.getZ());
    }



    @Override
    public String toString() {

        return super.toString()+"Z: "+ this.getZ();
    }
}
