import java.time.LocalDate;

public class Turno {
    private LocalDate fecha;
    //Variable de instancia del tipo tratamiento
    private Tratamiento tratamiento;
    private Profesional profesional;
    private Paciente paciente;
    private int numeroDeTurno;

    public Turno(LocalDate fecha, Tratamiento tratamiento, Profesional profesional, Paciente paciente, int numeroDeTurno) {
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.profesional = profesional;
        this.paciente = paciente;
        this.numeroDeTurno= numeroDeTurno;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public int getNumeroDeTurno() {
        return numeroDeTurno;
    }

//    @Override
//    public String toString() {
//        return "Turno{ tratamiento=" + tratamiento +
//                ", profesional=" + profesional +
//                ", paciente=" + paciente +
//                '}';
//    }
}
