
public class Moto extends Veiculo {

    protected String pezinho;
    protected String capacete;

    public Moto(String modelo, double preco, int ano, int kmRodados, String pezinho, String capacete) {
        super(modelo, preco, ano, kmRodados);
        this.pezinho = pezinho;
        this.capacete = capacete;

    }

    public void setPezinho(String pezinho) {
        this.pezinho = pezinho;
    }

    public String getPezinho() {
        return pezinho;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getCapacete() {
        return capacete;
    }

    @Override
    public String toString() {
        return "Moto [Pezinho= " + pezinho
                + ", Capacete= " + capacete
                + ", Modelo= " + modelo
                + ", Preco= " + preco
                + ", Ano= " + ano
                + ", KmRodados= " + kmRodados + "]";

    }

}
