public class Locadora {
    Agenda agenda = new Agenda();

    public void agendar(Veiculo v, String data){
        agenda.reservas.add(v);
        agenda.datareserva.add(data);
    }
    public void gerarNota(Veiculo v, int valor,String dataDaVenda,int numeroDaNota,int dias) {
        NotaFiscal n = new NotaFiscal(valor, dataDaVenda, numeroDaNota);
        n.valor = v.calcularTotal(dias);
        System.out.println("Valor da nota: "+n);
    }
}
