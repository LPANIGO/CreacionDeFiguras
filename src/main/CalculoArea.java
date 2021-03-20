package main;

import figuras.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculoArea{

    private static final String RECTANGULO = "Rectangulo";
    private static final String TRIANGULO = "Triangulo";
 
    public static void main(String[] args) throws IOException {
        
        System.out.println("Modulo 3 - Calculo del area");
        
        char opcionFigura;
        
        
        do{
            System.out.println("Seleccione la figura con la que desea trabajar");
        
            System.out.println("A. Rectangulo");
            System.out.println("B. Triangulo");
            System.out.println("C. Salir");
            System.out.println("Seleccione una opcion A, B, o C");
        
            opcionFigura = (char) System.in.read();
        
            System.out.println("\nOpcion seleccionada: " + opcionFigura);
        
            System.in.read(); // Se elimina del buffer de entrada el caracter <Enter>
        
            String figuraSelecionada = null;
        
            switch (opcionFigura){
                case 'A':{
                    figuraSelecionada = RECTANGULO;
                    break;
                }
                case 'B':{
                    figuraSelecionada = TRIANGULO;
                    break;
                }
                case 'C':{
                    System.out.println("Saliendo de la aplicacion...");
                    break;
                }
                default:{
                    System.out.println("Opcion incorrecta");
                    System.out.println();
                }
            }
        
            if (figuraSelecionada != null){
                System.out.println("Usted eligio calcular el area de un " + figuraSelecionada);
                float areaFigura = 0;
                System.out.println("Ingrese los datos:");

                BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
                System.out.println("Nombre:");
                String nombreFigura = br.readLine();
                System.out.println("Alto:");
                int alto = Integer.parseInt(br.readLine());
                System.out.println("Ancho:");
                int ancho = Integer.parseInt(br.readLine());

                if (figuraSelecionada.equals(RECTANGULO)){
                    boolean esCuadrado = false;
                    if (ancho==alto){
                        esCuadrado = true;
                    }
                    Rectangulo rectangulo = new Rectangulo(nombreFigura, ancho, alto, esCuadrado);
                    areaFigura = rectangulo.calcularArea();
                    System.out.println("La figura tiene la siguientes caracteristicas: " + rectangulo.toString());
                    System.out.println();
                }
                else if(figuraSelecionada.equals(TRIANGULO)){
                    System.out.println("Seleccione con un numero el tipo de triangulo");
                    System.out.println("1.Equilatero");
                    System.out.println("2.Escaleno");
                    System.out.println("3.Isoceles");
                    

                    int trianguloSeleccionado = Integer.parseInt(br.readLine());
                    System.out.println();
                    
                    String tipoTriangulo = null;

                    switch (trianguloSeleccionado){

                        case 1:{
                            tipoTriangulo = Triangulo.EQUILATERO;
                            break;
                        }
                        case 2:{
                            tipoTriangulo = Triangulo.ESCALENO;
                            break;
                        }
                        case 3:{
                            tipoTriangulo = Triangulo.ISOCELES;
                            break;
                        }
                        default:{
                            System.out.println("Opcion incorrecta");
                        }    
                    }
                    Triangulo triangulo = new Triangulo(nombreFigura, ancho, alto, tipoTriangulo);
                    areaFigura = triangulo.calcularArea();
                    System.out.println("La figura tiene las siguientes caracteristicas: " + triangulo.toString());

                }
                System.out.println(" El area de la figura es: " + areaFigura);
                System.out.println(" La cantidad de figuras creadas es: " + Figura.cantidadDeFiguras);
                System.out.println();
                System.out.println();
            }
        
        
        }while (opcionFigura != 'C');
        
        
        
        
    }
    
}
