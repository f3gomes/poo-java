public abstract class Ingresso {
  private int codigo;
  private TipoDeIngresso tipo;
  private Double preco;

  public Ingresso(int codigo, TipoDeIngresso tipo, Double preco) {
    this.codigo = codigo;
    this.tipo = tipo;
    this.preco = preco;
  }

  public int getCodigo() {
    return  this.codigo;
  }
  
  public TipoDeIngresso getTipo() {
    return this.tipo;
  }

  public Double getPreco() {
    return this.preco;
  }

  public void exibirDetalhes() {
    System.out.println("Codigo: " + this.codigo);
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Valor:" + this.preco);
  }
}
