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
		for(Show show: shows)  {
			show.exibirDetalhes();
		}
	}

	public List<Show> buscarShowPorData(Date data) {
		List<Show> result = new ArrayList<>();

		for(Show show : shows) {
			if(show.getData().equals(data)) {
				result.add(show);
			}
		}

		return result;
	}
}