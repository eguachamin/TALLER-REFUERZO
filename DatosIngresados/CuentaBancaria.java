package DatosIngresados;

public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public double monto;

    public CuentaBancaria(){

    }
    public CuentaBancaria(int numeroCuenta){
    this.numeroCuenta=numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void depositar() {
        System.out.println("Numero de Cuenta" + numeroCuenta);
        System.out.println("El monto ingresado a depositar es" + monto);
        double total;
        total=getSaldo()+monto;
        System.out.println("Total de la cuenta: " + total);
    }
    public void retirar() {
        System.out.println("Numero de Cuenta" + numeroCuenta);
        System.out.println("El monto ingresado a retirar es" + monto);
        double total;
        total=getSaldo()-monto;
        System.out.println("Total de la cuenta: " + total);
    }
}
