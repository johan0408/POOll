
package abstraccion;


public abstract class Animal {
    private String color;
    private double peso;
    private int edad;
    private String especie;
    private String genero;
    
    public void dormir(){
        System.out.println("El "+ especie + " duerme");
    }
    public abstract void hacerSonido();
    
    public Animal() {
    }

    public Animal(String raza, String color, double peso, int edad, String especie, String genero) {
        
        this.color = color;
        this.peso = peso;
        this.edad = edad;
        this.especie = especie;
        this.genero = genero;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
            
            
}
