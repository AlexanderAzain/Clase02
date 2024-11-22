import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var usuario = new Scanner(System.in);

        System.out.println("calcular la media aritmética de tres números");
        System.out.println("ingresar numero 1: ");
        var num1 = usuario.nextDouble();
        System.out.println("ingresar numero 2: ");
        var num2 = usuario.nextDouble();
        System.out.println("ingresar numero 3: ");
        var num3 = usuario.nextDouble();

        System.out.println("Media Aritmetica");
        Double medArt = (num1+num2+num3)/3;
        
        System.out.println("Media aritmetica: "+medArt);


        usuario.close();

    }
    
}

