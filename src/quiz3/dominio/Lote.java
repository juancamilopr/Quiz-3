package quiz3.dominio;

public class Lote extends Inmueble{

    public Lote(String direccion, long valorVenta, long valorArriendo, boolean arrendado){
        super(direccion,valorVenta,valorArriendo,arrendado);
    }
    @Override
    public String toString(){
        return "Lote { " + "Direccion = " + this.getDireccion() +'}';
    }
}

