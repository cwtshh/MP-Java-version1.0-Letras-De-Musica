package view;

import modelo.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Nesta classe é programada a Tela na qual se efetua a edicao ou a exclusao de um Artsita
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class PerfilOuvinte implements ActionListener{
	static private JTextField editEmailField = new JTextField();
	static private JTextField editSenha = new JTextField();
	static private JTextArea editName = new JTextArea();
	static private JFrame artistFrame = new JFrame();
	
	
	/**
	 * Construtor da Classe PerfilOuvinte, onde serao feitas atualizacoes em um Ouvinte já instanciado.
	 * Daqui também e possível deletar o Ouvinte
	 * O construtor pede um ouvinte, um ActionListener "confirmar" que determina a acao a ser executada quando o JButton confirm e pressionado.
	 * Outro ActionListener "deletar" para quando o JButton delete e pressionado.
	 * @param o
	 * Recebe umm Ouvinte para exibir suas informacoes.
	 * @param confirmar
	 * Recebe um ActionListener que confirma a edicao e atualiza os dados do Ouvinte.
	 * @param deletar
	 * Recebe um ActionListener que confirma a exclusao do Ouvinte
	 */
	public PerfilOuvinte(Ouvinte o, ActionListener confirmar, ActionListener deletar) {
		artistFrame.setTitle(o.getNomeOuvinte() + " - Editar");
		artistFrame.setLayout(null);
		
		JPanel artistPanel = new JPanel();
		artistPanel.setLayout(null);
		artistPanel.setBackground(new Color(25, 20, 20));
		artistPanel.setBounds(0,0, 1000,60);
		
		JPanel artistPanel2 = new JPanel();
		artistPanel2.setLayout(null);
		artistPanel2.setBounds(0,60,1000,600);
		artistPanel2.setBackground(Color.BLACK);
		
		
		JLabel artistName = new JLabel(o.getNomeOuvinte());
		artistPanel.add(artistName);
		artistName.setBounds(450,30,100,10);
		artistName.setForeground(Color.WHITE);
		
		// EDITAR CARACTERISTICAS
		JLabel artistEmail = new JLabel("Email:");
		artistPanel2.add(artistEmail);
		artistEmail.setForeground(Color.WHITE);
		artistEmail.setBounds(20,30,200,10);
		
		editEmailField.setText(o.getEmail());
		artistPanel2.add(editEmailField);
		editEmailField.setBounds(20,50,300,20);
		
		
		JLabel artistSenha = new JLabel("Senha:");
		artistPanel2.add(artistSenha);
		artistSenha.setForeground(Color.WHITE);
		artistSenha.setBounds(20,90,200,10);
		
		editSenha.setText(o.getSenha());;
		artistPanel2.add(editSenha);
		editSenha.setBounds(20,110,300,20);
		
		
		JLabel artistNameE = new JLabel("Nome:");
		artistPanel2.add(artistNameE);
		artistNameE.setBounds(20,150,200,20);
		artistNameE.setForeground(Color.WHITE);
		
		editName.setText(o.getNomeOuvinte());
		artistPanel2.add(editName);
		editName.setBounds(20,180,300,20);
		
		
		JButton confirm = new JButton("Confirmar alterações");;
		artistPanel2.add(confirm);
		confirm.setBounds(20,300,300,30);
		confirm.addActionListener(confirmar);
		
		JButton delete = new JButton("Deletar Usuário");
		artistPanel2.add(delete);
		delete.addActionListener(deletar);
		delete.setBounds(20,340,300,30);
			
		
		
		artistFrame.add(artistPanel2);
		artistFrame.add(artistPanel);
		artistFrame.setSize(1000,700);
		artistFrame.setVisible(true);
		artistFrame.setLocationRelativeTo(null);
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getEmail() {
		return editEmailField.getText();
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getSenha() {
		return editSenha.getText();
	}
	
	/**
	 * Coleta os dados Digitados pelo Usuario
	 * @return String
	 */
	public static String getName() {
		return editName.getText();
	}
	
	/**
	 * Descarta a tela, caso seu uso nao seja mais necessario
	 * @param a 
	 * Recebe um boolean determinando sua visibilidade
	 */
	public static void isVisible(boolean a) {
		if (a == true) {
			artistFrame.setVisible(true);
		}else {
			artistFrame.dispose();
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
