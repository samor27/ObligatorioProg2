package obligatorio2026.src.main.resources;

public class Proceso {
    private int pid;
    private String nombre;
    private Usuario propietario;
    private int prioridad;
    private TipoEstado tipoEstado;
    private TipoFinalizacion tipoFinalizacion;
    private Usuario finalizadoPor;
    // private (hay q poner el tipo de tad) eventos;



    public enum TipoEstado{
        NEW, PENDING, RUNNING, FINISHED
    }

    public enum TipoFinalizacion{
        OK, ERROR, TERMINATED
    }
}
