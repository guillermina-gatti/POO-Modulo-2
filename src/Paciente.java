import java.util.ArrayList;
// Clase = molde
public class Paciente {
    private String nombre;
    private String apellido;
    private String mail;
    private int telefono;

    private ArrayList<Turno> historialTurno;
    private ArrayList<Profesional> profesionalesAsociados;

    public Paciente(String nombre, String apellido, String mail, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefono = telefono;
        this.historialTurno = new ArrayList<>();
        this.profesionalesAsociados = new ArrayList<>();
    }

//    Sabemos que una Paciente tiene turnos
//    asociados, debe poder:
//            ❏ consultar
//              ❏ modificar
//              ❏ eliminar
//              ❏ agregar hasta 3 turnos.

    public ArrayList<Turno> getHistorialTurno() {
        return historialTurno;
    }

    public void buscarUnTurnoPorTratamiento(String tratamiento){
        this.historialTurno.forEach(turno -> {
            if (turno.getTratamiento().getTitulo().equals(tratamiento)){
                System.out.println("El turno para el tratamiento es: "+ turno); // Esta invocando turno.toString()
            }
        });

//        productos.forEach(p ->
//                System.out.println(p))
    }

    public void agregarTurno(Turno turno){
        if (turno != null && !historialTurno.contains(turno) && historialTurno.size()< 3 ){
            this.historialTurno.addFirst(turno);
        } else {
            System.out.println("No se pudo registrar el turno");
        }
    }

    //remove de arrayList devuelve un booleano
    public void eliminarTurno(Turno turno){
       if(historialTurno.remove(turno)){
           System.out.println("El turno fue eliminado exitosamente");
       } else {
           System.out.println("No se pudo eliminar el turno reservado");
       }
    }

    public void buscarTurnoPorNumero(int numeroBuscado){
        String turnoBuscado= "El turno buscado no existe";
        for (int i = 0; i < historialTurno.size() ; i++) {
            if (historialTurno.get(i).getNumeroDeTurno() == numeroBuscado){
                turnoBuscado= "El turno buscado es: "+ historialTurno.get(i);
                break;
            }
        }
        System.out.println(turnoBuscado);
    }

//    for (int i = 0; i < productos.size(); i++) {
//        System.out.println(productos.get(i));}



    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\n' +
                ", apellido='" + apellido + '\n' +
                ", mail='" + mail + '\n' +
                ", telefono=" + telefono +
                ", historialTurno=" + historialTurno +
                ", profesionalesAsociados=" + profesionalesAsociados +
                '}';
    }
}
