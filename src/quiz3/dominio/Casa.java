package quiz3.dominio;

public class Casa extends Inmueble implements Arrendable{

    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
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
        return "Casa{" + isArrendado() + "Direccion = " + this.getDireccion() + "Valor arriendo =" + this.getValorArriendo() + "Valor venta =" + this.getValorVenta() + '}';
    }
}
