public class Main {
    public static void main(String[] args) {
        InventarioChicharrones miTienda = new InventarioChicharrones(10);

        miTienda.put("chicharron", new Producto("Chicharrón de Cuero", "15/03/2026"));
        miTienda.put("carnita", new Producto("Carnita Especial", "12/03/2026"));
        miTienda.put("tortilla", new Producto("Tortilla de Maíz", "10/03/2026"));
        
        System.out.println("Buscando 'carnita': " + miTienda.get("carnita"));
        System.out.println("Buscando 'chicharron': " + miTienda.get("chicharron"));
        System.out.println("Buscando 'salsa' (no existe): " + miTienda.get("salsa"));
    }
}