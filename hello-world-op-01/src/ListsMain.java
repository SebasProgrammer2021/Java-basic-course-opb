import java.util.ArrayList;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {

        //es una interfaz, la implementación mas común es array list,
        /*
        permite trabajar con datos de forma dinamica, mas comoda
         */
        List<String> nombres = new ArrayList<>();

        nombres.add("Sofia");
        nombres.add("Laura");
        nombres.add("Daniela");
        nombres.add("Kendra");

        System.out.println("nombres = " + nombres);

//        para lists utilizar forEach
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}
