package datos;

import java.util.Set;

public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private long dni;
    private Set<Permiso> permisos;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, long dni, Set<Permiso> permisos) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.permisos = permisos;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Set<Permiso> getPermisos() {
        return this.permisos;
    }

    public void setPermisos(Set<Permiso> permisos) {
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return "{" +
            " idPersona='" + getIdPersona() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", dni='" + getDni() + "'" +            
            "}";
    }
    
}
