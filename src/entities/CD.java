package entities;

public class CD extends Item {

	private String artista;
	private Integer faixas;
	
	public CD() {
	}

	public CD(String titulo, Double duracao, String comentarios, String artista, Integer faixas) {
		super(titulo, duracao, comentarios);
		this.artista = artista;
		this.faixas = faixas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public Integer getFaixas() {
		return faixas;
	}

	public void setFaixas(Integer faixas) {
		this.faixas = faixas;
	}
	
	public static void print() {
		System.out.println("\n ### CD ###");
	}

	@Override
	public String toString() {
		return "*** CD ***"
				+ "\nTitulo - " + getTitulo()
				+ "\nDuracao - " + getDuracao()
				+ "\nComentario - " + getComentarios()
				+ "\nArtista - " + artista
				+ "\nFaixas - " + faixas + "\n";
	}
}
