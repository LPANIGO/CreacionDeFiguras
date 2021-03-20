
package figuras;


public class Rectangulo extends Figura {
  
    private boolean cuadrado;
    
    public Rectangulo(){
        Figura.cantidadDeFiguras++;
    }
    
    public Rectangulo(String nombre, int ancho, int alto, boolean cuadrado){
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.cuadrado = cuadrado;
        Figura.cantidadDeFiguras++;
    }
    public void setCuadrado(boolean cuadrado){
        this.cuadrado = cuadrado;
    }
    
    public boolean isCuadrado(){
        return cuadrado;
    }

    public float calcularArea(){
        float area = (float) ancho * alto;
        return area;
    }
    
    public String toString(){
        return "\n Figura (Nombre: " + nombre + " Alto: " + alto + " Ancho: " + ancho +
                " Es cuadrado?: " + cuadrado + ")";
    }
}
