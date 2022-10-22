import co.javaCourse.crearObjetos.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        ESTRUCTURAS DE DATOS, ARRAYS
        test
         */
        //FORMA 1
        String[] nombres = new String[3];
        int[] numbers = new int[3];
        Car[] carModels = new Car[3];


        //FORMA 2
        String[] carsBrands = new String[]{};//vacio
        String[] carsBrands2 = new String[]{"ford"};

        System.out.println("carsBrands2 = " + carsBrands2[0]);
    }
}