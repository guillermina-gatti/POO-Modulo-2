public class Tratamiento {
    private String titulo;
    private int tiempo;
    private String descripcion;

    public Tratamiento(String titulo, int tiempo, String descripcion) {
        this.titulo = titulo;
        this.tiempo = tiempo;
        this.descripcion = descripcion;
    }

     public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Tratamiento{" +
                "titulo='" + titulo + '\'' +
                ", tiempo=" + tiempo +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
