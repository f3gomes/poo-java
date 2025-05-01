public abstract class ArtistaConvidado {
  private String nomeDoArtista;
  private Double cache;

  public ArtistaConvidado(String nome, Double cache) {
    this.nomeDoArtista = nome;
    this.cache = cache;
  }

  public String getNome() {
    return this.nomeDoArtista;
  }

  public Double getCache() {
    return this.cache;
  }

  public abstract void exibirDetalhes();
} 
