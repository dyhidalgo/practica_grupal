package practica01.demo.entity;

import jakarta.persistence.*;



@Entity
@Table(name = "estado")
public class Estado {
    
    @Id //indica que es el id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //le dice que es autoincremental
    private long id;
    
    private String nombre;
    private int fronteras;
    private String clima;
    private int poblacion;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFronteras() {
        return fronteras;
    }

    public void setFronteras(int fronteras) {
        this.fronteras = fronteras;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
    
}
