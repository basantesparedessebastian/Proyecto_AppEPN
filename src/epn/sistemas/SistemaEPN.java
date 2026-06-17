package epn.sistemas;

public class SistemaEPN implements IAccion {
    private String version;
    private String nombre;

    @Override
    public boolean on() {
        System.out.println("Encendiendo SistemaEPN");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("Apagando SistemaEPN");
        return true;
    }
}
