package pkgSocial;

import java.util.ArrayList;
import java.util.List;

public class Utente {
	
	private String nome;
	private String cognome;
	private int età;
	private char sesso;
	private String email;
	
	private List<Utente> listAmici = new ArrayList<Utente>();

	public Utente(String nome, String cognome, int età, char sesso,
			String email) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.età = età;
		this.sesso = sesso;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getEtà() {
		return età;
	}

	public char getSesso() {
		return sesso;
	}

	public String getEmail() {
		return email;
	}

	public boolean aggiungiAmico(Utente amico){
		
		if (listAmici.contains(amico))
			return false;
		
		return listAmici.add(amico);	
	}

	public List<Utente> getListAmici() {
		return listAmici;
	}

	public void setEmail(String email) {
		
		if (email.contains("@"))
			this.email = email;
		else{
			System.out.println("Mail errata!!");
			this.email = null;
		}
	}
	
	
	

}
