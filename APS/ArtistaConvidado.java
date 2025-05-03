import java.util.Date;

public class ArtistaConvidado extends Show {
  private String nomeDoArtista;
  private Double cache;

  public ArtistaConvidado(String nome, Double cache, Date data, Local local, Ingresso ingresso, int ingressosDisponiveis) {
    super(data, local, ingresso, ingressosDisponiveis);

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
