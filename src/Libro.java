public class Libro {
    private final int CODIGO; //CONSTANTES
    private String titulo;
    private String autor;
    private int stock;
    private double costo;
    private double precioVenta;
    private char sector;

    //constructor
    public Libro (int CODIGO, String titulo, String autor, int stock, double costo, char sector) {
        this.CODIGO=CODIGO; //El codigo es una constate ahora
        this.titulo=titulo;
        this.autor=autor;
        this.stock=stock;
        this.costo=costo;
        this.precioVenta=costo*1.25;
        this.sector=sector;
    }

    //consultar
    public int getCODIGO() {
        return CODIGO;
    }

    //no se puede modificar
//    public void setCODIGO(int codigoNuevo ){
//        this.CODIGO = codigoNuevo;
//    }

    //ver solo los ultimos 3 digitos del codigo
    public String getCodigoBreve(){
        String codigoTexto= String.valueOf(this.CODIGO) ;
        return codigoTexto.substring(codigoTexto.length()-3);
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

}