package daaw.pelisapp.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document("peliculas")
public class Pelicula {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
    private long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    private String[] listaActores;

    @Column(nullable = false)
    private String genero;

    @Column(nullable = false)
    private int año;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String[] getListaActores() {
        return this.listaActores;
    }

    public void setListaActores(String[] listaActores) {
        this.listaActores = listaActores;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", listaActores='" + getListaActores() + "'" +
            ", genero='" + getGenero() + "'" +
            ", año='" + getAño() + "'" +
            "}";
    }

    public Pelicula() {
    }

    public Pelicula(long id, String nombre, String[] listaActores, String genero, int año) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.listaActores = listaActores;
        this.genero = genero;
        this.año = año;
    }

    
    
    
}
