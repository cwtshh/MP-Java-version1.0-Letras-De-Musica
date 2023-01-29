package modelo;

/**
 * Classe que visa criar o objeto Ouvinte, que herda de Usuario.
 * @author gucos
 * @since 2022
 * @version 1.0
 */
public class Ouvinte extends Usuario{
	private String nomeUsuario;
	private Musica[] musicasSalvas;
	int id = 0;
	
	/**
	 * O Construtor da Classe Ouvinte ira receber os valores digitados pelo Usuario, logo apos os mesmos serem passados pela pacote controle.
	 * Assim, intanciando um Usuario do Tipo Ouvinte.
	 * @param email
	 * Define email do Usuario. String.
	 * @param senha
	 * Define a senha do Usuario. String
	 * @param nomeUsuario
	 * Define o nome do Usuario. String.
	 * @param musicasSalvas
	 * Define as Musicas Salvas do Usuario.
	 */
	public Ouvinte (String email, String senha, String nomeUsuario, Musica[] musicasSalvas) {
		super(email, senha);
		this.nomeUsuario = nomeUsuario;
		this.musicasSalvas = musicasSalvas;
	}
	
	public String getNomeOuvinte() {
		return nomeUsuario;
	}
	public void setNomeOuviente(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public void getMusicasSalvas() {
		for(int i = 0; i < musicasSalvas.length; i++) {
			System.out.println(musicasSalvas[i].getNomeMusica());
		}
	}
	
	/**
	 * Retorna o Id, indentificando o usuario como ouvinte
	 * @return int
	 * retorna o Id do Ouvinte, que identifica seu tipo de Usuario
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sobrescreve o metodo toString, das classes Object. Mostrando uma String com todos os artributos da Classe.
	 * @return String
	 */
	@Override
	public String toString() {
		return "O ouvinte " + this.nomeUsuario + " Com o email " + this.getEmail() + " e a senha " + this.getSenha();
	}
}
