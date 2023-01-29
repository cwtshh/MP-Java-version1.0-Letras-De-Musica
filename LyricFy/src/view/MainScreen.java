package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;

import controle.ControleDeDados;
import modelo.Album;
import modelo.Artista;
import modelo.Musica;


/**
 * Nesta classe e programada a Tela a tela principal do programa.
 * IMPORTANTE! existem 2 tipos de MainScreen, a variantes MusicScreenArtist possui um botao para que um Usuario do tipo Artista possa cadastrar um objeto do tipo Musica.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class MainScreen implements ActionListener{
	
	static JTextField searchField = new JTextField();
	static JFrame mainFrame = new JFrame("LyricFy");
	static JPanel musicCards = new JPanel();
	static JLabel musicCardName;
	
	private static String[] s = new String[5];
	private static String[] a = new String[5];
	private static String[] al = new String[5];
			
	/**
	 * Construtor da classe MainScreen, onde são mostradas as listagens de Arista, Musica e Album.
	 * Daqui e possível pesquisar Musica, editar Perfil. Relacionados ao Ouvinte.
	 * O construtor pede um ActionListener "search" que define o que acontece quando o JButton search e clicado.
	 * ActionListener edit, que define o que acontecerá quando o JButton edit for clicado.
	 * Um array de Musica, Artista e Album para que sejam exibidas a listagem.
	 * Controle de Dados, para obter os dados.
	 * @param search
	 * Recebe um ActionListener que faz a funcao de Busca.
	 * @param edit
	 * Recebe um ActionListenerr que faz a funcao de edicao de perfil.
	 * @param musicas1
	 * recebe um Array de musicas que serao exibidas na listagem.
	 * @param artistas
	 * Recebe um Array de Artistas que serao exibidos na listagem.
	 * @param dados
	 * Recebe os Dados da classe CcontroleDeDados
	 * @param albuns
	 * Recebe um Array de Albuns que serão exibidos na listagem.
	 */
	public MainScreen(ActionListener search, ActionListener edit, Musica[] musicas1, Artista[] artistas, ControleDeDados dados, Album[] albuns) {

		
		
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
		
		
		
		/**
		 * Forma a String que indica as Músicas Cadastradas
		 */
		for(int i = 0; i < 5; i++) {
			s[i] = musicas1[i].getNomeMusica() + "\r\n" + "\r\n";
			System.out.println(s);
		}
		
		/**
		 * Forma a String que indica os Artistas Cadastrados e suas respectivas músicas
		 */
		for(int i = 0; i < dados.getQtdArtistas(); i++) {
			a[i] = artistas[i].getNomeArtista() + " Que tem a(s) Música(s) " + musicas1[i].getNomeMusica() + "\r\n" + "\r\n";
		}
		
		/**
		 * Forma a String que indica os Albuns Cadastrados e suas respectivas músicas
		 */
		for(int i = 0; i < 1; i++) {
			al[i] = "O Album: " + albuns[i].getNomeAlbum() + " Que tem as Músicas: " + musicas1[i].getNomeMusica() + "\r\n" + "\r\n";
		}
		
		
		JTextArea musicasList = new JTextArea();
		musicasList.setBackground(Color.BLACK);
		musicasList.setForeground(Color.WHITE);
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
				+"\r\n"
				+"\r\n"
				+"Albuns Cadastrados: "
				+ " " + Arrays.toString(al)
				);
		musicListPanel.add(BorderLayout.CENTER, musicasList);
			
		// SEACRH
		musicPanel1.add(searchField);
		searchField.setBounds(270,10,400,30);
		searchField.setBorder(null);
		JButton editProfile = new JButton("Editar Perfil");
		editProfile.addActionListener(edit);
		musicPanel1.add(editProfile);
		editProfile.setBounds(10,10,130,30);
		
		JButton searchButton = new JButton("Buscar");
		musicPanel1.add(searchButton);
		searchButton.setBounds(700,10,90,30);
		searchButton.addActionListener(search);
			
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
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);
				
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
