
import java.util.Date;

public class Show {
  private Date data;
  private Local local;
  private int ingressosDisponiveis;
  private Double precoDoIngresso;

  public Show (Date data, Local local, int ingressosDisponiveis, Double precoDoIngresso) {
    this.data = data;
    this.local = local;
    this.ingressosDisponiveis = ingressosDisponiveis;
    this.precoDoIngresso = precoDoIngresso;
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

  public Double getPrecoDoIngresso() {
    return this.precoDoIngresso;
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

  };
} 
