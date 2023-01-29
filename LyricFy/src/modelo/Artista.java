package modelo;
/**
 * A Classe Artista visa criar um uma ficha de informacoes pertencentes a um Artista e herda da Classe Usuario
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */

public class Artista extends Usuario{
	private String nomeArtista;
	private Musica[] musicList;
	int id = 1;
	
	/**
	 * O Construtor da Classe Artista ira receber os valores digitados pelo Usuario, logo apos os mesmos serem passados pela classe controle.
	 * Assim, intanciando um Usuario do Tipo Artista.
	 * @param email
	 * Recebe o email do Artista
	 * @param senha
	 * Recebe a senha do Artista
	 * @param nomeArtista
	 * Recebe o nome do Artista
	 * @param musicas
	 * Recebe as Musicas do Artista
	 */
	
	public Artista(String email, String senha, String nomeArtista, Musica[] musicas) {
		super(email, senha);
		this.nomeArtista = nomeArtista;
		this.musicList = musicas;
		
	}
	
	public String getNomeArtista() {
		return nomeArtista;
	}
	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}
	
	public String[] getMusicList() {
		String[] s = new String[5];
		for (int i = 0; i < musicList.length; i++) {
			s[i] = musicList[i].getNomeMusica();		
		}return s;
	}
	public void setMusicList(Musica[] musicList) {
		this.musicList = musicList;
	}
	
	/**
	 * Este metodo pega o Id do Usuario, que seria um, caso o Usuario seja um Artista.
	 * @return int
	 * Retorna o Id do Usuario, que identifica o tipo de Usuario.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sobrescreve o metodo toString, das classes Object. Mostrando uma String com todos os artributos da Classe.
	 * @return String
	 * Retorna um String que descreve o Objeto.
	 */
	@Override
	public String toString() {
		return "O artista " + this.nomeArtista + " Que tem o email: " + this.getEmail() + " e a senha: " + this.getSenha();
	}
	
}
