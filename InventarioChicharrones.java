public class InventarioChicharrones {
    private Nodo[] arreglo;
    private int capacidad;

    public InventarioChicharrones(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new Nodo[capacidad];
    }

    public int generarHash(String key) {
        int hash = 0;
        int primo = 31; 
        for (int i = 0; i < key.length(); i++) {
            hash = (hash * primo) + key.charAt(i);
        }
        return Math.abs(hash) % capacidad;
    }

    public void put(String key, Producto value) {
        int indice = generarHash(key); 
        Nodo nuevoNodo = new Nodo(key, value);

        if (arreglo[indice] == null) {
            arreglo[indice] = nuevoNodo;
        } else {
            Nodo actual = arreglo[indice];
            while (true) {
                if (actual.key.equals(key)) {
                    actual.value = value;
                    return;
                }
                if (actual.siguiente == null) {
                    actual.siguiente = nuevoNodo;
                    return;
                }
                actual = actual.siguiente; 
            }
        }
    }

    public Producto get(String key) {
        int indice = generarHash(key); 
        Nodo actual = arreglo[indice]; 

        while (actual != null) {
            if (actual.key.equals(key)) {
                return actual.value; 
            }
            actual = actual.siguiente;
        }
        return null; 
    }
}