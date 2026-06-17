package epn.sistemas;

import java.util.ArrayList;

public class ControllerSystem {
    private final ArrayList<SistemaEPN> lista;


    //pilas por eso se debe crear una classe abstracta para que no se pueda instanciar y se pueda crear una lista de objetos de tipo SistemaEPN
    
    //SistemaEPN s= new SistemaEPN();
    //s.on();

    //constructor
    public ControllerSystem() {
        lista  =new ArrayList<>();
    }

    public boolean on(){
        Atenea      atenea      = new Atenea();
        SAEW        saew        = new SAEW();
        AppMobile   appMobile   = new AppMobile();


        lista.add(atenea);
        lista.add(saew);
        lista.add(appMobile);
        //lista.add(new Persona());

        System.out.println("Inicializando sistema...");
        // atenea.on();
        // saew.on();
        // appMobile.on();

        for(SistemaEPN sistema : lista){
            sistema.on();
        } 

        return true;
    }
    public boolean off(){
        System.out.println("Apagando sistema...");
        for(SistemaEPN sistema : lista){
            sistema.off();
        } 

        return true;
    }
}