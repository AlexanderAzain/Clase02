public class Ejercicio6 {

public static void main(String[] args) {
    var compra = 34;
    var descuento = 15;
    /* el precio pagado es igual a 34, que seria el
     * equivalente a el 85% ya que tiene un descuento del 15%
     * 100% - 15% = 85% */

    var desc = 100 - 15;
    var mult = (34*15)/desc;
    var total = compra+mult;
    System.out.println("precio con descuento del "+descuento+"% es "+ compra+ " euros");
    System.out.println("Precio sin descuento es "+ total+" euros");
    
    
}
    
}
