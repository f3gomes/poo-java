public class Ingresso {
  private int codigo;
  private TipoDeIngresso tipo;
  private Double precoDoIngresso;

  public Ingresso(int codigo, TipoDeIngresso tipo, Double precoDoIngresso) {
    this.codigo = codigo;
    this.tipo = tipo;
    this.precoDoIngresso = precoDoIngresso;
  }

  public int getCodigo() {
    return  this.codigo;
  }
  
  public TipoDeIngresso getTipo() {
    return this.tipo;
  }

  public Double getPreco() {
    return this.precoDoIngresso;
  }

  public void exibirDetalhes() {
    System.out.println("Codigo: " + this.codigo);
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Valor:" + this.precoDoIngresso);
  }
}
