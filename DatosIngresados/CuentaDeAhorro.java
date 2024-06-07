package DatosIngresados;

public class CuentaDeAhorro extends CuentaBancaria{
    public double tasaInteres;


    public CuentaDeAhorro (int numeroCuenta, double tasaInteres){
        super(numeroCuenta);
        this.tasaInteres=tasaInteres;
    }
}
