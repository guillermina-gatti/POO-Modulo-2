public class Main {
    public static void main(String[] args) {
        Libro libro1= new Libro(123, "Orgullo y prejuicio", "Jane Austen", 3, 120, 'c');

        System.out.println(libro1.getAutor()+" ");

        libro1.setStock(-100);
        libro1.setStock(100);

        System.out.println("El stock es: "+libro1.getStock());


    }
}