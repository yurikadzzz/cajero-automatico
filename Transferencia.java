package Proyecto_Terminado;

public class Transferencia extends Clase_Abstracta {
	
	public Transferencia() {
		
	}

	@Override
	public void Transacciones() {
		System.out.println("¿A qué cuenta deseas transferir?");
		this.numero_cuenta = entrada.nextLine();	
		System.out.print("Cuanto quieres Transferir: ");
		Transferencia();
		if (transferencia <= getSaldo()) {
			transacciones = getSaldo();
			setSaldo(transacciones - transferencia);
			System.out.println("====================================");
			System.out.println("=================BBVA===============");
			System.out.println("				Debito				");
			System.out.println("Se realizó una Consulta el 31/10/2023");
			System.out.println("A la cuenta " + numero_cuenta);
			System.out.println("transferiste : " + transferencia);
			System.out.println("Tu saldo actual es: " + getSaldo());
			System.out.println("====================================");
		} else {
			System.out.println("=====================");
			System.out.println("Saldo insuficiente");
			System.out.println("=====================");

		}

	}
}