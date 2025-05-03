import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciamentoEventos {
	private List<Show> shows;

	public GerenciamentoEventos() {
		this.shows = new ArrayList<>();
	}

	public void adicionarShow(Show show) {
		shows.add(show);
	}

	public void listarShows() {
		System.out.println("Lista de shows: ");
		System.out.println("***************************************************");
		for (Show show : shows) {
			show.exibirDetalhes();
		}

		System.out.println("***************************************************");
	}

	public void buscarShowPorData(Date data) {
		System.out.println("Lista de shows no dia: " + data);
		System.out.println("***************************************************");
		for (Show show : shows) {
			if (show.getData().equals(data)) {
				show.exibirDetalhes();
			}
		}

		System.out.println("***************************************************");
	}
}