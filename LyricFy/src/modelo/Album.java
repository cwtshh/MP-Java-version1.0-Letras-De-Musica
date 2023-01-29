package modelo;

/**
 * Classe que visa criar um Objeto Album, com seus devidos Atributos
 * @author gucos
 * @since 2022
 * @version 1.0
 */

public class Album {
	private Musica[] musicList;
	private String nomeAlbum;
	private Artista artistaAlbum;
	
	/**
	 * O Construtor recebe os argumentos que serão digitados pelo Usuario e Instancia um novo objeto Album.
	 * @param nomeAlbum
	 * Define o nome do Album.
	 * @param artistaAlbum
	 * Define o Artista autor do Album.
	 * @param musicList
	 * Define a lista de musicas que pertence a este album.
	 */
	public Album(String nomeAlbum, Artista artistaAlbum, Musica[] musicList) {
		this.nomeAlbum = nomeAlbum;
		this.artistaAlbum = artistaAlbum;
		this.musicList = musicList;
	}
	
	public Musica[] getMusicas() {
		return musicList;
	}
	public void setMusicas(Musica[] musicList) {
		this.musicList = musicList;
	}
	
	public String getNomeAlbum() {
		return nomeAlbum;
	}
	public void setNomeAlbum(String nomeAlbum) {
		this.nomeAlbum = nomeAlbum;
	}
	
	public Artista getArtista() {
		return artistaAlbum;
	}
	public void setArtista(Artista artistaAlbum) {
		this.artistaAlbum = artistaAlbum;
	}
	
	
}
