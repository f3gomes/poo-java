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

  public abstract void exibirDetalhes();
}
