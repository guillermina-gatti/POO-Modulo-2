public class Libro {
    private final int CODIGO; //CONSTANTES (puede ser double, int, long)
    private final int LIMITE_STOCK_PROMO = 30;
    private String titulo;
    private String autor;
    private int stock;
    private double costo;
    private double precioVenta;
    private char sector;

    //Un metodo de clase solo puede utilizar los atributos ESTATICOS.
    private static int limiteStockMinimo = 5;

    //constructor
    public Libro(int CODIGO, String titulo, String autor, int stock, double costo, char sector) {
        this.CODIGO = CODIGO; //El codigo es una constate ahora
        this.titulo = titulo;
        this.autor = autor;
        this.stock = stock;
        this.costo = costo;
        this.precioVenta = costo * 1.25;
        this.sector = sector;
        aplicanPromosAlPrecioVenta();
    }

    public static int getLimiteStockMinimo() {
        return limiteStockMinimo;
    }

    public static void setLimiteStockMinimo(int nuevoLimiteSaldoNegativo) {
        limiteStockMinimo = nuevoLimiteSaldoNegativo;
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
    public String getCodigoBreve() {
        String codigoTexto = String.valueOf(this.CODIGO);
        return codigoTexto.substring(codigoTexto.length() - 3);
    }

    public void setSector(char sector) {
        this.sector = sector;
        this.aplicanPromosAlPrecioVenta();
    }

    //CODIGO DE AGUS
//    public void aplicanPromosAlPrecioVenta(){
//
//        this.precioVenta = costo*1.25; // 1250 el costo era 1000
//
//        String categoriaPromo="bazar";
//
//        //son acumulables las promos pero que sea >= al costo tiene prioridad
//        if(this.stock > 15 && categoriaPromo.equals(this.categoria)){
//            this.setPrecioVenta(this.precioVenta*=0.85); //1000 //1065
//        }else if(this.stock > 15 || categoriaPromo.equals(this.categoria)){
//            this.setPrecioVenta(this.precioVenta*=0.9);
//        }
//
//    }
    public void aplicanPromosAlPrecioVenta() {
        //Cambié el programa en el proceso porque tenia un problema porque el precio de venta era menor al costo.
        //Precio base desde el costo original
        double nuevoPrecio = this.costo * 1.25;
        //Aplicamos el primer descuento (5%)
        if (this.stock > this.LIMITE_STOCK_PROMO) {
            nuevoPrecio = nuevoPrecio * 0.95;
        }
        //Aplicamos el segundo descuento (2%)
        if (this.sector == 'c') {
            nuevoPrecio = nuevoPrecio * 0.98;
        }
        //Actualizamos usando el metodo
        this.setPrecioVenta(nuevoPrecio);
    }

    public double getDescuento() {
        double precioSinDescuento = this.costo * 1.25;
        double descuento = precioSinDescuento - this.precioVenta;
        return descuento;
    }

    //Get=mostrar y set=actualizar

    //Calcular el stock
    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else System.out.println("no se modifico el stock, el mismo debe ser mayor a 0");
    }

    //Mostrar el stock
    public int getStock() {
        return this.stock;
    }

    //hay stock disponible?
    public boolean hayStock() {
        return this.stock > 0;
    }

    //Ganancia obtenida
    public double gananciaObtenida() {
        return this.precioVenta - this.costo;
    }

    public double getCosto() {
        return this.costo;
    }

    public void setPrecioVenta(double precioVenta) {
        if (this.costo < precioVenta) this.precioVenta = precioVenta;
        else System.out.println("No puede ingresar un precio de venta menor al costo.");
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "CODIGO=" + CODIGO +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor +
                ", costo=" + costo +
                ", precioVenta=" + precioVenta +
                ", stock=" + stock +
                ", sector='" + sector + '\'' +
                '}';
    }
}