package module_1;
public class TryCatchMain {

	public static void main(String[] args) {
//		una op que podria provocar un error, para evitar que el programa se pare
		try {
			int result = 5 / 0;
		} catch (ArithmeticException e) {
			/*
			 * Exception es la clase general, pero lo recomendable es utilizar la excepcion
			 * que queremos capturar
			 * 
			 * con printStackTrace se imprime todo lo que ha ocurrido
			 */
			// TODO: handle exception

			e.printStackTrace();
		} finally {
			// es otra sección mas, idealmente para cerrar recursos, este código se va a ejecutar siemrpe, si o si

		}

		System.out.println("fin");

	}
}
