package view;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import modelo.Artista;

/**
 * Nesta classe e programada a Tela na qual se efetua o Cadastro de uma Musica
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class MusicCadScreen implements ActionListener{
	
	private static Artista[] artistas = new Artista[10];
	
	private static JTextField artistField = new JTextField();
	private static JTextArea letraField = new JTextArea();
	private static JTextField nameField = new JTextField();
	private static JFrame artistFrame = new JFrame("Cadastrar Música");

	

	/**
	 * Construtor da Classe MusicCadScreen, onde sera cadastrada uma Musica.
	 * @param confirmar
	 * O construtor pede um ActionListener "confirmar" para definir o que acontece quando o JButton confirm e pressionado.
	 */
	public MusicCadScreen(ActionListener confirmar) {
		artistFrame.setTitle("Cadastrar Música");
		artistFrame.setLayout(null);
		
		JPanel artistPanel = new JPanel();
		artistPanel.setLayout(null);
		artistPanel.setBackground(new Color(25, 20, 20));
		artistPanel.setBounds(0,0, 1000,60);
		
		JLabel panelText = new JLabel("Digite as informações da música na qual deseja cadastrar");
		artistPanel.add(panelText);
		panelText.setBounds(350,10,600,30);
		panelText.setForeground(Color.WHITE);
		
		JPanel artistPanel2 = new JPanel(new GridLayout(4,10));
		artistPanel2.setBounds(0,60,1000,600);
		artistPanel2.setBackground(Color.BLACK);
  
		
		
		JLabel artistName = new JLabel();
		artistPanel.add(artistName);
		artistName.setBounds(450,30,100,10);
		artistName.setForeground(Color.WHITE);
		
		// EDITAR CARACTERISTICAS
		JLabel artistEmail = new JLabel("Nome da Música:");
		artistPanel2.add(artistEmail);
		artistEmail.setForeground(Color.WHITE);
		artistEmail.setBounds(20,30,200,10);
		
		
		artistPanel2.add(nameField);
		nameField.setBounds(20,50,300,20);
		
		
		JLabel artistSenha = new JLabel("Artista:");
		artistPanel2.add(artistSenha);
		artistSenha.setForeground(Color.WHITE);
		artistSenha.setBounds(20,90,200,10);
		
		
		artistPanel2.add(artistField);
		artistField.setBounds(20,110,300,20);
		
		
		JLabel artistNameE = new JLabel("Letra:");
		artistPanel2.add(artistNameE);
		artistNameE.setBounds(20,150,200,20);
		artistNameE.setForeground(Color.WHITE);
		
		
		artistPanel2.add(letraField);
		letraField.setBounds(20,180,300,300);
		
		JScrollPane scroll = new JScrollPane(letraField);
		artistPanel2.add(scroll);
		
		
		JButton confirm = new JButton("Confirmar alterações");;
		artistPanel2.add(confirm);
		confirm.addActionListener(confirmar);
		
		
		
		artistFrame.add(artistPanel2);
		artistFrame.add(artistPanel);
		artistFrame.setSize(1000,700);
		artistFrame.setVisible(true);
		artistFrame.setLocationRelativeTo(null);
		artistFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getNomeMusica() {
		return nameField.getText();
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getLetraMusica() {
		return letraField.getText();
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getArtistMusica() {
		return artistField.getText();
	}
	
	/**
	 * Determina a visibilidade da tela. Caso for false, descarta a tela.
	 * @param a
	 * Recebe um booleano true ou false.
	 */
	public static void isVisible(boolean a) {
		if(a == false) {
			artistFrame.dispose();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
