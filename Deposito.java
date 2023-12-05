package Proyecto_Terminado;

<<<<<<< HEAD
public class Deposito extends Clase_Abstracta {

	@Override
	public void Transacciones() {
		System.out.print("Cuanto deseas depositar: ");
		Deposito();

		transacciones = getSaldo();
		setSaldo(transacciones + deposito);
		System.out.println("===================================");
		System.out.println("=================BBVA===============");
		System.out.println("				Debito				");
		System.out.println("Depositaste: " + deposito);
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("===================================");
	}

=======
import Proyecto.ClasePadre_Abstracta;

public class Deposito extends Clase_Abstractaa{
    
    @Override
    public void Transacciones(){
        System.out.print("Cuanto deseas depositar: ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("===================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("===================================");
    }
    
>>>>>>> efa9d592caeddeadfdaec1b7a7f203dbae22b5b9
}