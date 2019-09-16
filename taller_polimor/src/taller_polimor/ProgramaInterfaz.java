
package taller_polimor;


public class ProgramaInterfaz {

 
    public static void main(String[] args) {
       Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        
        Burro burro = new Burro();
         hacerCantar(burro);
    }
    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 

}
