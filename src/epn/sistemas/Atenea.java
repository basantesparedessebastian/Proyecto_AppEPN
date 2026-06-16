package epn.sistemas;

public class Atenea extends SistemaEPN implements IAccion {
    private String tipodecertificado;
    private String estadosolicitud;
    private float costocertificado;

    @Override
    public boolean on() {
        System.out.println("Encendiendo Atenea");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("Apagando Atenea");
        return true;
    }
}
