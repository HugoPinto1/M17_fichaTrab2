package m17b_fichatrab2;

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
     * Construtor sem parâmetros que define os atributos de acordo com os parâmetros. 
     * @param x
     * @param y 
     */
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    
    
    
    public double distancia(Ponto2D a){
        
        double distancia = 0.0;
               
        
        
        return distancia;
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
