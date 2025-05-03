
import java.util.Date;

public class Main {
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
      Local l1 = new Local("Castelão", "Fortaleza", 50000);
      Local l2 = new Local("Armazém", "Fortaleza", 10000);

      Date d1 = new Date(125, 6, 1);
      Date d2 = new Date(125, 10, 2);

      Ingresso vip = new Ingresso(123, TipoDeIngresso.VIP, 200.0);
      Ingresso pista = new Ingresso(123, TipoDeIngresso.PISTA, 100.0);
      Ingresso camarote = new Ingresso(123, TipoDeIngresso.CAMAROTE, 300.0);

      Show s1 = new Show(d1, l1, pista, 5);
      Show s2 = new Show(d2, l1, vip, 5);
      Show s3 = new Show(d2, l2, camarote, 5);

      GerenciamentoEventos ge = new GerenciamentoEventos();

      ge.adicionarShow(s1);
      ge.adicionarShow(s2);
      ge.adicionarShow(s3);

      ge.listarShows();
      ge.buscarShowPorData(d2);
  }
}