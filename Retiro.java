package Proyecto_Terminado;

<<<<<<< HEAD
public class Retiro extends Clase_Abstracta {

	@Override
	public void Transacciones() {

		System.out.print("Cuanto deseas retirar: ");
		Retiro();
		if (retiro <= getSaldo()) {
			transacciones = getSaldo();
			setSaldo(transacciones - retiro);
			System.out.println("====================================");
			System.out.println("=================BBVA===============");
			System.out.println("				Debito				");
			System.out.println("Se relalizo una Consulta el 31/10/2023");
			System.out.println("Retiraste : " + retiro);
			System.out.println("Tu saldo actual es: " + getSaldo());
			System.out.println("====================================");
		} else {
			System.out.println("=====================");
			System.out.println("Saldo insuficiente.");
			System.out.println("=====================");

		}
	}
=======

public class Retiro extends Clase_Abstractaa {

    @Override
    public void Transacciones() {
    	
    			 System.out.print("Cuanto deseas retirar: ");
    		        Retiro();
    		        if (retiro <= getSaldo()) {
    		            transacciones = getSaldo();
    		            setSaldo(transacciones - retiro);
    		            System.out.println("====================================");
    		            System.out.println("=================BBVA===============");
    		            System.out.println("				Debito				");
    		            System.out.println("Se relalizo una Consulta el 31/10/2023");
    		            System.out.println("Retiraste : " + retiro);
    		            System.out.println("Tu saldo actual es: " + getSaldo());
    		            System.out.println("====================================");
    		        } else {
    		            System.out.println("=====================");
    		            System.out.println("Saldo insuficiente.");
    		            System.out.println("=====================");
    
       
    }
}
>>>>>>> efa9d592caeddeadfdaec1b7a7f203dbae22b5b9
}
