package devy.com.donemos.entidades;

public class PlaceEntity {;

    private int id;
    private String nombre;
    private String descripcion;
    private String lat_pos;
    private String lng_pos;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLat_pos() {
        return lat_pos;
    }

    public void setLat_pos(String lat_pos) {
        this.lat_pos = lat_pos;
    }

    public String getLng_pos() {
        return lng_pos;
    }

    public void setLng_pos(String lng_pos) {
        this.lng_pos = lng_pos;
    }

    @Override
    public String toString() {
        return "LugarDonativo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", lat_pos='" + lat_pos + '\'' +
                ", lng_pos='" + lng_pos + '\'' +
                '}';
    }
}
