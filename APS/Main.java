
import java.util.Date;

public class Main {
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
      Local local1 = new Local("Castelão", "Fortaleza", 50000);
      Local local2 = new Local("Armazém", "Fortaleza", 10000);

      Date dia1 = new Date(125, 6, 1);
      Date dia2 = new Date(125, 10, 2);

      Ingresso vip = new Ingresso(123, TipoDeIngresso.VIP, 200.0);
      Ingresso pista = new Ingresso(123, TipoDeIngresso.PISTA, 100.0);
      Ingresso camarote = new Ingresso(123, TipoDeIngresso.CAMAROTE, 300.0);

      Show s1 = new Show(dia1, local1, pista, 5);
      Show s2 = new Show(dia2, local1, vip, 5);
      Show s3 = new Show(dia2, local2, camarote, 5);

      GerenciamentoEventos gerenciar = new GerenciamentoEventos();

      gerenciar.adicionarShow(s1);
      gerenciar.adicionarShow(s2);
      gerenciar.adicionarShow(s3);

      gerenciar.listarShows();
      gerenciar.buscarShowPorData(dia2);
  }
}