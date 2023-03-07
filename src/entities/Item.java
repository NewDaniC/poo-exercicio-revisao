package entities;

public class Item {
	
	private String titulo;
	private Double duracao;
	private String comentarios;
	
	public Item() {
	}

	public Item(String titulo, Double duracao, String comentarios) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.comentarios = comentarios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	public void print() {
		System.out.println("\n ### ITEM ###");
		System.out.println("Título: " + titulo);
		System.out.println("Duração: " + duracao);
		System.out.println("Comentários: " + comentarios);
	}

	@Override
	public String toString() {
		return "Item [titulo=" + titulo + ", duracao=" + duracao + ", comentarios=" + comentarios + "]";
	}
}
