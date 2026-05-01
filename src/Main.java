import java.time.LocalDate;

public class Main {

    // JVM busca el método main
    public static void main(String[] args) {
        // Clase = molde
        // Objeto = instancia del molde
        Profesional profesional1= new Profesional("Martina", "Lopez", "M1234");
        Tratamiento tratamiento1= new Tratamiento("Facial", 120, "es un tratamiento");
        Paciente paciente1= new Paciente("Sol", "Luz", "luz@gmail.com", 1122345512 );

        //instancia de la clase turno / por defecto nos deja java el constructor vacio en todas las clases
        Turno turno1= new Turno( LocalDate.now(), tratamiento1, profesional1, paciente1, 12);

        //agregar turno
        paciente1.agregarTurno(turno1);
        paciente1.agregarTurno(turno1);

        //buscar un turno por titulo de tratamiento
        paciente1.buscarUnTurnoPorTratamiento("Facial");

        //Buscar un turno por numero
        paciente1.buscarTurnoPorNumero(12);

        //Me falta crear un metodo para modificar un turno

    }}