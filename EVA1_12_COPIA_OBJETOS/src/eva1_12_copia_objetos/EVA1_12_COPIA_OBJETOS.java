/*
 * "
 * "
 */
package eva1_12_copia_objetos;

/**
 *
 * @author Usuario
 */
public class EVA1_12_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor,copiaValor;
        
        valor = 100;
        copiaValor = valor;
        
        System.out.println("Valor: "+ valor);
        System.out.println("Copia: "+ copiaValor);
        valor++;
        System.out.println("Valor: "+ valor);
        System.out.println("Copia: "+ copiaValor);
        
        //Ahora con objetos
        PruebaValor prueba = new PruebaValor();
        prueba.x=1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba;
        System.out.println("Ahora con objeto");
        System.out.println("Prueba: "+ prueba.x);
        System.out.println("PruebaCopia: "+pruebaCopia.x);
        prueba.x++;
        System.out.println("Prueba: "+ prueba.x);
        System.out.println("PruebaCopia: "+pruebaCopia.x);
        
    }
    
    
}
    class PruebaValor{
        int x;
    }
