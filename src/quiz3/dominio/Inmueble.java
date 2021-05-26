package quiz3.dominio;

public abstract class Inmueble  {
    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    private boolean arrendado;

    public Inmueble(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        this.direccion = direccion;
        this.valorVenta = valorVenta;
        this.valorArriendo = valorArriendo;
        this.arrendado = arrendado;
    }

    public boolean isArrendado(){
        return arrendado;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public long getValorVenta(){
        return valorVenta;
    }

    public long getValorArriendo(){
        return valorArriendo;
    }
}
