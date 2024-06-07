package DatosIngresados;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta: ");
        int num_cuenta= sc.nextInt();
        System.out.println("Ingrese su saldo actual cuenta: ");
        double saldo_cuenta= sc.nextInt();
        int opcion;
        do{
            System.out.println("Indique la acción que desea realizar: ");
            System.out.println("1. Depositar: ");
            System.out.println("2. Retirar ");
            System.out.println("3. Calculo de Intereses ");
            System.out.println("4. Salir ");
            opcion = sc.nextInt();
            switch (opcion)
            {
                case  1:
                    System.out.println("Ingrese el monto a depositar: ");
                    int monto_deposito= sc.nextInt();
                    CuentaBancaria persona1= new CuentaBancaria(num_cuenta);
                    persona1.setMonto(monto_deposito);
                    persona1.setSaldo(saldo_cuenta);
                    persona1.depositar();
                case 4:
                    System.out.println("Saliendo del programa ");
                    break;
            }

        }while (opcion!=4);


    }
}
