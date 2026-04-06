public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private int stock;
    private double costo;
    private double precioVenta;
    private char sector;

    //constructor
    public Libro (int codigo, String titulo, String autor, int stock, double costo, char sector) {
        this.codigo=codigo;
        this.titulo=titulo;
        this.autor=autor;
        this.stock=stock;
        this.costo=costo;
        this.precioVenta=costo*1.25;
        this.sector=sector;
    }

    //Get=mostrar y set=actualizar

    //Calcular el stock
    public void setStock(int stock){
        if(stock>=0) this.stock=stock;
        else System.out.println("no se modifico el stock, el mismo debe ser mayor a 0");
    }

    //Mostrar el stock
    public int getStock(){
        return this.stock;
    }

    //hay stock disponible?
    public boolean hayStock(){
        return this.stock > 0;
    }

    //Ganancia obtenida
    public double gananciaObtenida(){
        return this.precioVenta - this.costo;
    }

    public double getCosto(){
        return this.costo;
    }

    public void setPrecioVenta(double precioVenta, char sector) {
        if (this.costo< precioVenta) this.precioVenta= precioVenta;
        else System.out.println("No puede ingresar un precio de venta menor al costo.");
        if (this.sector=='c') this.precioVenta = precioVenta*0.9;
    }

    public String getAutor(){
        return this.autor=autor;
    }

    public int getCodigo(){
        return this.codigo=codigo;
    }
}