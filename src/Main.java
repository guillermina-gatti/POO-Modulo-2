import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//❏ Redondear la cantidad de metros de madera necesarios para un pedido.
//        System.out.println("Ingrese la cantidad de metros necesarios para un pedido: ");
//        double numero = sc.nextDouble();
//        int resultado = Calculadora.redondearNumero(numero);
//        System.out.println("La cantidad de metros de madera necesarios son: " + resultado);

//        //int numeroRedondeado = (int) numero;
//        // Redondea sin tener en cuenta si 12.5 es mayor y siempre redondea al menor
//        long numeroRedondeado= Math.round(numero);
//        System.out.println("El numero redondeado es: "+ numeroRedondeado);

//❏ Calcular el área que ocupará una mesa circular: ingresando el diámetro solicitado por el cliente.
//  (PI*Radio^2) - utilizar método de Math.
//        System.out.println("Ingrese el diametro: ");
//        double diametro = sc.nextDouble();
//        double resultado2 = Calculadora.calcularAreaCirculo(diametro);
//        System.out.println("El area de la mesa circular es: "+resultado2);

//        double areaDeLaMesa= PI*Math.pow(diametro/2,2);
//        System.out.println("El area de la mesa circular es: "+areaDeLaMesa);

//❏ Si un cliente pide una mesa cuadrada sabiendo solo el área total, calcular cuánto
// mide cada lado de la mesa (area = L^2).
//        System.out.println("El area total es de: ");
//        double areaTotal = sc.nextDouble();
//        double resultado3= Calculadora.calcularLadosDeUnCuadrado(areaTotal);
//        System.out.println("Cada lado mide: "+resultado3);

//❏ Por último se le suma una funcionalidad para generar un número aleatorio entre 1 y 10 para que
//el usuario adivine. En caso de acertar tendrá un 15% de descuento en su próxima compra.
        System.out.println("Ingrese un numero: ");
        double numero2 = sc.nextDouble();
        Calculadora.adivinarNumero(numero2);
    }
}