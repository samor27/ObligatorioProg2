package obligatorio2026.src.main.resources;

public class Proceso {
    private int pid;
    private String nombre;
    private Usuario propietario;
    private int prioridad;
    private TipoEstado tipoEstado = TipoEstado.NEW;
    private TipoFinalizacion tipoFinalizacion;
    private Usuario finalizadoPor;
    private uy.edu.um.tad.list.MyLinkedListImpl eventos;



    public enum TipoEstado{
        NEW, PENDING, RUNNING, FINISHED
    }

    public enum TipoFinalizacion{
        OK, ERROR, TERMINATED
    }
}
