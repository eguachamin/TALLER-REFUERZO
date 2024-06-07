package DatosIngresados;


class CuentaCorriente extends CuentaBancaria {
    public double limiteDescubierto;

    public CuentaCorriente (int numeroCuenta, double limiteDescubierto){
        super(numeroCuenta);
        this.limiteDescubierto=limiteDescubierto;
    }
    @Override
    public void retirar(){
        limiteDescubierto=getSaldo();
        if (limiteDescubierto<0 | getMonto()>getSaldo()){
            System.out.println("Usted no tiene saldo suficiente para realizar ese retiro ");
        }
        else {
            retirar();
        }
    }
}
