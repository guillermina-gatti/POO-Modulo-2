public class Calculadora {
    /*
    * Para el sistema de una carpintería resultaría muy útil una especie
    *  de calculadora que resuelva operaciones frecuentes de forma personalizada.Habitualmente se requiere:
    Comparar los precios de dos proveedores de madera para indicar cual es el más económico.

    Calcular las latas de barniz de 10 litros necesarias en base a la cantidad de litros que
    * se utilizarán en la semana.

    Calcular cuántos metros de tapacantos se necesitan para una mesa rectangular de melamina:
    * calcula el perímetro(2*(b+h)).

    * */

    //Clase auxiliar con métds estáticos, no requiero instancias --> no necesito un constructor

//    //suponer que luego utilizo el valor para armar un presupuesto
//    public static double compararPreciosProovedores(double precio1,double precio2){
//        double precioMasEconomico=Math.min(precio1,precio2);
//        System.out.println(" El precio más econo. del proveedor es "+ precioMasEconomico );
//        return precioMasEconomico;
//
//    }
//
//
//    public static int calcularCantidadLatas( double totalLitros ){
//        //cada lata tiene 10L
//        double cantidadLatas= totalLitros/10;
//        int redondeo= (int) Math.ceil(cantidadLatas);
//        //sout
//        return redondeo;
//    }
//
//
//
//    public static int calcularCantidadTapacantosMesaRectangular( double base, double altura){
//        double perimetroRectangular= (base+altura)*2;
//        int redondeo= (int) Math.ceil(perimetroRectangular);
//        return redondeo;
//    }



    public static int redondearNumero(double numero1) {
        return (int) Math.ceil(numero1);
    }
    public static double calcularAreaCirculo(double diametro){
        double PI= Math.PI;
        return PI*Math.pow(diametro/2,2);
    }
    public static double calcularLadosDeUnCuadrado(double area){
        return Math.sqrt(area);
    }
    public static void adivinarNumero(double numero){
        double numAleatorio=3;//Math.random()*10;
        int numConvertido= (int)Math.ceil(numAleatorio);
        if(numero == numConvertido){
            System.out.println("Usted tiene un descuento del 15% en su proxima compra, el numero es: "+ numConvertido);
        }else{
            System.out.println("no adivino "+ numConvertido);
        }

    }
}
