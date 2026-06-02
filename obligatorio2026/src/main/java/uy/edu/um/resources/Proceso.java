package uy.edu.um.resources;
import uy.edu.um.tad.list.MyLinkedListImpl;

public class Proceso implements Comparable<Proceso> {
    private int pid;
    private String nombre;
    private Usuario propietario;
    private int prioridad;
    private TipoEstado tipoEstado;
    private TipoFinalizacion tipoFinalizacion;
    private Usuario finalizadoPor;
    private MyLinkedListImpl<Eventos> eventos = new MyLinkedListImpl<>();

    @Override
    public int compareTo(Proceso o) {
        if (this.pid > o.pid){return 1;}
        if (this.pid < o.pid){return -1;}
        return 0;

    }


    public enum TipoEstado{
        NEW, PENDING, RUNNING, FINISHED
    }

    public enum TipoFinalizacion{
        OK, ERROR, TERMINATED
    }
}
