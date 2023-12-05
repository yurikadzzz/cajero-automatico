package Proyecto_Terminado;

<<<<<<< HEAD
public class Consulta extends Clase_Abstracta {

	@Override
	public void Transacciones() {
		System.out.println("====================================");
		System.out.println("=================BBVA===============");
		System.out.println("				Debito				");
		System.out.println("Se relalizo una Consulta el 31/10/2023");
		System.out.println("Tu saldo actual es: " + getSaldo());
		System.out.println("====================================");
	}
=======
import Proyecto.ClasePadre_Abstracta;

public class Consulta extends Clase_Abstractaa{
    
    @Override
    public void Transacciones(){
        System.out.println("====================================");
        System.out.println("=================BBVA===============");
        System.out.println("				Debito				");
        System.out.println("Se relalizo una Consulta el 31/10/2023");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("====================================");
    }    
>>>>>>> efa9d592caeddeadfdaec1b7a7f203dbae22b5b9
}
