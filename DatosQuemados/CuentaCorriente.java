package DatosQuemados;

public class CuentaCorriente extends CuentaBancaria{
    double limiteDescubierto;

    public CuentaCorriente(int numeroCuenta, double limiteDescubierto){
        super(numeroCuenta);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void retirar(double monto) {
        if (monto <= (getSaldo() + limiteDescubierto)) {
            setSaldo(getSaldo() - monto);
            System.out.println("Se retiraron " + monto + " de la cuenta " + getNumeroCuenta());
        } else {
            System.out.println("Sobrepasa el limite descubierto");
        }
    }
}
