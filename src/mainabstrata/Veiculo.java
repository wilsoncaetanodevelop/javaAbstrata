
package mainabstrata;

public abstract class Veiculo implements EmissaoCo2 {
    
    private String tipo;
    private String motor;

    public Veiculo(String tipo, String motor) {
        this.tipo = tipo;
        this.motor = motor;
    }

    protected String getTipo() {
        return tipo;
    }

    protected String getMotor() {
        return motor;
    }

    @Override
    public abstract double calculoCo2();
    
    
}
