package view;
/**
 * Nesta classe é programada a Tela na qual se efetua a edição ou a exclusão de um Artsita
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */


import java.awt.Color;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import modelo.Artista;

public class PerfilArtista implements ActionListener{
	
	static private JTextField editEmailField = new JTextField();
	static private JTextField editSenha = new JTextField();
	static private JTextArea editName = new JTextArea();
	static private JFrame artistFrame = new JFrame();
	
	/**
	 * Construtor da classe PerfilArtista, onde serao feitas atualizacoes em um Artista instanciado.
	 * Daqui também e possível deletar um Artista.
	 * O construtor pede um Artista "a", para exibir sua informacoes, um AcitonListener "confirmar" para definir o que acontece quando o JButton confirm for pressionado,
	 * um ActionListener "deletar" para quando o JButton confirm for pressionado.
	 * @param a
	 * Recebe um Artista para exibir suas informacoes.
	 * @param confirmar
	 * Recebe um ActionListener que confirma a edicao e atualiza os dados do Artista.
	 * @param deletar
	 * Recebe um ActionListener que confirma a exclusao do Aritsta.
	 */
	public PerfilArtista(Artista a, ActionListener confirmar, ActionListener deletar) {
		
		artistFrame.setTitle(a.getNomeArtista() + " - Editar");
		artistFrame.setLayout(null);
		
		JPanel artistPanel = new JPanel();
		artistPanel.setLayout(null);
		artistPanel.setBackground(new Color(25, 20, 20));
		artistPanel.setBounds(0,0, 1000,60);
		
		JPanel artistPanel2 = new JPanel();
		artistPanel2.setLayout(null);
		artistPanel2.setBounds(0,60,1000,600);
		artistPanel2.setBackground(Color.BLACK);
		
		
		JLabel artistName = new JLabel(a.getNomeArtista());
		artistPanel.add(artistName);
		artistName.setBounds(450,30,100,10);
		artistName.setForeground(Color.WHITE);
		
		// EDITAR CARACTERISTICAS
		JLabel artistEmail = new JLabel("Email:");
		artistPanel2.add(artistEmail);
		artistEmail.setForeground(Color.WHITE);
		artistEmail.setBounds(20,30,200,10);
		
		editEmailField.setText(a.getEmail());
		artistPanel2.add(editEmailField);
		editEmailField.setBounds(20,50,300,20);
		
		
		JLabel artistSenha = new JLabel("Senha:");
		artistPanel2.add(artistSenha);
		artistSenha.setForeground(Color.WHITE);
		artistSenha.setBounds(20,90,200,10);
		
		editSenha.setText(a.getSenha());;
		artistPanel2.add(editSenha);
		editSenha.setBounds(20,110,300,20);
		
		
		JLabel artistNameE = new JLabel("Nome:");
		artistPanel2.add(artistNameE);
		artistNameE.setBounds(20,150,200,20);
		artistNameE.setForeground(Color.WHITE);
		
		editName.setText(a.getNomeArtista());
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
	 * Descarta a tela, caso seu uso nao seja mais necessário
	 * @param a 
	 * Recebe um boolean que determina a visibilidade da tela.
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
