package controle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Ouvinte;

/**
 * Classe que testa funções da classe ControleInformacoesOuvinte.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
class ControleInformacoesOuvinteTest {
	
	ControleDeDados dados = new ControleDeDados();
	Ouvinte[] ouvintes = dados.getOuvintes();

	/**
	 * Testa os métodos implementados na Classe ControleInformacoesOuvinte
	 */
	@Test
	void testCheckEmailOuvinte() {
		String emailErrado = "sjajd@@@gmail.com.";
		String emailCerto = "cleiton@gmail.com";
		assertTrue(ControleInformacoesOuvinte.checkEmailOuvinte(emailCerto));
		assertFalse(ControleInformacoesOuvinte.checkEmailOuvinte(emailErrado));
	}

	@Test
	void testCheckName() {
		String nomeErrado = "123Cleiton";
		String nomeCerto = "Cleiton";
		assertTrue(ControleInformacoesOuvinte.checkName(nomeCerto));
		assertFalse(ControleInformacoesOuvinte.checkName(nomeErrado));
	}
	
	@Test
	void testCheckOuvinte() {
		String emailErrado = "2132131@gmail.com";
		String emailCerto = "cleiton@gmail.com";
		
		String senhaErrada = "23213";
		String senhaCerta = "123";
		
		assertTrue(ControleInformacoesOuvinte.checkOuvinte(emailCerto, senhaCerta, ouvintes));
		assertFalse(ControleInformacoesOuvinte.checkOuvinte(emailErrado, senhaErrada, ouvintes));
	}

}
