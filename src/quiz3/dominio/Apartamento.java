package quiz3.dominio;

public class Apartamento extends Inmueble implements Arrendable{


    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public void arregar() {
        this.setArrendado(true);
    }

    @Override
    public void devolver() {
        this.setArrendado(false);
    }

    @Override
    public String toString(){
        return "Apartamento {" + "Direccion =" + this.getDireccion() + "Valor venta =" + this.getValorVenta() + "Valor arriendo =" + getValorArriendo() + "arrendado =" + isArrendado() + '}';
    }
}
