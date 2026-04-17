import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Inicializar objetos
        Libro libro1= new Libro(12371241, "Orgullo y prejuicio", "Jane Austen", 100, 10000, 'c');
        Libro libro2= new Libro(12411237, "Ciudades de papel", "John Green", 100, 8000, 'a');

//        System.out.println("El autor de "+libro1.getTitulo()+" es "+libro1.getAutor()+" ");
//        System.out.println("El autor de "+libro2.getTitulo()+" es "+libro2.getAutor()+" ");
//        System.out.println("El costo del libro: "+libro1.getTitulo()+" es de $"+libro1.getCosto());

        //Consultar su disponibilidad
//        System.out.println("El stock es del libro:"+libro2.getTitulo()+" es de: "+libro2.getStock());

        //Actualizar stock
//        libro1.setStock(-100);//Lanza el mensaje de que el stock debe ser mayor a cero
//        libro1.setStock(100);
//
//        System.out.println("El stock es: "+libro1.getStock()); //Muestra el stock actual

        //Calcular la ganancia obtenida por unidad
//        System.out.println("Las ganancias obtenida son de: "+libro1.gananciaObtenida()+" por unidad");

        //NO PUEDE MODIFICARSE EL COSTO
        //Por eso no esta el metodo setCosto
//        System.out.println("El precio de venta del libro "+libro1.getTitulo()+" es de "+libro1.getPrecioVenta()+" y el costo es de "+libro1.getCosto());

        //Ver el precio de venta
//        System.out.println("El precio de venta del libro "+libro2.getTitulo()+" es de "+libro2.getPrecioVenta());
//        System.out.println("El precio de venta del libro "+libro1.getTitulo()+" es de "+libro1.getPrecioVenta());

        //Descuento sobre el precio de venta
        //Agregué este metodo porque queria saber el descuento
//        System.out.println("El descuento del libro: "+libro1.getTitulo()+" es de "+ libro1.getDescuento());

        //CODIGO INMUTABLE
//        System.out.println("El codigo del libro "+libro1.getTitulo()+" es: "+libro1.getCODIGO());
//        System.out.println("El codigo breve del libro "+libro1.getTitulo()+" es: "+libro1.getCodigoBreve());

        //<Se requiere una función en la clase principal que reciba los datos separados por coma para registrar
        // un nuevo libro e incluirlo en un arreglo de Libros. Visualizar la información del Array luego.>

        //Definimos un arreglo para almacenar LIBROS
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Ingrese la cantidad de libros a almacenar: ");
//        int n = sc.nextInt();
//
//        Libro[] biblioteca = new Libro[n];
//        registrarLibrosEnLista(biblioteca);

       // < Vamos a sumar los conceptos vistos a la clase Libro (en el diagrama y en el código):
        // ❏ Ahora nos indican que se estableció un stock mínimo recomendado de 5 unidades para todos los libros
        // que debe actualizarse a nivel general.

        // ❏ En la clase principal: ❏ consultar desde uno de los titulos cual es el stock mínimo recomendado.
        // y ❏ Actualizar el stock mínimo a 4.>
        System.out.println("El stock minimo recomendado actual es: " + Libro.getLimiteStockMinimo());
        Libro.setLimiteStockMinimo(4);

        System.out.println("Stock minimo actualizado a: " + Libro.getLimiteStockMinimo());

        System.out.println("Consulta desde libro 2: " + libro2.getLimiteStockMinimo());
    }
    public static void registrarLibrosEnLista(Libro[] lista) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        while (contador < lista.length) {
            System.out.println("No escribas comillas dobles ni simples al ingresar los datos");
            System.out.println("Ingresa los datos separados por coma: " + "codigo,titulo,autor,stock,costo,sector");

            String entrada = scanner.nextLine();
            String[] datos = entrada.split(",");

            // Conversion de tipos
            int codigo = Integer.parseInt(datos[0].trim());
            String titulo = datos[1].trim();
            String autor = datos[2].trim();
            int stock = Integer.parseInt(datos[3].trim());
            double costo = Double.parseDouble(datos[4].trim());
            char sector = datos[5].trim().charAt(0);

            // Crear y guardar objeto
            lista[contador] = new Libro(codigo, titulo, autor, stock, costo, sector);
            contador++;
//            scanner.nextLine(); // Limpiar buffer
        }

        //ARRAY FINAL
        System.out.println("Libros registrados:");
        System.out.println(Arrays.toString(lista));
    }
}