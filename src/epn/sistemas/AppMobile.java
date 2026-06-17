package epn.sistemas;

public class AppMobile extends SistemaEPN implements IAccion {
    public AppMobile() {
    }

    @Override
    public boolean on() {
        System.out.println("Encendiendo AppMobile");
        return true;
    }

    @Override
    public boolean off() {
        System.out.println("Apagando AppMobile");
        return true;
    }

}
