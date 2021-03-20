
package figuras;

public class Triangulo extends Figura {
    
    private String tipoDeTriangulo;
    
    public static final String ESCALENO = "Escaleno";
    public static final String ISOCELES = "Isoceles";
    public static final String EQUILATERO = "Equilatero";
    
    public Triangulo(){
        Figura.cantidadDeFiguras++;
    }
    
    public Triangulo(String nombre, int ancho, int alto, String tipoDeTriangulo){
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.tipoDeTriangulo = tipoDeTriangulo;
        Figura.cantidadDeFiguras++;
    }
    
    public String getTipoDeTriangulo(){
        return tipoDeTriangulo;
    }
    
    public void setTipoDeTiangulo(String tipoDeTriangulo){
        this.tipoDeTriangulo = tipoDeTriangulo;
    }
    
    public float calcularArea(){
        float area = (ancho * alto) / 2f;
        return area;
    }
    
    public String toString(){
        return "\n Figura Nombre: " + nombre + "\n Alto: " + alto + "\n Ancho: " + ancho +
                "\n Tipo de triangulo: " + tipoDeTriangulo;
    }
    
    
}
