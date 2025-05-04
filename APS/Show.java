import java.util.Date;

public class Show {
  private Date data;
  private Local local;
  private Ingresso ingresso;
  private int ingressosDisponiveis;
  private Double valorDasVendas;

  public Show(Date data, Local local, Ingresso ingresso, int ingressosDisponiveis) {
    this.valorDasVendas = 0.0;
    this.data = data;
    this.local = local;
    this.ingresso = ingresso;
    this.ingressosDisponiveis = ingressosDisponiveis;
  }

  public Date getData() {
    return this.data;
  }

  public Local getLocal() {
    return this.local;
  }

  public int getIngressosDisponiveis() {
    return this.ingressosDisponiveis;
  }

  public Ingresso getIngresso() {
    return this.ingresso;
  }

  public Double getValorDasVendas() {
    return this.valorDasVendas;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public void setLocal(Local local) {
    this.local = local;
  }

  public void setIngressosDisponiveis(int ingressosDisponiveis) {
    this.ingressosDisponiveis = ingressosDisponiveis;
  }

  public void setIngresso(Ingresso ingresso) {
    this.ingresso = ingresso;
  }

  public void venderIngresso(int quantidade) {
    if (this.ingressosDisponiveis >= quantidade) {
      this.ingressosDisponiveis -= quantidade;
      this.valorDasVendas += ingresso.getPreco() * quantidade;

      System.out.println(quantidade + " ingressos foram vendidos para o show no " + this.local.getNome());
    } else {
      System.out.println("Ingressos esgotados");
    }
  }

  public void verificarDisponibilidade() {
    System.out.println("Ingressos disponíveis: " + this.ingressosDisponiveis);
  }

  public void exibirDetalhes() {
    System.out.println("Local: " + this.local.getNome());
    System.out.println("Data: " + this.data);
    System.out.println("Valor do Ingresso: " + this.ingresso.getPreco());
    System.out.println("");
  };

}
