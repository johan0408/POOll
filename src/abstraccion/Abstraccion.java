
package abstraccion;

public class Abstraccion {

    public static void main(String[] args) {
       Perro p = new Perro();
       p.setEspecie("Perro");
       p.dormir();
       p.hacerSonido();
       Gato g = new Gato();
       g.setEspecie("Gato");
       g.dormir();
       g.hacerSonido();
    }
    
}
