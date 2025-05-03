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
		for (Show show : shows) {
			show.exibirDetalhes();
		}
	}

	public void buscarShowPorData(Date data) {
		for (Show show : shows) {
			if (show.getData().equals(data)) {
				show.exibirDetalhes();
			}
		}
	}
}