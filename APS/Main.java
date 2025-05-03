
import java.util.Date;

public class Main {
  public static void main(String[] args) {
      Local l1 = new Local("Castelão", "Fortaleza", 50000);
      Local l2 = new Local("Armazém", "Fortaleza", 10000);

      Date d1 = new Date(125, 6, 1);
      Date d2 = new Date(125, 10, 2);

      Show s1 = new Show();
      s1.setLocal(l1);
      s1.setData(d1);
      s1.setIngressosDisponiveis(5);
      s1.setPrecoDoIngresso(100.0);

      Show s2 = new Show();
      s2.setLocal(l1);
      s2.setData(d2);
      s2.setIngressosDisponiveis(5);
      s2.setPrecoDoIngresso(200.0);

      Show s3 = new Show();
      s3.setLocal(l2);
      s3.setData(d1);
      s3.setIngressosDisponiveis(5);
      s3.setPrecoDoIngresso(300.0);

      GerenciamentoEventos ge = new GerenciamentoEventos();

      ge.adicionarShow(s1);
      ge.adicionarShow(s2);
      ge.adicionarShow(s3);

      ge.listarShows();
  }
}