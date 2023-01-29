package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import modelo.Artista;

import java.awt.event.*;

/**
 * Nesta classe e programada a Tela principal do programa.
 * IMPORTANTE! existem 2 tipos de MainScreen, a variantes MusicScreenArtist possui um botao para que um Usuario do tipo Artista possa Cadastrar uma musica.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class LoginForm implements ActionListener{
	
	private static JFrame frame = new JFrame("Login");

	private static JLabel emailLabel = new JLabel("Email:");
	private static JTextField emailField = new JTextField();

    private static JLabel senhaLabel = new JLabel("Senha:");
	private static JPasswordField senhaField = new JPasswordField();

    private static JButton logarButton = new JButton("Logar");
    private static JButton regButton = new JButton("Registrar-se");
    
    private static JPanel painel = new JPanel(new GridLayout(4,1));
    
    private static JRadioButton typeOfUser = new JRadioButton("Artista");
    private static JRadioButton typeOfUser2 = new JRadioButton("Ouvinte");
    
    /**
     * Construtor da classe LoginForm, onde o Usuario digita suas informacoes de login para entrar no programa.
     * O construtor pede um ActionListener "loginAction" que define a funcao do JButton logarButton, e outro ActionListener "regAction" que define a funcao do JButton regButton.
     * @param loginAction
     * Recebe um ActionListener que ira logar o Usuario.
     * @param regAction
     * Recebe um ActionListener que ira abrir a tela de registro
     */

	public LoginForm(ActionListener loginAction, ActionListener regAction) {
		
		Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
		painel.setSize(200, 400);
		frame.add(painel);
		
		// ADICIONANDO AO PAINEL
		painel.add(emailLabel);
		painel.add(emailField);
		painel.add(senhaLabel);
		painel.add(senhaField);
		painel.add(typeOfUser);
        painel.add(typeOfUser2);
		painel.add(logarButton);
		painel.add(regButton);
		
		painel.setBackground(new Color(25, 20, 20));
		
		typeOfUser.setBackground(new Color(25, 20, 20));
		typeOfUser.setForeground(Color.white);
		typeOfUser2.setBackground(new Color(25, 20, 20));
		typeOfUser2.setForeground(Color.WHITE);
		
		
		logarButton.setBackground(new Color(228, 217, 111));
		regButton.setBackground(new Color(228, 217, 111));
		
		emailLabel.setForeground(Color.white);
		senhaLabel.setForeground(Color.white);
		

		logarButton.addActionListener(loginAction);
		regButton.addActionListener(regAction);
		
		
		frame.setSize(500,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setIconImage(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Recebe um int que indica o tipo de usuario a ser logado.
	 * O valor é fornecido pelo JRadioButton
	 * @return int
	 * Retorna o id, que representa o tipo de usuario.
	 */
	public static int getTypeOfUser() {
    	if (typeOfUser.isSelected()) {
    		return 1;
    	} else {
    		return 0;
    	}
    }
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getEmail() {
		return emailField.getText();
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static char[] getSenha() {
		return senhaField.getPassword();
	}
	
	/**
	 * Descarta a tela, caso seu uso nao seja mais necessario
	 * @param a
	 * Recebe um boolean que determina a visibilidade da tela
	 */
	public static void isVisible(boolean a) {
		if(a == false) {
			frame.dispose();
		}
	}

		
	}
