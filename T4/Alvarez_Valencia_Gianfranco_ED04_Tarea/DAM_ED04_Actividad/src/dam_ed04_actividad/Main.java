/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 *
 * @author gianf
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuentaGianfranco;
        double saldoActual;

        cuentaGianfranco = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaGianfranco.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        //operacion_cuenta(cuentaGianfranco, null);
    }

    private static void operacion_cuenta(CCuenta cuentaGianfranco, float importe) {
        try {
            cuentaGianfranco.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuentaGianfranco.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
