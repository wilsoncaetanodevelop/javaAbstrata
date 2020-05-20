package mainabstrata;

public class Bicicleta extends Veiculo implements EmissaoCo2 {

    private double quilometragemC;
    private double indiceC;

    public Bicicleta(double quilometragemC, double indiceC, String tipo, String motor) {
        super(tipo, motor);
        this.quilometragemC = quilometragemC;
        this.indiceC = indiceC;
    }

    public double getQuilometragemC() {
        return quilometragemC;
    }

    public double getIndiceC() {
        return indiceC;
    }

   @Override
    public void imprime() {
        System.out.println("Carro:");
        System.out.println("Tipo  :" + this.getTipo());
        System.out.println("Motor :" + this.getMotor());
        System.out.println("KM    :" + this.getQuilometragemC());
        System.out.println("Emissão de CO2: " + calculoCo2());
    }

    @Override
    public double calculoCo2() {
        double t;
        t = quilometragemC * indiceC;
        return t;
    }

}
