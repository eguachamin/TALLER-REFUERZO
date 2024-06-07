package DatosIngresados;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public double monto;

    public CuentaBancaria(int numeroCuenta){
    this.numeroCuenta=numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar() {
        System.out.println("El monto ingresado a depositar es" + monto);
        monto=getSaldo()+monto;
        System.out.println("Total de la cuenta: " + monto);
    }
    public void retirar() {
        System.out.println("El monto ingresado a retirar es" + monto);
        monto=getSaldo()-monto;
        System.out.println("Total de la cuenta: " + monto);
    }
}
