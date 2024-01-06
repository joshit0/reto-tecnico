package demoblaze.models;

public class PricesModel {
    
    
    private static Integer precioTotal = 0;

    public static Integer getPrecioTotal() {
        return precioTotal;
    }

    public static void setPrecioTotal(Integer nuevoPrecioTotal) {
        precioTotal = nuevoPrecioTotal;
    }
    
    public static void addPrecioProducto(Integer precioProducto) {
        precioTotal += precioProducto;
    }


}
