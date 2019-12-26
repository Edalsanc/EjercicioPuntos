package main;
import punto.*;
import figura.*;

public class Principal {

    public static void main(String[] args) {
        /**
         * Constructores P2
         */
        P2 punto2 = new P2();
        P2 segundoPunto = new P2(1,2);
        P2 tercerPunto = new P2 (segundoPunto);

        /**
         * Constructores P3
         */

        P3 cuartoPunto = new P3 ();
        P3 quintoPunto = new P3 (1,2,3);
        P3 sextoPunto = new P3 (segundoPunto, 2);
        P3 septimoPunto = new P3 (quintoPunto);



        /*
        Triangulo equilatero = new Triangulo();
        equilatero.setPunto1(punto2);
        equilatero.setPunto2(segundoPunto);
        equilatero.setPunto3(tercerPunto);
        */

        /*
        Cubo cubito = new Cubo();
        cubito.getVertices()[0]=new P3(4,5,6);
        cubito.getVertices()[1]=new P3(4,5,6);
        cubito.getVertices()[2]=new P3(4,5,6);
        cubito.getVertices()[3]=new P3(4,5,6);
        cubito.getVertices()[4]=new P3(4,5,6);
        cubito.getVertices()[5]=new P3(2,3,4);
        cubito.getVertices()[6]=new P3(2,3,4);
        cubito.getVertices()[7]=new P3(2,3,4);
        cubito.getVertices()[8]=new P3(2,3,4);

        P3[] a = cubito.getVertices();

        for (P3 p:a){
            System.out.println(p);
        }

        */









        // System.out.println(punto2.CalcularDistancia(1,1));
        //System.out.println(punto2.CalcularDistancia(segundoPunto));

       /*2 pruebaLiskov = new P3();
        ((P3)pruebaLiskov).getZ();*/

    }
}
