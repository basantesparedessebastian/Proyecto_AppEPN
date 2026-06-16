package epn;

public class Persona {
    private String cedula ;
    private String nombre ;
    private String apellido ;
    private Int edad;
    private Date fechaNacimiento;

}
public class Estudiante extends Persona {
    private String carrera;
    private Int semestreActual;
    private Double promedioActual;
    private String estadoMatricula;
    private String codigoUnico;
}

public class Decano extends Persona {
    private String facultad;
    private String nivelAcceso;
}
