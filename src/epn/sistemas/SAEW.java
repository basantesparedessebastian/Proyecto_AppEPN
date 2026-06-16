package epn.sistemas;

public class SAEW extends SistemaEPN implements IAccion {

    @Override
    public boolean on() {
        System.out.println("Encendiendo SAEW");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("Apagando SAEW");
        return true;
    }


}
