package mainabstrata;

public class Barco extends Veiculo implements EmissaoCo2 {

    private double quilometragemB;
    private double indiceB;

    public Barco(double quilometragemB, double indiceB, String tipo, String motor) {
        super(tipo, motor);
        this.quilometragemB = quilometragemB;
        this.indiceB = indiceB;
    }

    public double getQuilometragemB() {
        return quilometragemB;
    }

    public double getIndiceB() {
        return indiceB;
    }

    @Override
    public void imprime() {
        System.out.println("Carro:");
        System.out.println("Tipo  :" + this.getTipo());
        System.out.println("Motor :" + this.getMotor());
        System.out.println("KM    :" + this.getQuilometragemB());
        System.out.println("Emissão de CO2: " + calculoCo2());
    }

    @Override
    public double calculoCo2() {
        double t;
        t = quilometragemB * indiceB;
        return t;
    }
}
