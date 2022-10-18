import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        /*
        MAP, ESTRUCTURA DE DATOS

        se especifican los tipos de datos que se quieren trabajar
        es tipo clave valor
        diferentes implementaciones: hashMap, linkedHashMap, navigableMap, treeMap
         */
        Map<String, String> personas = new HashMap<>();

        //con put se añaden al hashMap,
        //las claves debes ser valores unicos
        personas.put("1234", "nomre apellido 1");
        personas.put("1234564", "nomre apellido 2");
        personas.put("123672gh4", "nomre apellido 3");

        System.out.println("personas = " + personas);


//        para iterar: for, asi se imprimen las claves
        for (String persona : personas.keySet()) {
            System.out.println(persona);
        }

        //        para iterar: for, asi se imprimen los valores
        for (String values : personas.values()) {
            System.out.println(values);
        }

        //obtener clave y valor
        for (Map.Entry<String, String> registry : personas.entrySet()) {
            System.out.println(registry.getKey() + " / " + registry.getValue());
        }
    }
}
