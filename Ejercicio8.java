import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Datos del rectangulo");
        var rectangulo = new Scanner(System.in);

        System.out.println("ingresa la longitud del rectangulo");
        int longitud = rectangulo.nextInt();
        System.out.println("ngresa el ancho del rectangulo");
        var ancho = rectangulo.nextInt();

        //cacular area
        var area = longitud * ancho;
        System.out.println("El area del rectangulo es: "+area);

        //calcular perimetro
        var perimetro = (longitud*2)+(ancho*2);
        System.out.println("El perimetro del rectangulo es: "+perimetro);

        rectangulo.close();

    }
    
}
