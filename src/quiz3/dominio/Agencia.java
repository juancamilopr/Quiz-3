package quiz3.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;
    public String elementoAretirar;

    private ArrayList<Inmueble> inmuebles;

    public Agencia(){
        this.inmuebles = new ArrayList<>();
    }

    public ArrayList<Inmueble> getInmuebles(){
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles){
        this.inmuebles = inmuebles;
    }


    //public void agregarInmueble(Inmueble i){
      //  Inmueble inmuebleExistente = this.agregarInmueble();
    //}

    public void agregarInmueble(Inmueble i)
    {
        if(i instanceof Inmueble)
        {
            this.inmuebles.add(i);
        }
    }

    public boolean arrendarinmueble(Arrendable j){
        if(j instanceof Arrendable){
            j.arregar();
            return true;
        }
        else{
            return false;
        }
    }

    public boolean devolver(Arrendable j){
        if(j != null){
            j.devolver();
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean vender(Inmueble inmueble) {
        if (inmueble.isArrendado() == true) {
            return false;


        } else {
 //           ArrayList<Inmueble> elementoARetirar = new ArrayList() {
 //               elementoARetirar.remove(elementoARetirar);
 //           };
            return true;
        }
    }

 //   ArrayList<Apartamento> elementoARetirar = new ArrayList() {
 //               Apartamento.remove(elementoARetirar);
 //   };

        //Nombredelalista.remove(objetoquequieresremover)
        // public void eliminarAlumno(int posicionArray){
        //   if (posicionArray >= 0){
        //     System.out.println(" >>> Registro eliminado <<<\n");
        //} else{
        // System.out.println(" >>> No se ha encontrado registro <<<\n");
        //}
        //}


   // public void quitarinmueble ( boolean posicionEnLaLista){

     //   if (posicionEnLaLista = false) {
       //     posicionEnLaLista.remove(posicionEnLaLista);
        //}
    //}

    public void listarArrendadosDisponibles(Inmueble inmuebleArrendadoDisponible){
        ArrayList<Inmueble> inmueblesArrendadoDisponibles = new ArrayList<>();
        boolean disponible = inmuebles.stream().anyMatch(i -> i.isArrendado() == inmuebleArrendadoDisponible.isArrendado());

        if(disponible || inmuebleArrendadoDisponible.isArrendado() == false){
            inmueblesArrendadoDisponibles.add(inmuebleArrendadoDisponible);
            System.out.println(inmuebleArrendadoDisponible);
        }
    }

    public void listarArrendados(Inmueble inmuebleArrendado){
        ArrayList<Inmueble> inmueblesArrendados = new ArrayList<>();
        boolean existente = inmuebles.stream().anyMatch(i -> i.isArrendado() == inmuebleArrendado.isArrendado());

        if(!existente || inmuebleArrendado.isArrendado() == true);
        {
            inmueblesArrendados.add(inmuebleArrendado);
            System.out.println(inmuebleArrendado);
        }
    }
}
