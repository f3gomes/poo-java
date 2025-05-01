public class Local {
  private String nome;
  private String cidade;
  private int capacidadeMaxima;

  public Local(String nome, String cidade, int capacidadeMaxima) {
    this.nome = nome;
    this.cidade = cidade;
    this.capacidadeMaxima = capacidadeMaxima;
  }

  public String getNome() {
    return this.nome;
  }

  public String getCidade() {
    return this.cidade;
  }

  public int getCapacidadeMaxima() {
    return this.capacidadeMaxima;
  }

  public void exibirInformacoes() {
    System.out.println("Informações sobre o local: ");
    System.out.println("Nome: "+ this.nome);
    System.out.println("Cidade: "+ this.cidade);
    System.out.println("Capacidade máxima: "+ this.capacidadeMaxima);
  }
}
