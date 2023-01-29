package controle;

import java.awt.event.*;
import javax.swing.JOptionPane;

import modelo.Album;
import modelo.Artista;
import modelo.Musica;
import modelo.Ouvinte;
import view.EditarMusicaScreen;
import view.LoginForm;
import view.MainScreen;
import view.MainScreenArtista;
import view.MusicCadScreen;
import view.MusicScreen;
import view.MusicScreenArtist;
import view.PerfilArtista;
import view.PerfilOuvinte;
import view.RegisterForm;

/**
 * A classe App e a principal classe do Programa, onde todos os seus comportamentos estao. A classe App faz a comunicacao entre os pacotes view e controle.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class App implements ActionListener{
	
	
	@SuppressWarnings("unused")
	private static LoginForm loginScreen;
	@SuppressWarnings("unused")
	private static RegisterForm registerScreen;
	@SuppressWarnings("unused")
	private static MusicScreenArtist musicaScreen;
	@SuppressWarnings("unused")
	private static MusicScreenArtist musicaScreen1;
	
	
	// INICIALIZANDO O BANCO DE DADOS
	private static ControleDeDados dados = new ControleDeDados();
	private static Artista[] artistas = dados.getArtistas();
	private static Ouvinte[] ouvintes = dados.getOuvintes();
	private static Musica[] musicas = dados.getMusicas();
	private static Album[] albuns = dados.getAlbuns();
	
	
	
	MainScreen mainScreen;
	
	// INDICA O TIPO DE USUARIO
	static int loggedUser;
	static int typeOfUser;
	
	// INFORMAÇÕES DO USUARIO
	static private Artista loggedArtista;
	static private Ouvinte loggedOuvinte;
	static private Musica selectedMusica;
	
	/**
	 * Metodo Main do Programa, onde são inicializados todos os parametros necessario para seu funcionamento
	 * @param args
	 */
	public static void main(String[] args) {
		
		// IMPRIME O BANCO DE DADOS
		System.out.println("Artistas Cadastrados: ");
		for(int i = 0; i < dados.getQtdArtistas(); i++) {
			
			System.out.println(artistas[i].toString());
		}
		System.out.println("Ouvintes Cadastrados: ");
		for(int i = 0; i < dados.getQtdArtistas(); i++) {
			
			System.out.println(ouvintes[i].toString());
		}
		
		
			
		loginScreen = new LoginForm(loginAction, regAction);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// ACOES DA TELA DE LOGIN
	
	/**
	 * Armazena os dados digitados pelo Usuario.
	 * Logo após isso, Passa pelo Array de Artistas ou Ouvintes (dependendo do valor recebido pela variável typeOfUser), e verifica se há algum email e senha semelhantes aos mesmos que foram digitados pelo Usuario
	 */
	static ActionListener loginAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// ARMAZENA AS INFORMAÇÔES DIGITADAS PELO USUARIO
			String email = LoginForm.getEmail();
			char[] senha = LoginForm.getSenha();
			String senhaStr = String.valueOf(senha);
			Artista[] artistas = dados.getArtistas();
			Ouvinte[] ouvintes = dados.getOuvintes();
			int typeOfUser = LoginForm.getTypeOfUser();
			
			
			System.out.println(email);
			System.out.println(senhaStr);
			
			// PASSA PELO ARRAY E PROCURA ARTISTAS OU OUVINTES COM ATRIBUTOS IGUALS AOS DIGITADOS
			for(int i = 0; i < dados.getQtdArtistas(); i++) {
				System.out.println(artistas[i].toString());
			}
			
			if(typeOfUser == 1) {
				if(ControleInformacoesArtista.checkArtista(email, senhaStr, artistas) == true) {
					for(int i = 0; i < dados.getQtdMusicas(); i++) {
						if(email.equals(artistas[i].getEmail()) && senhaStr.equals(artistas[i].getSenha())) {
							System.out.println("Login feito com sucesso! ARTISTAS");
							LoginForm.isVisible(false);
							loggedArtista = artistas[i];
							loggedUser = 1;
							new MainScreenArtista(cadMusica, searchAction, editPerfil, musicas, artistas, dados);
							}
						}
				
					}else {
						JOptionPane.showMessageDialog(null, "Artista não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
						}
				
			}else {
				
				if(ControleInformacoesOuvinte.checkOuvinte(email, senhaStr, ouvintes) == true) {
					for(int i = 0; i < dados.getQtdOuvintes();) {
						if(email.equals(ouvintes[i].getEmail()) && senhaStr.equals(ouvintes[i].getSenha())) {
							System.out.println("Login feito com sucesso! Ouvintes");
							LoginForm.isVisible(false);
							loggedOuvinte = ouvintes[i];
							loggedUser = 0;
							new MainScreen(searchAction, editPerfil, musicas, artistas, dados, albuns);
							break;
						} 
					}
				}else {
					JOptionPane.showMessageDialog(null, "Ouvinte não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}
	};
	
	
	/**
	 * Abre um formulário de registro para que um Usuario que não possui cadastro possa se Registrar.
	 */
	static ActionListener regAction = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			LoginForm.isVisible(false);
			registerScreen = new RegisterForm(regActionScreen, backAction);
			
		}
		
	};
	
	/**
	 * Retorna a tela de Login.
	 */
	static ActionListener backAction = new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		RegisterForm.isVisible(false);
    		loginScreen = new LoginForm(loginAction, regAction);
    		
    	}
    };

    /**
     * Armazena as informações digitadas pelo Usuario.
     * cria uma nova instancia, de Artista ou Ouvinte (dependendo da variável typeOfUser), em uma posição vazia no Array
     */
    static ActionListener regActionScreen = new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		
    		// OBTEM OS DADOS DIGITADOS PELO USUARIO
    		String email = RegisterForm.getRegEmail();
    		char[] senha = RegisterForm.getRegSenha();
    		String nome = RegisterForm.getRegName();
    		int typeOfUser = RegisterForm.getTypeOfUser();
    		String senhaStr = String.valueOf(senha);
    		
    		// VERIFICA O TIPO DE USUARIO
    		if(typeOfUser == 1) {
    			if(ControleInformacoesArtista.checkEmailArtista(email)) {
    				artistas[6] = dados.regArtista(email, senhaStr, nome);
        			loggedArtista = artistas[6];
        			System.out.println(artistas[6].toString());
        			new MainScreenArtista(cadMusica, searchAction, editPerfil, musicas, artistas, dados);
        			RegisterForm.isVisible(false);
    			} else {
    				JOptionPane.showMessageDialog(null, "Email Inválido!", "ERRO", JOptionPane.ERROR_MESSAGE);
    			}
    			// PASSA POR DENTRO DO ARRAY PROCURANDO UMA POSIÇÂO NULA E CRIA UM NOVO ARTISTA
    			
    			
    		} else {
    			if(ControleInformacoesOuvinte.checkEmailOuvinte(email) && ControleInformacoesOuvinte.checkName(nome)) {
    				ouvintes[6] = dados.regOuvinte(email, senhaStr, nome);
        			System.out.println(ouvintes[6].toString());
        			new MainScreen(searchAction, editPerfil, musicas, artistas, dados, albuns);
        			loggedOuvinte = ouvintes[6];
        			RegisterForm.isVisible(false);
    			}else {
    				JOptionPane.showMessageDialog(null, "Email ou Nome Inválidos!", "ERRO", JOptionPane.ERROR_MESSAGE);
    			}
    			
    		}
			
    		
    		
    	}
    };
    
    
    
    // ACOES DA TELA INICIAL
    
    /**
     * Armazena o texto digitado pelo Usuario no campo de busca.
     * Passa pelo array de Musicas e procura uma Musica que tenha o nome igual ao digitado.
     */
    static ActionListener searchAction = new ActionListener() {

		@Override
    	public void actionPerformed(ActionEvent e) {
			// RECEBE OS DADOS DIGITADOS PELO USUARIO
    		
    		String searchText = MainScreen.getSeacrhText();
    		String searchTextArtist = MainScreenArtista.getSeacrhText();
    		int qtdMusicas = dados.getQtdMusicas();
    		
    		if(loggedUser == 1) {
    			for(int i = 0; i < qtdMusicas; i++) {
        			if(searchTextArtist.equals(musicas[i].getNomeMusica())) {	
        				System.out.println("Música Encontrada!");
        				musicaScreen1 = new MusicScreenArtist(musicas[i], editSong);
        				selectedMusica = musicas[i];
        				MainScreenArtista.isVisible(false);
        				break;
        			}
    			}
    		}else {
    			for(int i = 0; i < qtdMusicas; i++) {
        			if(searchText.equals(musicas[i].getNomeMusica())) {	
        				System.out.println("Música Encontrada!");
        				new MusicScreen(musicas[i]);
        				break;
        			}
        		}
        		
        	}
    		
    	}
    };
    
 
    /**
     * Abre a tela para editar uma Musica
     */
    static ActionListener editSong = new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		new EditarMusicaScreen(selectedMusica,confirmEditSong, confirmDeleteSong);
    		MusicScreenArtist.isVisible(false);
    	}
    };
    /**
     * Armazena as infoemaçoes fornecidas pelo usuario.
     * Procura uma uma musica com o mesmo nome e edita seus atributos.
     */
    static ActionListener confirmEditSong = new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		String nome = EditarMusicaScreen.getNomeMusica();
    		@SuppressWarnings("unused")
			String artista = EditarMusicaScreen.getArtistName();
    		String letra = EditarMusicaScreen.getLetraMusica();
    		
    		EditarMusicaScreen.isVisible(false);
    		Musica musicEdit = new Musica(nome, letra, selectedMusica.getArtista());
    		
    		for(int i = 0; i < dados.getQtdMusicas(); i++) {
    			if(selectedMusica.getNomeMusica().equals(musicas[i].getNomeMusica())) {
    				musicas[i].setLetraMusica(letra);
    				musicas[i].setNomeMusica(nome);
    				selectedMusica.setLetraMusica(letra);
    				selectedMusica.setNomeMusica(nome);
    				System.out.println(selectedMusica.toString());
    				System.out.println(musicas[i].toString());
    				EditarMusicaScreen.isVisible(false);
    				MusicScreenArtist.isVisible(false);
    				new MusicScreenArtist(musicEdit, editSong);
    				break;
    			}
    		}
    	}
    };
    
    static ActionListener confirmDeleteSong = new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    		String nomeMusica = EditarMusicaScreen.getNomeMusica();
    		int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Deletar esta Música?", "Atenção", JOptionPane.YES_NO_OPTION);
			if(reply == JOptionPane.YES_OPTION) {
				
				
				for(int i = 0; i < dados.getQtdMusicas(); i++) {
					if(nomeMusica.equals(musicas[i].getNomeMusica())) {
						musicas[i].setNomeMusica("Musica Deletada!");
						musicas[i].setLetraMusica("Musica Deletada!");
						System.out.println(musicas[i]);
						JOptionPane.showMessageDialog(null, "Musica Deletada Com Sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
						EditarMusicaScreen.isVisible(false);
						new MainScreenArtista(cadMusica, searchAction, editPerfil, musicas, artistas, dados);
						break;
					}
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Operação Cancelada", "INFO", JOptionPane.INFORMATION_MESSAGE);
			}
    		
    	}
    };
    


    /**
     * Confere o tipo de Usuario logado e abre a tela para editar informações para seus respectivos loggedUser(que indica o tipo de usuario logado).
     */
    static ActionListener editPerfil = new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		if (loggedUser == 1) {
    			new PerfilArtista(loggedArtista, confirmarEditArtista, deleteArtista);
    		}else {
    			new PerfilOuvinte(loggedOuvinte, confirmarEditOuvinte, deleteOuvinte);
    		}
    	}
    };
    
    /**
     * Armazena os dados digitados pelos pelo usuario.
     * Atualiza os dados do Ouvinte.
     */
    static ActionListener confirmarEditOuvinte = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(loggedOuvinte.toString());
			String email = PerfilOuvinte.getEmail();
			String senha = PerfilOuvinte.getSenha();
			String nome = PerfilOuvinte.getName();
			
			loggedOuvinte.setEmail(email);
			loggedOuvinte.setSenha(senha);
			loggedOuvinte.setNomeOuviente(nome);
			PerfilOuvinte.isVisible(false);
			System.out.println(loggedOuvinte.toString());
		}
	};
	

	/**
	 * Armazena os dados digitados pelos pelo usuario.
     * Atualiza os dados do Artista.
	 */
	static ActionListener confirmarEditArtista = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(loggedArtista.toString());
			String email = PerfilArtista.getEmail();
			String senha = PerfilArtista.getSenha();
			String nome = PerfilArtista.getName();
			
			// MELHORAR ESSE SISTEMA
			loggedArtista.setEmail(email);
			loggedArtista.setSenha(senha);
			loggedArtista.setNomeArtista(nome);
			PerfilArtista.isVisible(false);
			System.out.println(loggedArtista.toString());
		}
	};
	
	/**
	 * Abre a tela de cadastro de Musica
	 */
		static ActionListener cadMusica = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MusicCadScreen(confirmCadMusica);
			}
		};
		
		
			/**
			 * Confima o cadastro da Musica;
			 * Armazena os dados digitados pelo Usuario.
			 * Verifica se o Artista fornecidos pelo Usuario estão presentes no Array de artistas.
			 */
			static ActionListener confirmCadMusica = new ActionListener() {
				@SuppressWarnings("unused")
				@Override
				public void actionPerformed(ActionEvent e) {
					String nome = MusicCadScreen.getNomeMusica();
					String letra = MusicCadScreen.getLetraMusica();
					String artista = MusicCadScreen.getArtistMusica();
					
					for(int i = 0; i < dados.getQtdArtistas(); i++) {
						if(artista.equals(artistas[i].getNomeArtista())) {
							Artista artistaMusic = artistas[i];
							musicas[i] = ControleDeDados.regMusica(nome, letra, artistaMusic);
							System.out.println(musicas[i].toString());
							MusicCadScreen.isVisible(false);
							new MusicScreen(musicas[i]);
							break;
						} else {
							JOptionPane.showMessageDialog(null, "Artista não encontrado", "ERRO", JOptionPane.ERROR_MESSAGE);
							break;
						}
						
					}
				}
			};
	
	
	
	
	
	/*
	 * Deleta o Ouvinte.
	 * Como não é possível deletar um objeto, está função procura um Ouvinte com os mesmos atributos do Ouvinte Logado (loggedOuvinte) e o tranforma em um objeto nulo(null).
	 */
	static ActionListener deleteOuvinte = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Deletar este Ouvinte?", "Atenção", JOptionPane.YES_NO_OPTION);
			if(reply == JOptionPane.YES_OPTION) {
				
				
				for(int i = 0; i < dados.getQtdOuvintes(); i++) {
					if(loggedOuvinte.getEmail().equals(ouvintes[i].getEmail()) && loggedOuvinte.getSenha().equals(ouvintes[i].getSenha())) {
						ouvintes[i] = null;
						System.out.println("Deletado Com sucesso!" + loggedOuvinte.toString());
						PerfilOuvinte.isVisible(false);
						loginScreen = new LoginForm(loginAction, regAction);
						loggedOuvinte = null;
						
					}
				}
				
			}else {
				JOptionPane.showMessageDialog(null, "Operação Cancelada", "INFO", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	};
	
	/**
	 * Deleta o Ouvinte.
	 * Como não é possível deletar um objeto, está função procura um Artista com os mesmos atributos do Artista Logado (loggedArtista) e o tranforma em um objeto nulo(null). 
	 */
	static ActionListener deleteArtista = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int reply = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja Deletar este Ouvinte?", "Atenção", JOptionPane.YES_NO_OPTION);
			if(reply == JOptionPane.YES_OPTION) {
				for(int i = 0; i < dados.getQtdArtistas(); i++) {
					if(loggedArtista.getEmail().equals(artistas[i].getEmail()) && loggedArtista.getSenha().equals(artistas[i].getSenha())) {
						artistas[i] = null;
						System.out.println("Deletado Com sucesso!" + loggedArtista.toString());
						PerfilArtista.isVisible(false);
						MainScreenArtista.isVisible(false);
						loginScreen = new LoginForm(loginAction, regAction);
						loggedArtista = null;
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "Operação Cancelada", "INFO", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	};
	
}
