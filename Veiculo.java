public class Veiculo {
    String modelo;
    double preco;
    int ano;
    int kmRodados;

    public Veiculo(String modelo, double preco, int ano, int kmRodados) {
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
        this.kmRodados = kmRodados;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularTotal(int dias) {
        return preco * dias;
    }

    @Override
    public String toString() {
        return "Veiculo [modelo=" + modelo + ", preco=" + preco + ", ano=" + ano + ", kmRodados=" + kmRodados + "]";
    }

    
}
