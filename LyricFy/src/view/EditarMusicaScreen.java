package view;

import modelo.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Nesta classe e programada a Tela na qual e possivel efetuar edicoes em objetos da Classe Musica.
 * IMPORTANTE! existem 2 tipos de MusicScreen, a variantes MusicScreenArtist possui um botao para que um Usuario do tipo Artista possa editar a Musica Exibida.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */

public class EditarMusicaScreen implements ActionListener{
	
	private static JTextField nameField = new JTextField();
	private static JTextField artistField = new JTextField();
	private static JTextArea lyricField = new JTextArea();
	private static JFrame artistFrame = new JFrame();
	
	/**
	 * Construtor da Classe EditarMusicaScreen, onde serao feitas alteracoes em Musicas já cadastradas.
	 * O construtor pede uma Musica, um ActionListener "confirmar" que define a função do JButton confirm, e outro ActionListener "deletar" que define a funcao do JButton delete.
	 * @param m
	 * Recebe uma musica
	 * @param confirmar
	 * Recebe um ActionListener
	 * @param deletar
	 * Recebe outro ActionListener
	 */
	public EditarMusicaScreen(Musica m, ActionListener confirmar, ActionListener deletar) {
		artistFrame.setTitle(m.getNomeArtista() + " - Editar");
		artistFrame.setLayout(null);
		
		JPanel artistPanel = new JPanel();
		artistPanel.setLayout(null);
		artistPanel.setBackground(new Color(25, 20, 20));
		artistPanel.setBounds(0,0, 1000,60);
		
		JPanel artistPanel2 = new JPanel(new GridLayout(4,10));
		artistPanel2.setBounds(0,60,1000,600);
		artistPanel2.setBackground(Color.BLACK);
  
		
		
		JLabel artistName = new JLabel(m.getNomeMusica());
		artistPanel.add(artistName);
		artistName.setBounds(450,30,100,10);
		artistName.setForeground(Color.WHITE);
		
		// EDITAR CARACTERISTICAS
		JLabel artistEmail = new JLabel("Nome da Música:");
		artistPanel2.add(artistEmail);
		artistEmail.setForeground(Color.WHITE);
		artistEmail.setBounds(20,30,200,10);
		
		nameField.setText(m.getNomeMusica());
		artistPanel2.add(nameField);
		nameField.setBounds(20,50,300,20);
		
		
		JLabel artistSenha = new JLabel("Artista:");
		artistPanel2.add(artistSenha);
		artistSenha.setForeground(Color.WHITE);
		artistSenha.setBounds(20,90,200,10);
		
		artistField.setText(m.getNomeArtista());
		artistPanel2.add(artistField);
		artistField.setBounds(20,110,300,20);
		
		
		JLabel artistNameE = new JLabel("Letra:");
		artistPanel2.add(artistNameE);
		artistNameE.setBounds(20,150,200,20);
		artistNameE.setForeground(Color.WHITE);
		
		lyricField.setText(m.getLetraMusica());
		artistPanel2.add(lyricField);
		lyricField.setBounds(20,180,300,300);
		
		JScrollPane scroll = new JScrollPane(lyricField);
		artistPanel2.add(scroll);		
		
		JButton confirm = new JButton("Confirmar alterações");;
		artistPanel2.add(confirm);
		confirm.addActionListener(confirmar);

		
		JButton delete = new JButton("Deletar Música");
		artistPanel2.add(delete);
		delete.addActionListener(deletar);
	
		

		
		
		
		
		artistFrame.add(artistPanel2);
		artistFrame.add(artistPanel);
		artistFrame.setSize(1000,700);
		artistFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		artistFrame.setVisible(true);
		artistFrame.setLocationRelativeTo(null);
	}
	
	public static String getArtistName() {
		return nameField.getText();
	}
	public static String getNomeMusica() {
		return nameField.getText();
	}
	public static String getLetraMusica() {
		return lyricField.getText();
	}
	
	/**
	 * Determina a visibilidade da tela, caso false, a tela e descartada.
	 * @param a
	 * Recebe um boolean que determina a visibilidade da tela.
	 */
	public static void isVisible(boolean a) {
		if (a == false) {
			artistFrame.dispose();
		}
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
