package entities;

public class DVD extends Item  {

	private String diretor;
	
	public DVD() {
	}

	public DVD(String titulo, Double duracao, String comentarios, String diretor) {
		super(titulo, duracao, comentarios);
		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	public String toString() {
		return "*** DVD ***"
				+ "\nTitulo - " + getTitulo()
				+ "\nDuracao - " + getDuracao()
				+ "\nComentario - " + getComentarios()
				+ "\nDiretor - " + diretor + "\n";
	}
}
