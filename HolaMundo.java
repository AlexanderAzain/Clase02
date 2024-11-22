import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Alexander");
        System.out.println("hajshajshahs");
        System.out.printf("aqui va una cadena: %s%n", "cesar");
        System.out.printf("hola: %s que edad tienes?, tengo %d años %n", "Alexander,",21);
        System.out.printf("Soy de %s desde el año %d%n", "contadero",2003);

        var entrada = new Scanner(System.in);
        System.out.println("por favor ingrese un numero entero: ");
        var entero = entrada.nextInt();

        System.out.println(entero);

        entrada.close();



    }
  

}
