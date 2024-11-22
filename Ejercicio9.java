import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
          
        var temperatura = new Scanner(System.in);

        System.out.println("ingrese la temperatura en GRADOS CELSIUS sin simbolo de grados: ");
        System.out.println("en tal caso de ser decimales usar la (,)");
        float celsius = temperatura.nextFloat();

        var Fahrenheit = (celsius * 9/5) + 32;
        var Kelvin = celsius + 273.15;

        System.out.println("Celsius a Fahrenheit: "+ Fahrenheit);
        System.out.println("Celsius a kelvin: "+ Kelvin);
        
        temperatura.close();
        
    }
    
}
