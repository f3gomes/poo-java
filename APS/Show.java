
import java.util.Date;

public class Show {
  private Date data;
  private Local local;
  private Double precoDoIngresso;
  private int ingressosDisponiveis;

  public Date getData() {
    return this.data;
  }

  public Local getLocal() {
    return this.local;
  }

  public int getIngressosDisponiveis() {
    return this.ingressosDisponiveis;
  }

  public Double getPrecoDoIngresso() {
    return this.precoDoIngresso;
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

  public void setPrecoDoIngresso(Double preco) {
    this.precoDoIngresso = preco;
  }

  public void venderIngresso(int quantidade) {
    if(this.ingressosDisponiveis > quantidade) {
      this.ingressosDisponiveis -= quantidade;
    }
  }

  public void verificarDisponibilidade() {
    System.out.println("Ingressos disponíveis: " + this.ingressosDisponiveis);
  }

  public void exibirDetalhes() {
    System.out.println("Show Do Bell Marques");
    System.out.println("Local: " + this.local.getNome());
    System.out.println("Data: " + this.data);
    System.out.println("Valor do Ingresso: " + this.precoDoIngresso);
    System.out.println("");
  };
} 
