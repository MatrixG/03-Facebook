package pkgSocial;

import java.util.ArrayList;
import java.util.List;

public class Facebook {
	
	List<Utente> utenti = new ArrayList<Utente>();
	
	

	
	public Facebook(){
		
	}
	
	
	
	
	
	public boolean registraUtente (String nome, String cognome, int età,
									char sesso, String email){
		
		if (email.contains("@")) {
			
			for ( Utente u : utenti){
				if (u.getNome().equalsIgnoreCase(nome) &&
					u.getCognome().equalsIgnoreCase(cognome) &&
					u.getEmail().equalsIgnoreCase(email) &&
					u.getSesso() == sesso &&
					u.getEtà() == età){
						
					return false;
				}
			}
			utenti.add(new Utente(nome, cognome, età, sesso, email));
			return true;
		}
		return false;
	}


	public boolean aggiungiAmici (String u1, String u2){
		
		int indice1 = cercaUtente(u1);
		int indice2 = cercaUtente(u2);
		
		if ((indice1 >= 0) && (indice2 >= 0) && (indice1 != indice2)){
			
			utenti.get(indice1).aggiungiAmico(utenti.get(indice2));
			utenti.get(indice2).aggiungiAmico(utenti.get(indice1));
			return true;
		}
		
		return false;
	}
	
	
	public String getAmiciDiUnUtente (String nome, String cognome){
		
		
		int indice = cercaUtente(nome, cognome);
		
		String temp = "";
		
		if (indice >= 0){
			
			List<Utente> listAmici = utenti.get(indice).getListAmici();
			temp += "Amici di " + nome + ": ";
			
			for (Utente ut : listAmici){
				temp += ut.getNome() + " " + ut.getCognome() + " ";
				
			}
			return temp + "\n";
		}
		return null;
	}
	
	public String getAmiciDiUnUtente (Utente u){
		
		String temp = "";
		
		List<Utente> listAmici = u.getListAmici();
		for (Utente ut : listAmici){
			
			temp += ut.getNome() + " " + ut.getCognome() + " ";
			
		}
		return temp;
	}
	
	
	public String getAmiciDiAmici (String nome, String cognome){
		
		int indice = cercaUtente(nome, cognome);
		
		if (indice >= 0){
			
			String temp = "";
			List<Utente> amiciOutput = new ArrayList<Utente>();
			List<Utente> listAmici = utenti.get(indice).getListAmici();
			temp += "Amici di amici di" + " " + utenti.get(indice).getNome() + ": ";
			
			
			for (Utente u : listAmici){
				
				List<Utente> amiciTemp = u.getListAmici();
				
				for (Utente ut : amiciTemp){
					
					if (!(amiciOutput.contains(ut)) &&
							!ut.getCognome().equals(cognome) &&
							!ut.getNome().equals(nome) &&
							!listAmici.contains(ut)){
						amiciOutput.add(ut);
					}
				}
			}
			
			for (Utente u : amiciOutput){
				temp += u.getNome() + " " + u.getCognome() + " ";
			}
			return temp + "\n";	
		}
		
		return null;
	}
	
	public String getAmiciInComune (String nome1, String cognome1, String nome2, String cognome2){
		
		int indice1 = cercaUtente(nome1, cognome1);
		int indice2 = cercaUtente(nome2, cognome2);
		String temp = "";
		
		if ((indice1 >= 0) && (indice2 >= 0) && (indice1 != indice2)){
			
			List<Utente> amiciUtente1 = utenti.get(indice1).getListAmici();
			
			for (Utente u : amiciUtente1){
				if (utenti.get(indice2).getListAmici().contains(u)){
					temp += u.getCognome() + " " + u.getNome() + " ";
				}
				
			}
		}
		
		return "Amici in comune di " + utenti.get(indice1).getNome() + " e " + utenti.get(indice2).getNome() +
													": " + temp + "\n";
	}
	
	
	private int cercaUtente	(String utente){
		
		int i = 0;
		
		for ( Utente u : utenti){
			if (utente.equalsIgnoreCase(u.getNome() + " " + u.getCognome())){
				return i;
			}
			i++;
		}
		return -1;
	}
	
	private int cercaUtente (String nome, String cognome){
		
		int i = 0;
		for ( Utente ut : utenti){
			if (ut.getNome().equalsIgnoreCase(nome) &&
					ut.getCognome().equalsIgnoreCase(cognome)){
		
				return i;
			}
			i++;
		}
		
		
		return -1;
	}
	
	
	
	
	
	
	
	
	
	/*
	private int cercaUtente (Utente u){
		
		int i = 0;
		
		for ( Utente ut : utenti){
			if (ut.getNome().equalsIgnoreCase(u.getNome()) &&
					ut.getCognome().equalsIgnoreCase(u.getCognome()) &&
					ut.getEmail().equalsIgnoreCase(u.getEmail()) &&
					ut.getSesso() == u.getSesso() &&
					ut.getEtà() == u.getEtà()){
		
				return i;
			}
			i++;
		}
		return -1;
	}
	*/
	/*
	public void getAmiciDiAmici (Utente u){
		
		int indice = cercaUtente(u);
		
		List<Utente> listAmici = utenti.get(indice).getListAmici();
		
		System.out.println("Amici di Amici" + u.getNome());
		
		for (Utente ut : listAmici){
			getAmiciDiUnUtente(ut.getNome(), ut.getCognome());
		}
	}
	*/
	/*
	public boolean registraUtente (Utente u){
		
		if (cercaUtente(u) < 0){
			utenti.add(u);
			return true;
		}
		return false;
	}
	*/
	

}
