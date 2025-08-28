import org.example.Producto;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Producto> inventario = new HashSet<>();

        Producto p1 = new Producto("A001", "Notebook HP");
        Producto p2 = new Producto("B002", "Mouse Logitech");
        Producto p3 = new Producto("A001", "Notebook Dell");
        Producto p4 = new Producto("C003", "Monitor Samsung");
        Producto p5 = new Producto("B002", "Mouse Genius");

        inventario.add(p1);
        inventario.add(p2);
        inventario.add(p3);
        inventario.add(p4);
        inventario.add(p5);

        System.out.println("El tamaño del HashSet es: " + inventario.size() + "\n");

        
        System.out.println("Inventario de productos (sin duplicados):");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}