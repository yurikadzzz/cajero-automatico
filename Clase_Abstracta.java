package Proyecto_Terminado;

import java.util.Scanner;

public abstract class Clase_Abstracta implements Clase_Interfaz {
	String numero_cuenta;
	protected int transacciones, retiro, deposito, transferencia;
	private static int saldo;
	Scanner entrada = new Scanner(System.in);
	
	public Clase_Abstracta() {
		
	}

	public void Operaciones() {
		int bandera = 0;
		int seleccion = 0;
		String Nombre = "";
		do {
			do {
				System.out.println(" Buenas tardes esta en un cajero automatico de BBVA. Culiacán, Sinaloa");
				System.out.println(" Hoy es 31/10/2023");
				System.out.println(" Porfavor seleccione una opción:");
				System.out.println("    1. Retiro de efectivo.");
				System.out.println("    2. Hacer una transferencia");
				System.out.println("    3. Salir.");
				seleccion = entrada.nextInt();

				if (seleccion >= 1 && seleccion <= 3) {
					bandera = 1;
				} else {
					System.out.println("=================================================");
					System.out.println("Opción no disponible, vuelva a intentar porfavor.");
					System.out.println("=================================================");
				}
			} while (bandera == 0);

			if (seleccion == 1) {
				Clase_Abstracta mensajero = new Retiro();
				mensajero.Transacciones();
			} else if (seleccion == 2) {
				Clase_Abstracta mensajero = new Transferencia();
				mensajero.Transacciones();
			} else if (seleccion == 3) {
				System.out.println("==========================");
				System.out.println("Gracias, vuelva pronto.");
				System.out.println("==========================");
				bandera = 2;
			}
		} while (bandera != 2);
	}

	public void Numero_cuenta() {
		numero_cuenta = entrada.nextLine();
	}

	public void Retiro() {
		retiro = entrada.nextInt();
	}

	public void Deposito() {
		deposito = entrada.nextInt();
	}

	public void Transferencia() {
		transferencia = entrada.nextInt();
	}

	public abstract void Transacciones();

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
