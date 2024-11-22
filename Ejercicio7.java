import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        var datos = new Scanner(System.in);

        System.out.println("ingrese el numero 1");
        var numero1 = datos.nextInt();
        System.out.println("ingrese el numero 2");
        var numero2 = datos.nextInt();

        System.out.println(" Tus numeros digitados son "+ numero1+ " y " + numero2);
        System.out.println("_______________________________________");
        var suma = numero1+numero2;
        var resta = numero1 - numero2;
        var mult = numero1*numero2;
        float div = numero1/numero2;

        System.out.println("la suma de tus numeros es: "+suma);
        System.out.println("la resta de tus numeros es: "+resta);
        System.out.println("la multiplicacion de tus numeros es: "+mult);
        System.out.println("la divicion de tus numeros es: "+div);
    
        datos.close();
    }
}
    

