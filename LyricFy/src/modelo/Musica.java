package modelo;
/**
 * Classe que visa criar uma ficha de informacoes pertencentes a uma Musica. Possuindo, respectivamente, nome, letra e artista.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */

public class Musica {
	private String nomeMusica;
	private String letraMusica;
	private Artista artista;
	
	/**
	 O Construtor da Classe Musica ira receber os valores digitados pelo Usuario, logo apos os mesmos serem passados pela classe controle.
	 * Assim, instanciando uma nova Musica.
	 * @param nomeMusica
	 * @param letraMusica
	 * @param artista
	 */
	public Musica (String nomeMusica, String letraMusica, Artista artista) {
		this.nomeMusica = nomeMusica;
		this.letraMusica = letraMusica;
		this.artista = artista;
	}
	
	public String getNomeMusica() {
		return nomeMusica;
	}
	
	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	
	public String getLetraMusica() {
		return letraMusica;
	}
	
	public void setLetraMusica(String letraMusica) {
		this.letraMusica = letraMusica;
	}
	
	public String getNomeArtista () {
		return artista.getNomeArtista();
	}
	public void setNomeArtista(Artista artista) {
		this.artista = artista;
	}
	
	public Artista getArtista() {
		return this.artista;
	}
	
	/**
	 * Sobrescreve o método toString, das classes Object. Mostrando uma String com todos os artributos da Classe.
	 * @return String
	 */
	public String toString() {
		return "A musica " + this.getNomeMusica() + " Do Artista" + this.getNomeArtista() + "\r\n Com a Letra: " + this.getLetraMusica();
	}
}
