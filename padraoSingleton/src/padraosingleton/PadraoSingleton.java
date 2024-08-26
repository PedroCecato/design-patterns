package padraosingleton;

/**
 *
 * @author Luiz Gustavo Gomes Damasceno
 */

public class PadraoSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arma arma1 = Arma.getInstance();
        Arma arma2 = Arma.getInstance();
        
        arma1.setNome("AUG");
        arma1.setCadenciaTiros(650);
        
        arma2.setNome("M-16");
        arma2.setCadenciaTiros(950);
        
        System.out.println("A arma " + arma1.getNome() + 
                " possui cadência de tiro de " + arma1.getCadenciaTiros() + "tiros por minuto!");
        
        System.out.println("A arma " + arma2.getNome() + 
                " possui cadência de tiro de " + arma2.getCadenciaTiros() + "tiros por minuto!");
    }
    
}
