package mainabstrata;

public class Carro extends Veiculo implements EmissaoCo2 {

    private double quilometragem;
    private double indice;

    public Carro(double quilometragem, double indice, String tipo, String motor) {
        super(tipo, motor);
        this.quilometragem = quilometragem;
        this.indice = indice;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getIndice() {
        return indice;
    }

    @Override
    public void imprime() {
        System.out.println("Carro:");
        System.out.println("Tipo  :" + this.getTipo());
        System.out.println("Motor :" + this.getMotor());
        System.out.println("KM    :" + this.getQuilometragem());
        System.out.println("Emissão de CO2: " + calculoCo2());
    }

    @Override
    public double calculoCo2() {
        double t;
        t = quilometragem * indice;
        return t;
    }

}
