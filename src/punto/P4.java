package punto;
/**
 * Esta clase representa un punto en 3d con las coordenadas w, x, y, z
 * @author Edwin Sánchez
 */
public class P4 extends P3 {
        //Atributos
        private int w ;

    /**
     * Crea una instancia de la clase P4
     * @param w
     */
    public P4(int w) {
        this.w = w;
    }

    /**
     * Constructor vacio
     */
    public P4(){

    }

    /**
     * Crea unas instancia de la clase P4 y envia 4 parametros
     * @param x
     * @param y
     * @param z
     * @param w
     */
    public P4(int x, int y, int z, int w) {
        super(x, y, z);
        this.w = w;
    }

    /**
     * Crea una isnstancia de la clase P4 y envia un onjeto de P2
     * @param p2
     * @param z
     * @param w
     */
    public P4(P2 p2, int z, int w) {
        super(p2, z);
        this.w = w;
    }
    /**
     * Crea una instancia de la clase P3 inicializa w,x, y, z en 0
     */
    public P4(P3 p3, int w) {
        super(p3);
        this.w = w;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
    /**
     * Calcula la distancia entre dos puntos de cuatro dimensiones
     * @param p3 objeto de la clase P3
     * @return
     */
    public double CalcularDistancia(P3 p3, int w){
        return this.CalcularDistancia(p3.getX(),p3.getY(),this.w);

    }

    public double CalcularDistancia(P3 p3){
        return CalcularDistancia(p3.getX(),p3.getY(),p3.getZ());
    }

    @Override
    public String toString() {
        return "P4{" +
                "w=" + w +
                '}';
    }
}
