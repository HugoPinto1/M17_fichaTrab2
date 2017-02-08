package m17b_fichatrab2;

/**
 * Classe Ponto2D, para instaciar objetos do tipo Ponto2D.
 * @author a13226
 * @version 1.1 08.fev.2017
 */


public class Ponto2D {
    
    
    private int x;
    private int y;
    
    
    
    /**
     * Construtor sem parâmetros que define os atributos a zero. 
     */
    
    public Ponto2D(){
        x = 0;
        y = 0;
    }
    
    /**
     * Construtor que define os atributos de acordo com os parâmetros. 
     * @param x do tipo int para definir atributo x.
     * @param y do tipo int para definir atributo y.
     */
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    /**
     * 
     * @param a do tipo Ponto2D.
     * @return distância entre o ponto selecionado e o ponto passado como parâmetro. 
     */
    
    public double distancia(Ponto2D a){
        
        double dist = 0.0;
               
        dist = Math.sqrt((Math.pow(x - a.getX(),2)) + (Math.pow(y - a.getY(),2)));
        
        return dist;
    }
    /**
     *
     * @return String que indica o valor dos atributos x e y do ponto criado.
     */
    
    @Override
    public String toString(){
        return "X: " + x + ", Y: " + y;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
