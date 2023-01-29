package controle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Artista;

/**
 * Classe que testa funções da classe ControleInformacoesArtista.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
class ControleInformacoesArtistaTest {
	
	ControleDeDados dados = new ControleDeDados();
	Artista[] artistas = dados.getArtistas();

	
	@Test
	/**
	 * Testa o metodo checkArtista().
	 */
	void testCheckArtista() {
		String emailErrado = "123132@gmail.com";
		String emailCerto = "skrillex@gmail.com";
		String senhaErrada = "111";
		String senhaCerta = "123";
		
		assertTrue(ControleInformacoesArtista.checkArtista(emailCerto, senhaCerta, artistas));
		assertFalse(ControleInformacoesArtista.checkArtista(emailErrado, senhaErrada, artistas));
	}

}
