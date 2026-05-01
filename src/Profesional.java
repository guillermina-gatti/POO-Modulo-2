public class Profesional {
    private String nombre;
    private String apellido;
    private String matricula;

    public Profesional(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }


//    public void atenderPaciente(){
//
//    }
//
//    public String registrarPaciente( String paciente){
//
//    }
    @Override
    public String toString() {
        return "Profesional{" +
                "nombre='" + nombre + '\n' +
                ", apellido='" + apellido + '\n' +
                ", matricula='" + matricula + '\n' +
                '}';
    }
}
