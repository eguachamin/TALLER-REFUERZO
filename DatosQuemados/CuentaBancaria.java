package DatosQuemados;

public class CuentaBancaria {
    int numeroCuenta;
    double saldo;

    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public void depositar(double monto){
        saldo += monto;
        System.out.println("Se depositaron " + monto + "en la cuenta" + getNumeroCuenta());
    }
    public void retirar(double monto){
        if (monto <= saldo){
            saldo -= monto;
            System.out.println("Se retiraron " + monto + " de la cuenta " + getNumeroCuenta());
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
