package controle;

import modelo.*;
import view.*;

/**
 * A classe ControleDeDados simula um banco de dados para alimentar a aplicacao
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class ControleDeDados {
	private Dados d = new Dados();

	/**
	 * Adiciona as classes instanciadas criados na classe Dados
	 */
	public ControleDeDados() {
		d.addData();
	}
	
	public Dados getDados() {
		return d;
	}
	
	
	// MUSICA
	public Musica[] getMusicas() {
		return this.d.getMusicas();
	}
	public int getQtdMusicas() {
		return this.d.getQtdMusicas();
	}
	
	// ARTISTA
	public Artista[] getArtistas() {
		return d.getArtistas();
	}
	public int getQtdArtistas() {
		return this.d.getQtdArtistas();
	}
	
	// OUVINTES
	public Ouvinte[] getOuvintes() {
		return this.d.getOuvintes();
	}
	public int getQtdOuvintes() {
		return this.d.getQtdOuvintes();
	}
	
	// ALBUNS
	public Album[] getAlbuns() {
		return this.d.getAlbuns();
	}
	
	/**
	 * Funcções que respectivamente, recebem as informacoes digitadas pelo Usuario e instancia um novo Objeto Artista	.
	 * @param email
	 * Define o email do Usuario. String.
	 * @param senha
	 * Define a senha do Usuario. String.
	 * @param nome
	 * Define o nome do Usuario. String
	 * @return
	 * Retorna um Objeto Artista instanciado.
	 */
	public Artista regArtista(String email, String senha, String nome) {
		return new Artista(email, senha, nome, null);
	}
	
	/**
	 * Funcções que respectivamente, recebem as informacoes digitadas pelo Usuario e instancia um novo Objeto Ouvinte.
	 * @param email
	 * Define o email do Usuario. String.
	 * @param senha
	 * Define a senha do Usuario. String.
	 * @param nome
	 * Define o nome do Usuario. String
	 * @return
	 * Retorna um Objeto Ouvinte instanciado.
	 */
	public Ouvinte regOuvinte(String email, String senha, String nome) {
		return new Ouvinte(email, senha, nome, null);
	}
	
	/**
	 * Funcções que respectivamente, recebem as informacoes digitadas pelo Usuario e instancia um novo Objeto musica.
	 * @param nome
	 * Define o nome da Musica. String.
	 * @param letra
	 * Define a letra da Musica. String
	 * @param artista
	 * Define o Arista da Musica. Artista.
	 * @return
	 * Retorna um Objeto Musica instanciado.
	 */
	public static Musica regMusica(String nome, String letra, Artista artista) {
		return new Musica(nome, letra, artista);
	}
	
}
