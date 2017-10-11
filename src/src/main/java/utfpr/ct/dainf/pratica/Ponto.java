package utfpr.ct.dainf.pratica;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 *
 * @author
 */
public class Ponto {

    double x;
    
    double y;
    double z;

    /**
     *
     */
    public Ponto(){
        this.x=0.0;
        this.y=0.0;
        this.z=0.0;
    }
    
    
    /**
     * Retorna o nome não qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public String getNome() {
        return getClass().getSimpleName();
    }
    
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(double z) {
        this.z = z;
    }
    
    public Ponto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    
    @Override
    public String toString() {
        return getClass().getSimpleName() +" (" + this.x + ","+ this.y + ","+ this.z + ")";
    }
    
    @Override
    public boolean equals(Object p){
        if(p instanceof Ponto){
            return (((Ponto)p).x==this.x && ((Ponto)p).y==this.y && ((Ponto)p).z==this.z);
        }
        else return false;
    }
    
    public double dist(double codX, double codY, double codZ){
        double d;
        
        d = Math.sqrt(Math.pow((codX -this.x), 2) + Math.pow((codY -this.y), 2) + Math.pow((codZ -this.z), 2));
        
        return d;
    }

}
