package modelo;
/**
 * Classe que tem como funçao instanciar e adicionar Objetos ao Banco de Dados.
 * @author Gustavo Costa de Jesus
 * @since 2022
 * @version 1.0
 */

public class Dados {
	private static Ouvinte[] ouvintes = new Ouvinte[10];
	private int qtdOuvintes = 0;
	
	private static Artista[] artistas = new Artista[10];
	private static int qtdArtistas = 0;
	
	private static Musica[] musicas = new Musica[10];
	private static int qtdMusicas = 0;
	
	private static Album[] albuns = new Album[2];
	
	/**
	 * Adiociona Artistas, Ouvintes, Musicas e Albuns Ao Banco de Dados.
	 */
	public void addData() {
		Musica[] skrillexSongList = new Musica[3];
		skrillexSongList[0] = musicas[0];
		
	Musica[] imagineSongList = new Musica[3];
		imagineSongList[0] = musicas[1];
		
	Musica[] paramoreSongList = new Musica[3];
		paramoreSongList[0] = musicas[2];
	
	Musica[] chainSongList = new Musica[3];
		chainSongList[0] = musicas[3];
		
	Musica[] foreingerSongList = new Musica[3];
		foreingerSongList[0] = musicas[4];
		
		artistas[0] = new Artista("skrillex@gmail.com", "123", "skrillex", skrillexSongList);
		artistas[1] = new Artista("imagine@gmail.com", "1234", "Imagine Dragons", imagineSongList);
		artistas[2] = new Artista("paramore@gmail.com", "12345", "Paramore", paramoreSongList);
		artistas[3] = new Artista("chain@gmail.com", "123456", "The ChainSmokers", chainSongList);
		artistas[4] = new Artista("foreinger@gmail.com", "1234567", "Foreinger", foreingerSongList);
		
		musicas[0] = new Musica("To Ü", "Believe me, I could live without you\r\n"
				+ "But I really don't want to\r\n"
				+ "Believe me, I could love without you\r\n"
				+ "But I really don't need to\r\n"
				+ "Cause leavin' is the hardest thing to do\r\n"
				+ "But being left is hard, oh yes, it's true\r\n"
				+ "But try coming back\r\n"
				+ "How do I get back to you, to you, to you?\r\n"
				+ "How can I get back to you?\r\n"
				+ "Let me get back to you\r\n"
				+ "Cause leavin' is the hardest thing to do\r\n"
				+ "But being left is hard, oh yes, it's true\r\n"
				+ "But try coming back\r\n"
				+ "How do I get back to you, to you, to you?\r\n"
				+ "How do I get back to you?\r\n"
				+ "Cause leavin' is the hardest thing to do\r\n"
				+ "But being left is hard, oh yes, it's true\r\n"
				+ "But try coming back\r\n"
				+ "How do I get back to you, to you, to you?\r\n"
				+ "How can I get back to you?\r\n"
				+ "Let me get back to you\r\n"
				+ "Let me get back to you\r\n"
				+ "But I don't wanna face it\r\n"
				+ "All this time that I wasted\r\n"
				+ "It's so close, I can taste it\r\n"
				+ "How can I get back to you?\r\n"
				+ "How can I get back to you?\r\n"
				+ "How can I get back to you?\r\n"
				+ "How can I get back to you?\r\n"
				+ "How can I get back to you?\r\n"
				+ "Cause leavin' is the hardest thing to do\r\n"
				+ "But being left is hard, oh yes, it's true\r\n"
				+ "(Yes, it's true)", artistas[0]);
		
		musicas[1] = new Musica("Bad Liar", "Oh, hush, my dear, it's been a difficult year\r\n"
				+ "And terrors don't prey on\r\n"
				+ "Innocent victims\r\n"
				+ "Trust me, darling, trust me darling\r\n"
				+ "It's been a loveless year\r\n"
				+ "I'm a man of three fears\r\n"
				+ "Integrity, faith and\r\n"
				+ "Crocodile tears\r\n"
				+ "Trust me, darling, trust me, darling\r\n"
				+ "So look me in the eyes\r\n"
				+ "Tell me what you see\r\n"
				+ "Perfect paradise\r\n"
				+ "Tearing at the seams\r\n"
				+ "I wish I could escape\r\n"
				+ "I don't wanna fake it\r\n"
				+ "Wish I could erase it\r\n"
				+ "Make your heart believe\r\n"
				+ "But I'm a bad liar, bad liar\r\n"
				+ "Now you know\r\n"
				+ "Now you know\r\n"
				+ "I'm a bad liar, bad liar\r\n"
				+ "Now you know, you're free to go (go)\r\n"
				+ "Did all my dreams never mean one thing?\r\n"
				+ "Does happiness lie in a diamond ring?\r\n"
				+ "Oh, I've been askin'\r\n"
				+ "Oh, I've been askin' for problems, problems, problems\r\n"
				+ "I wage my war, on the world inside\r\n"
				+ "I take my gun to the enemy's side\r\n"
				+ "Oh, I've been askin' for (trust me, darling)\r\n"
				+ "Oh, I've been askin' for (trust me, darling)\r\n"
				+ "Problems, problems, problems\r\n"
				+ "So look me in the eyes\r\n"
				+ "Tell me what you see\r\n"
				+ "Perfect paradise\r\n"
				+ "Tearing at the seams\r\n"
				+ "I wish I could escape\r\n"
				+ "I don't wanna fake it\r\n"
				+ "Wish I could erase it\r\n"
				+ "Make your heart believe\r\n"
				+ "But I'm a bad liar, bad liar\r\n"
				+ "Now you know\r\n"
				+ "Now you know\r\n"
				+ "That I'm a bad liar, bad liar\r\n"
				+ "Now you know, you're free to go\r\n"
				+ "I can't breathe, I can't be\r\n"
				+ "I can't be what you want me to be\r\n"
				+ "Believe me, this one time\r\n"
				+ "Believe me\r\n"
				+ "I'm a bad liar, bad liar\r\n"
				+ "Now you know\r\n"
				+ "Now you know\r\n"
				+ "That I'm a bad liar, bad liar\r\n"
				+ "Now you know, you're free to go\r\n"
				+ "Oh\r\n"
				+ "Please believe me\r\n"
				+ "Please believe me", artistas[1]);
		
		musicas[2] = new Musica("Misery Business", "I'm in the business of misery\r\n"
				+ "Let's take it from the top\r\n"
				+ "She's got a body like an hourglass, it's ticking like a clock\r\n"
				+ "It's a matter of time before we all run out\r\n"
				+ "When I thought he was mine, she caught him by the mouth\r\n"
				+ "I waited eight long months, she finally set him free\r\n"
				+ "I told him I couldn't lie, he was the only one for me\r\n"
				+ "Two weeks and we had caught on fire\r\n"
				+ "She's got it out for me, but I wear the biggest smile\r\n"
				+ "Whoa, I never meant to brag\r\n"
				+ "But I got him where I want him now\r\n"
				+ "Whoa, it was never my intention to brag\r\n"
				+ "To steal it all away from you now\r\n"
				+ "But God, does it feel so good\r\n"
				+ "'Cause I got him where I want him now\r\n"
				+ "And if you could, then you know you would\r\n"
				+ "'Cause God it just feels so\r\n"
				+ "It just feels so good\r\n"
				+ "Second chances they don't ever matter, people never change\r\n"
				+ "Once a whore, you're nothing more\r\n"
				+ "I'm sorry, that'll never change\r\n"
				+ "And about forgiveness, we're both supposed to have exchanged\r\n"
				+ "I'm sorry, honey, but I passed it up, now look this way\r\n"
				+ "Well, there's a million other girls who do it just like you\r\n"
				+ "Looking as innocent as possible to get to who\r\n"
				+ "They want and what they want, it's easy if you do it right\r\n"
				+ "Well I refuse, I refuse, I refuse\r\n"
				+ "Whoa, I never meant to brag\r\n"
				+ "But I got him where I want him now\r\n"
				+ "Whoa, it was never my intention to brag\r\n"
				+ "To steal it all away from you now\r\n"
				+ "But God, does it feel so good\r\n"
				+ "'Cause I got him where I want him right now\r\n"
				+ "And if you could, then you know you would\r\n"
				+ "'Cause God, it just feels so\r\n"
				+ "It just feels so good\r\n"
				+ "I watched his wildest dreams come true\r\n"
				+ "Not one of them involving you\r\n"
				+ "Just watch my wildest dreams come true\r\n"
				+ "Not one of them involving\r\n"
				+ "Whoa, I never meant to brag\r\n"
				+ "But I got him where I want him now\r\n"
				+ "Whoa, I never meant to brag\r\n"
				+ "But I got him where I want him now\r\n"
				+ "Whoa, it was never my intention to brag\r\n"
				+ "To steal it all away from you now\r\n"
				+ "But God, does it feel so good\r\n"
				+ "'Cause I got him where I want him now\r\n"
				+ "And if you could then you know you would\r\n"
				+ "'Cause God, it just feels so\r\n"
				+ "It just feels so good",artistas[2]);
		
		musicas[3] = new Musica("I Love You",
				 "In the Range outside and I'm thinkin' about loose ends\r\n"
				+ "Even though we cut ties, I don't wanna be just friends\r\n"
				+ "From the day I got your number, like Paris in the summer, it ends\r\n"
				+ "Every day goes by, I wish I was in your bed\r\n"
				+ "I love you, oh God\r\n"
				+ "(Ooh) It's hard to find a reason why we can't work this out\r\n"
				+ "(Ooh) I love you, oh my God\r\n"
				+ "(Ooh) It's hard to find a reason why we can't work this out\r\n"
				+ "yeah, yeah\r\n"
				+ "I love you, oh my God\r\n"
				+ "You were on the west side, I was drivin' down the I-10\r\n"
				+ "And the song came on, got me thinking who you chose instead\r\n"
				+ "No, I never thought twice, but I wonder what you see in them\r\n"
				+ "Another day goes by that I can't get you out of my head\r\n"
				+ "I love you, oh God\r\n"
				+ "(Ooh) It's hard to find a reason why we can't work this out\r\n"
				+ "(Ooh) I love you, oh my God\r\n"
				+ "(Ooh) It's hard to find a reason why we can't work this out\r\n"
				+ "yeah, yeah\r\n"
				+ "(I love you)\r\n"
				+ "When it ends, I'm convinced that you know it's not over\r\n"
				+ "All my love's gonna fade, unless you're coming over\r\n"
				+ "Do you think of my voice when your city gets colder?\r\n"
				+ "I love you, oh God\r\n"
				+ "(Ooh) It's hard to find a reason why we can't work this out\r\n"
				+ "(Ooh) I love you, oh my God\r\n"
				+ "(Ooh)\r\n"
				+ "I love you\r\n"
				+ "(It's hard)\r\n"
				+ "(Ooh)\r\n"
				+ "I love you\r\n"
				+ "(It's hard)\r\n"
				+ "It's hard to find a reason why we can't work this out", artistas[3]);
		
		musicas[4] = new Musica("I Wanna Know What Love Is", "I've gotta take a little time\r\n"
				+ "A little time to think things over\r\n"
				+ "I better read between the lines\r\n"
				+ "In case I need it when I'm older\r\n"
				+ "This mountain, I must climb\r\n"
				+ "Feels like a world upon my shoulders\r\n"
				+ "Through the clouds, I see love shine\r\n"
				+ "Keeps me warm as life grows colder\r\n"
				+ "In my life, there's been heartache and pain\r\n"
				+ "I don't know if I can face it again\r\n"
				+ "Can't stop now, I've traveled so far\r\n"
				+ "To change this lonely life\r\n"
				+ "I wanna know what love is\r\n"
				+ "I want you to show me\r\n"
				+ "I wanna feel what love is\r\n"
				+ "I know you can show me (hey)\r\n"
				+ "Gotta take a little time\r\n"
				+ "Little time to look around me\r\n"
				+ "I've got nowhere left to hide\r\n"
				+ "Looks like love has finally found me\r\n"
				+ "In my life, there's been heartache and pain\r\n"
				+ "I don't know if I can face it again\r\n"
				+ "Can't stop now, I've traveled so far\r\n"
				+ "To change this lonely life\r\n"
				+ "I wanna know what love is\r\n"
				+ "I want you to show me\r\n"
				+ "I wanna feel what love is\r\n"
				+ "I know you can show me\r\n"
				+ "I wanna know what love is (I wanna know)\r\n"
				+ "I want you to show me (I wanna feel)\r\n"
				+ "I wanna feel what love is (I know, I know, and I know)\r\n"
				+ "I know you can show me\r\n"
				+ "Let's talk about love\r\n"
				+ "I wanna know what love is\r\n"
				+ "(Love that you feel inside)\r\n"
				+ "I want you to show me\r\n"
				+ "(I'm feeling so much love)\r\n"
				+ "I wanna feel what love is\r\n"
				+ "(And you know, you just can't hide)\r\n"
				+ "I know you can show me\r\n"
				+ "Oh, I wanna know what love is\r\n"
				+ "(Let's talk about love)\r\n"
				+ "I know you can show me\r\n"
				+ "(I wanna feel)\r\n"
				+ "I wanna feel what love is\r\n"
				+ "(And you know you just can't hide)\r\n"
				+ "I know you can show me\r\n"
				+ "I wanna feel what love is (oh, I wanna know)\r\n"
				+ "I want you to show me", artistas[4]);
		
		
		
		
		
		ouvintes[0] = new Ouvinte("cleiton@gmail.com", "123", "Cleiton Fordes", null);
		ouvintes[1] = new Ouvinte("jorge@gmail.com", "1234", "Jorge Marilus", null);
		ouvintes[2] = new Ouvinte("penca@gmail.com", "12345", "Penca Loveres", null);
		ouvintes[3] = new Ouvinte("gustavo@gmail.com", "12345", "Gustavo Costa", null);
		ouvintes[4] = new Ouvinte("clovson@gmail.com", "123456", "Clovson Viernes", null);
		
		Musica[] recessAlbum = new Musica[2];
		recessAlbum[0] = musicas[0];
		recessAlbum[1] = musicas[1];
		
		Musica[] originsAlbum = new Musica[2];
		originsAlbum[0] = musicas[2];
		originsAlbum[1] = musicas[3];
		
		
		albuns[0] = new Album("Recess", artistas[0], recessAlbum);
		albuns[1] = new Album("Origins", artistas[1], originsAlbum);
		
		
			
		
		
		qtdOuvintes = 5;
		qtdArtistas = 5;
		qtdMusicas = 5;
		
	}
	
	// OUVINTES
	public Ouvinte[] getOuvintes() {
		return ouvintes;
	}
	public void setOuvintes(Ouvinte[] ouvintes) {
		Dados.ouvintes = ouvintes;
	}
	public int getQtdOuvintes() {
		return qtdOuvintes;
	}
	

	
	// ARTISTAS
	public Artista[] getArtistas() {
		return artistas;
	}
	public void setArtistas(Artista[] artistas) {
		Dados.artistas = artistas;
	}

	public int getQtdArtistas() {
		return qtdArtistas;
	}
	
	// MUSICAS
	public Musica[] getMusicas() {
		return musicas;
	}
	public void setMusicas(Musica[] musicas) {
		Dados.musicas = musicas;
	}
	public int getQtdMusicas() {
		return qtdMusicas;
	}
	
	// ALBUNS
	public Album[] getAlbuns() {
		return albuns;
	}
	
	
	
	
	
	
}
