package view;
import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.regex.Pattern;
/**
 * Nesta classe é programada a Tela na qual e efetuado o cadastro de um Usuario, tanto do tipo Artista quanto do tipo Ouvinte.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */

public class RegisterForm implements ActionListener{
    private static JFrame regframe = new JFrame("Registrar-se");

    private static JLabel emailRegLabel = new JLabel("Digite seu email:");
    private static JTextField emailRegField = new JTextField();

    private static JLabel senhaRegLabel = new JLabel("Digite sua senha");
    
    private static JPasswordField senhaRegField = new JPasswordField();

    private static JLabel nameLabel = new JLabel("Qual seu nome? (Artistico caso for artista)");
    private static JTextField nameField = new JTextField();

    private static JButton regButton = new JButton("Registrar");
    private static JButton backButton = new JButton("Voltar ao Login");

    private static JPanel painel = new JPanel(new GridLayout(5,1));


    private static JRadioButton typeOfUser = new JRadioButton("Artista");
    private static JRadioButton typeOfUser2 = new JRadioButton("Ouvinte");

    private ButtonGroup radioGroup = new ButtonGroup();

    /**
     * Construtor da Classe RegisterForm, onde serão cadastrados (instânciados), Artistas ou Ouvintes.
     * O construtor pede um ActionListener "regAction" que define a função do JButton regButton, e o ActionListener "backAction" que determina o que acotecerá quando o JButton backButton for pressionado.
     * @param regAction
     * @param backAction
     */
    public RegisterForm(ActionListener regAction, ActionListener backAction) {
    	Image icon = Toolkit.getDefaultToolkit().getImage("icon.png");
        painel.setSize(450, 350);
        regframe.add(painel);

        // ADICIONANDO ELEMENTOS AO PAINEL
        painel.add(emailRegLabel);
        painel.add(emailRegField);

        painel.add(senhaRegLabel);
        painel.add(senhaRegField);

        painel.add(nameLabel);
        painel.add(nameField);

        radioGroup.add(typeOfUser);
        radioGroup.add(typeOfUser2);

        painel.add(typeOfUser);
        painel.add(typeOfUser2);

        painel.add(regButton);
        painel.add(backButton);
        
        // COLORINDO O PAINEL
        painel.setBackground(new Color(25,20,20));
        regframe.setBackground(new Color(25,20,20));
        regButton.setBackground(new Color(228, 217, 111));
        backButton.setBackground(new Color(228, 217, 111));
        emailRegLabel.setForeground(Color.white);
        senhaRegLabel.setForeground(Color.white);
        nameLabel.setForeground(Color.white);

        regButton.addActionListener(regAction);
        backButton.addActionListener(backAction);
        
        // ADICIONANDO E CONFIGURANDO O FRAME
        regframe.setSize(500,400);
        regframe.setVisible(true);
        regframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        regframe.setLocationRelativeTo(null);
        regframe.setIconImage(icon);
    }
    
    // VERIFICAR SE O EMAIIL É VALIDO
    public static boolean isValid(String email) {
    	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$";
    	
    	Pattern pat = Pattern.compile(emailRegex);
    	
    	if (email == null) {
    		return false;
    	}return pat.matcher(email).matches();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    /**
	 * Coleta os dados Digitados pelo Usuario
	 * @return
	 */
    public static String getRegEmail() {
    	return emailRegField.getText();
    }
    
    /**
	 * Coleta os dados Digitados pelo Usuario
	 * @return
	 */
    public static char[] getRegSenha() {
    	return senhaRegField.getPassword();
    }
    
    /**
	 * Coleta os dados Digitados pelo Usuario
	 * @return
	 */
    public static String getRegName() {
    	return nameField.getText();
    }
    
    /**
	 * Recebe um int que indica o tipo de usuario a ser logado.
	 * O valor é fornecido pelo JRadioButton
	 * @return
	 */
    public static int getTypeOfUser() {
    	if (typeOfUser.isSelected()) {
    		return 1;
    	} else {
    		return 2;
    	}
    }
    
    /**
	 * Descarta a tela, caso seu uso não seja mais necessário
	 * @param a
	 */
    public static void isVisible(Boolean a) {
    	if (a == false) {
    		regframe.dispose();
    	}
    }
    
}
