package DatosIngresados;
import java.util.Scanner;
//Evelyn
public class main {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta: ");
        int num_cuenta= sc.nextInt();
        CuentaBancaria persona1= new CuentaBancaria(num_cuenta);
        System.out.println("Ingrese su saldo actual cuenta: ");
        double saldo_cuenta= sc.nextInt();
        persona1.setSaldo(saldo_cuenta);
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
                    double monto_deposito= sc.nextDouble();
                    persona1.setMonto(monto_deposito);
                    persona1.depositar();
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    double monto_retiro= sc.nextDouble();
                    persona1.setMonto(monto_retiro);
                    persona1.retirar();
                case 4:
                    System.out.println("Saliendo del programa ");
                    break;
            }

        }while (opcion!=4);


    }
}
