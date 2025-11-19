public class Carros extends Veiculo {

    String placaCarro;
    String corCarro;
    
    public Carros(String modelo, double preco, int ano, int kmRodados, String placaCarro, String corCarro) {
        super(modelo, preco, ano, kmRodados);
        this.placaCarro = placaCarro;
        this.corCarro = corCarro;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    @Override
    public String toString() {
        return "Carros [modelo=" + modelo + ", placaCarro=" + placaCarro + ", ano=" + ano + ", corCarro=" + corCarro
                + ", kmRodados=" + kmRodados + "]";
    }
    
}
