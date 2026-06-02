package uy.edu.um.resources;

public class Usuario {
    private int uid;
    private String alias;
    private TipoUsuario tipo;
    public enum TipoUsuario{
        GENERIC, ADMIN
    }

}
