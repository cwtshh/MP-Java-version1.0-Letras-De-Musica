package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import modelo.Artista;
import modelo.Musica;

/**
 * Nesta classe é programada a Tela na qual e exibida as informacoes de uma Musica.
 * IMPORTANTE! existem 2 tipos de MusicScreen, a variantes MusicScreenArtist possui um botão para que um Usuario do tipo Artista possa editar a Musica Exibida.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class MusicScreenArtist implements ActionListener{
	
	static private JFrame musicFrame = new JFrame();
	
	/**
	 * Construtor da classe MusicScreenArtista, onde sera exibido as informacoes de uma Musica cadastrada.
	 * Daqui e possivel editar e deletar uma música.
	 * O construtor pede uma Musica m para exibir suas informacoes e um ActionListener "edit" para definir o que acontece quando o JButton edit e pressionado.
	 * @param m
	 * Recebe uma Musica para exibir seus atributos.
	 * @param edit
	 * Recebe um ActionListener que tem como a função abrir a tela de Edicao.
	 */
	public MusicScreenArtist(Musica m, ActionListener edit) {
		musicFrame.setTitle(m.getNomeMusica() + " - " + m.getNomeArtista());
		// NOME MUSICA
		JPanel musicPanel1 = new JPanel();
		musicPanel1.setLayout(null);
		musicPanel1.setBounds(0,0, 1000,60);
		musicPanel1.setBackground(new Color(25, 20, 20));
		
		Container container = new Container();
		
		// NOME ARTISTA
		JPanel musicPanel2 = new JPanel();
		musicPanel2.setBounds(0,30,1000,30);
		musicPanel2.setBackground(new Color(25, 20, 20));
		
		// LETRA MUSICA
		JPanel musicPanel3 = new JPanel();
		musicPanel3.setLayout(new BorderLayout());
		musicPanel3.setBounds(0,60,1000,600);
		musicPanel3.setBackground(Color.BLACK);
		
		// CONFIGURACOES NOME MUSICA E NOME ARTISTA
		JLabel musicName = new JLabel(m.getNomeMusica());
		musicPanel1.add(musicName);
		musicName.setBounds(435,10,70,30);
		
		
		// EDIT BUTTOn
		JButton editButton = new JButton("Editar");
		musicPanel1.add(editButton);
		editButton.setBounds(870,10,100,30);
		editButton.addActionListener(edit);
		
		
		musicName.setFont(new Font("Serif", Font.PLAIN, 20));
		JLabel musicArtist = new JLabel(m.getNomeArtista());
		musicPanel1.add(musicArtist);
		musicArtist.setBounds(430,35,100,30);
		musicArtist.setFont(new Font("Serif", Font.PLAIN, 14));
		musicName.setForeground(Color.WHITE);
		musicArtist.setForeground(Color.WHITE);
		
		// LETRA DA MUSICA
		JTextArea musicLyric = new JTextArea(m.getLetraMusica());
		JScrollPane scroll = new JScrollPane(musicLyric);
		
		// CONFIGURAÇOES LETRA MUSICA
		musicLyric.setBackground(Color.BLACK);
		musicLyric.setForeground(Color.WHITE);
		scroll.setBounds(10, 11, 455, 249);
		
		musicLyric.setFont(new Font("Serif", Font.PLAIN, 15));
		musicLyric.setEditable(false);
		
		musicPanel3.add(scroll);
		
		
		container.add(musicPanel1);
		container.add(musicPanel3);
	
		musicFrame.add(container);
		musicFrame.setSize(1000,700);	
		musicFrame.setVisible(true);
		musicFrame.setLocationRelativeTo(null);
		
	}
	
	/**
	 * Descarta a tela, caso seu uso nao seja mais necessario
	 * @param a boolean
	 * Recebe um boolean que determina a visibilidade da tela.
	 */
	public static void isVisible(boolean a) {
		if(a == false) {
			musicFrame.dispose();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
