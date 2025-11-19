
public class Moto extends Veiculo {

    private String placa;

    public Moto(String modelo, double preco, int ano, int kmRodados, String placa) {
        super(modelo, preco, ano, kmRodados);
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Moto [placa= " + placa
                + ", modelo= " + modelo
                + ", preco= " + preco
                + ", ano= " + ano
                + ", kmRodados= " + kmRodados + "]";

    }

}
