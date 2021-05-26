package quiz3.app;

import quiz3.dominio.*;

public class AppAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();
        Casa casa = new Casa("Parque",8000000,3000000,true);
        Lote lote = new Lote("LaChapa",2000000,0,false);
        Apartamento apartamento = new Apartamento("Judea",5000000,2000000,true);
        Apartamento apartamento1 = new Apartamento("Almenares",4000000,1500000,false);
        Apartamento apartamento2 = new Apartamento("SalidaDeMarinilla",2000000,1200000,true);
        Casa casa1 = new Casa("CalleMonSeñor",3000000,2100000,false);
        Casa casa2 = new Casa("Cementerio",1000000,500000,true);

        agencia.arrendarinmueble(casa);
        agencia.agregarInmueble(apartamento);

        boolean inmueble1 = agencia.arrendarinmueble(casa);
        boolean inmueble2 = agencia.arrendarinmueble(apartamento);
        //boolean inmueble3 = agencia.arrendarinmueble(lote); No esta implementado, entonces no se puede poner

        System.out.println(inmueble1 + "El arriendo esta disponible");
        System.out.println(inmueble2 + "El arriendo esta disponible");


        System.out.println("Las casas disponibles para arrendar son:");
        agencia.listarArrendadosDisponibles(casa);

        System.out.println("Los apartamentos disponibles para arrendar son:");
        agencia.listarArrendadosDisponibles(apartamento);

        System.out.println("Las casas ya arrendadas son:");
        agencia.listarArrendados(casa);

        System.out.println("Los apartamentos ya arrendados son:");
        agencia.listarArrendados(apartamento);


    }
}
