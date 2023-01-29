package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.ControleDeDados;
import modelo.Artista;
import modelo.Musica;

/**
 * Nesta classe e programada a Tela na qual e exibida as informacoes de uma Musica.
 * IMPORTANTE! existem 2 tipos de MainScreen, a variantes MusicScreenArtist possui um botão para que um Usuario do tipo Artista possa cadastrar um Objeto do tipo Musica.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */

public class MainScreenArtista implements ActionListener{
	
	static JTextField searchField = new JTextField();
	static JFrame mainFrame = new JFrame("LyricFy");
	static JPanel musicCards = new JPanel();
	static JLabel musicCardName;
	private static String[] s = new String[5];
	private static String[] a = new String[5];

	/**
	 * Construtor da Classe MainScreenArtista, onde sao exibidas as listagens.
	 * Daqui e possivel cadastras Musica, editar Musica, buscar Musica, editar perfil. Relacionados ao Artista.
	 * O construtor pede um ActionListener "search" que define o que acontece quando o JButton search é clicado.
	 * ActionListener cadMusica, para definir o que acontece quando o JButton editar eé pressionado.
	 * ActionListener editProf, que define o que acontecerá quando o JButton edit for clicado.
	 * Um array de Musica, Artista para que sejam exibidas a listagem.
	 * Controle de Dados, para obter os dados.
	 * @param cadMusic
	 * Recebe um ActionListener que tem a função de Abrir a tela de Cadastro.
	 * @param buscar
	 * Recebe um ActionListener que tem a função de Buscar uma Musica.
	 * @param editProf
	 * Recebe um ActionListener que tem a função de abrir a tela de Edição.
	 * @param musicas1
	 * Recebe um Array de Musica que serão exibidos na listagem.
	 * @param artistas
	 * Recebe um Array de Artista que serão exibidos na listagem.
	 * @param dados
	 * Recebe os dados contidos na classe ControleDeDados
	 */
	public MainScreenArtista(ActionListener cadMusic, ActionListener buscar, ActionListener editProf, Musica[] musicas1, Artista[] artistas, ControleDeDados dados) {
		// NOME MUSICA
				JPanel musicPanel1 = new JPanel();
				musicPanel1.setLayout(null);
				musicPanel1.setBounds(0,0, 1000,50);
				musicPanel1.setBackground(new Color(25, 20, 20));
						
				Container container = new Container();
						
				// LETRA MUSICA
				JPanel musicPanel3 = new JPanel();
				musicPanel3.setLayout(null);
				musicPanel3.setBounds(0,50,1000,700);
				musicPanel3.setBackground(Color.BLACK);
				
				// TELA COM MUSICAS
				JPanel musicListPanel = new JPanel();
				musicListPanel.setLayout(new BorderLayout());
				musicListPanel.setBounds(140, 20, 720,530);
				musicListPanel.setBackground(new Color(25, 20, 20));
				musicPanel3.add(musicListPanel);
				
				
				
			
				// LISTAGEM DE MUSICAS
				for(int i = 0; i < 5; i++) {
					s[i] = musicas1[i].getNomeMusica() + "\r\n" + "\r\n";
					System.out.println(s);
				}
				
				for(int i = 0; i < dados.getQtdArtistas(); i++) {
					a[i] = artistas[i].getNomeArtista() + " Que tem a(s) Música(s) " + musicas1[i].getNomeMusica() + "\r\n" + "\r\n";
				}
				JTextArea musicasList = new JTextArea();
				musicasList.setEditable(false);
				musicasList.setText("Musicas Cadastradas:" +
						"\r\n"
						+" " + Arrays.toString(s) 
						+"\r\n"
						+"\r\n"
						+"Artistas Cadastrados:"
						+"\r\n"
						+"\r\n"
						+ " " + Arrays.toString(a)
						);
				musicListPanel.add(BorderLayout.CENTER, musicasList);
					
						
				// CONFIGURACOES NOME MUSICA E NOME ARTISTA
				
				musicPanel1.add(searchField);
				searchField.setBounds(270,10,400,30);
				searchField.setBorder(null);
				
				// SEARCH
				JButton cadMusica = new JButton("Cadastrar Música");
				musicPanel1.add(cadMusica);
				cadMusica.setBounds(820,10,150,30);
				cadMusica.addActionListener(cadMusic);
				
				JButton searchButton = new JButton("Buscar");
				musicPanel1.add(searchButton);
				searchButton.setBounds(700,10,90,30);
				searchButton.addActionListener(buscar);
				
				JButton editProfile = new JButton("Editar Perfil");
				musicPanel1.add(editProfile);
				editProfile.setBounds(10,10,130,30);
				editProfile.addActionListener(editProf);
				
				JLabel musicName = new JLabel("Principais Músicas");
				musicPanel1.add(musicName);
				musicName.setFont(new Font("Serif", Font.PLAIN, 20));
				JLabel musicArtist = new JLabel();
				musicArtist.setFont(new Font("Serif", Font.PLAIN, 14));
				musicName.setForeground(Color.WHITE);
				musicArtist.setForeground(Color.WHITE);

				container.add(musicPanel1);
				container.add(musicPanel3);			
				mainFrame.add(container);
				mainFrame.setSize(1000,700);
				mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				mainFrame.setVisible(true);
				mainFrame.setLocationRelativeTo(null);
	}

	
	/**
	 * Determina a visibilidade da tela. Caso seja definida como false, a tela e descartada.
	 * @param a 
	 * Recebe um boolean que determina a visibilidade da tela.
	 */
	public static void isVisible(boolean a) {
		if(a == false) {
			mainFrame.dispose();
		}
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getSeacrhText() {
		return searchField.getText();
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getMusic() {
		return musicCardName.getText();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
