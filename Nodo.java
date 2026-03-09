public class Nodo {
    String key; 
    Producto value; 
    Nodo siguiente; 

    public Nodo(String key, Producto value) {
        this.key = key;
        this.value = value;
        this.siguiente = null;
    }
}
