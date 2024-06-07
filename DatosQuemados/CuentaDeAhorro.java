package DatosQuemados;

public class CuentaDeAhorro extends CuentaBancaria{
    double tasaInteres;

    public CuentaDeAhorro(int numeroCuenta, double tasaInteres){
        super(numeroCuenta);
        this.tasaInteres = tasaInteres;
    }
    public void calcularInteres(){
        double interes = getSaldo() * tasaInteres;
        setSaldo(getSaldo() + interes);
        System.out.println("Se agregaron " + interes + " de imteres a la cuenta de ahorro " + getNumeroCuenta());
    }
}
