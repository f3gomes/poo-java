import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GerenciamentoEventos {
	private List<Show> shows;
	private Double totalDasVendas;

	public GerenciamentoEventos() {
		this.shows = new ArrayList<>();
		this.totalDasVendas = 0.0;
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

	public void calculaFaturamento() {
		for (Show show : shows) {
			this.totalDasVendas += show.getValorDasVendas();
		}

		System.out.println("");
		System.out.println("***************************************************");
		System.out.println("Valor total dos ingressos vendidos: " +this.totalDasVendas);
		System.out.println("***************************************************");
	}
}