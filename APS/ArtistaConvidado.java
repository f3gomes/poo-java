public class ArtistaConvidado extends Show {
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

  @Override
  public void exibirDetalhes() {
    super.exibirDetalhes();
    System.out.println("Artista convidado: " + this.nomeDoArtista);
    System.out.println("Cache" + this.cache);
  }
} 
