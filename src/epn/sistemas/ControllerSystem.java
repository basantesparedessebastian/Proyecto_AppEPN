package epn.sistemas

public class ControllerSystem {
    public boolean on(){
        Atenea    atenea = new Atenea();
        SAEW      saew = new SAEW();
        AppMobile appMobile = new AppMobile();

        System.out.println("Sistema Encendido");
        return true;
    }
    public boolean off(){
        System.out.println("Apagando Sistema");
      return true;
    }

}
