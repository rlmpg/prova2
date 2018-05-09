

import utfpr.ct.dainf.pratica.Ponto;
import utfpr.ct.dainf.pratica.PontoXY;
import utfpr.ct.dainf.pratica.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * @author Chin
 */
public class Pratica {

    public static void main(String[] args) {
        PontoXZ xz = new PontoXZ(-3, 2);
        PontoXY xy = new PontoXY(0, 2);
        double dist = xz.dist(xy);
        System.out.println("Distancia = "+ dist);
    }   
    
    
    
}
