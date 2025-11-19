public class NotaFiscal {
    double valor;
    String dataDaVenda;
    int numeroDaNota;

    public NotaFiscal(double valor, String dataDaVenda, int numeroDaNota) {
        this.valor = valor;
        this.dataDaVenda = dataDaVenda;
        this.numeroDaNota = numeroDaNota;
    }

    public void setNumeroDaNota(int numeroDaNota) {
        this.numeroDaNota = numeroDaNota;
    }
    public int getNumeroDaNota() {
        return numeroDaNota;
    }


    public void setDataDaVenda(String dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }
    public String getDataDaVenda() {
        return dataDaVenda;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    }
    
    @Override
    public String toString() {
        return "valor:" + valor + "\n" + "data da venda:" + dataDaVenda + "\n" + "numero da nota:" + numeroDaNota;
    }
    
}
