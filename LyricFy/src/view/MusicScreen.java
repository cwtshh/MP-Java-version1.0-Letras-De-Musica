package view;

import javax.swing.*;

import modelo.Artista;
import modelo.Musica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

/**
 * Nesta classe e programada a Tela que exibe as informacoes de uma Musica.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */
public class MusicScreen {
	
	
	/**
	 * Construtor da Classe MusicScreen, onde sao exibidas as informacoes das Musicas cadastradas.
	 * O construtor pede uma Musica m, para exibir as informacoes na tela.
	 * @param m
	 * Recebe uma Musica para exibir suas informacoes.
	 */
	public MusicScreen(Musica m) {
		JFrame musicFrame = new JFrame(m.getNomeMusica() + " - " + m.getNomeArtista());
		
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
		musicName.setBounds(435,10,100,30);
		
		/* BACK BUTTON
		JButton backButton = new JButton("< Voltar");
		musicPanel1.add(backButton);
		backButton.setBounds(10,10,100,30);*/
		
		
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
		
	}
}
