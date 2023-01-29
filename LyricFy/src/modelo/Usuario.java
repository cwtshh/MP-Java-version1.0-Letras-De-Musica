package modelo;

/**
 * Classe Abstrada que tem como filhos: Artista e Musica. Tem como objetivo padronizar as duas classes citadas anteriormente, com email e senha para que seja possivel fazer o sistema login.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public abstract class Usuario {
	private String email;
	private String senha;
	
	/**
	 * Construtor da classe Usuario, porém a mesma não será instanciada pois é uma classe abstrata.
	 * @param email
	 * Define o email do usuario. String.
	 * @param senha
	 * Define a senha do usuario. String.
	 */
	public Usuario (String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * Sobrescreve o metodo toString, das classes Object. Mostrando uma String com todos os artributos da Classe.
	 * @return String
	 */
	@Override
	public String toString() {
		return "possui o email" + this.getEmail() + " e a senha " + this.getSenha();
	}
}
