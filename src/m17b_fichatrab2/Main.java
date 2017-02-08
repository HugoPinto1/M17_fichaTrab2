package m17b_fichatrab2;

/**
 * Classe Main, onde são criados dois objetos do tipo Ponto2D e são testados alguns métodos.
 * @author a13226
 * @version 1.1 08.fev.2017
 */

public class Main {

    public static void main(String[] args) {
        // Ficha de Trabalho #2
        Ponto2D p1 = new Ponto2D(0,-5); //instanciação do objeto p1 do tipo Ponto2D.
        Ponto2D p2 = new Ponto2D(0,0); //instanciação do objeto p2 do tipo Ponto2D.
        
        
        //Utilização do método toString.
        System.out.println(p1);
        System.out.println(p2);
        
        //Utilização do método distancia.
        System.out.println(p2.distancia(p1));
    }
    
}
