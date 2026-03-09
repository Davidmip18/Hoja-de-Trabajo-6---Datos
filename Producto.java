public class Producto {
    String nombre; 
    String fechaExpiracion;

    public Producto(String nombre, String fechaExpiracion) {
        this.nombre = nombre;
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " | Expira: " + fechaExpiracion;
    }
}
