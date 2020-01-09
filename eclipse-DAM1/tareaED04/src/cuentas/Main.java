package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        

        cuenta1 = new CCuenta("Antonio L�pez","1000-2365-85-1230456789",2500,0);
        saldoActual = operativa_cuenta(cuenta1, null);
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	private static double operativa_cuenta(CCuenta cuenta1, float cantidad) {
		/** Esto es un comentario Javadoc @author Adri */
		double saldoActual;
		saldoActual = cuenta1.estado();
		return saldoActual;
	}
}

