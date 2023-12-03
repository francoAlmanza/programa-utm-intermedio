import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String opcion = "";
		while (!opcion.equals("x")) {

			System.out.println("\n********* OPCIONES *********");
			System.out.println("\nPARA LISTAR LOS SERVICIOS PRESIONE 1 ");
			System.out.println("\nPARA LISTAR LOS TECNICOS PRESIONE 2 ");
			System.out.println("\nPARA LISTAR LOS CLIENTES PRESIONE 3 ");
			System.out.println("\nPARA SALIR PRESIONE x");

			opcion = entrada.next();

			if (opcion.equals("1")) {

				
			}

			else if (opcion.equals("2")) {

				
			}

			else if (opcion.equals("3")) {

				
			}

			else
				System.out.println("HASTA LA PROXIMA");

		}

	}
	}

}
