
package figuras;


public abstract class Figura {
    
    protected String nombre;
    protected int ancho;
    protected int alto;
    
    public static int cantidadDeFiguras;

    public String getNombre() {
        return nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public abstract float calcularArea();
    
    public String toString(){
        return "Figura Nombre: " + nombre + "\n\tAlto: " + alto + "\n\tAncho: " + ancho;
    }
    
    
    
}
