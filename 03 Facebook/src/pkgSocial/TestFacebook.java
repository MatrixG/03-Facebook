package pkgSocial;

public class TestFacebook {

	public static void main(String[] args) {
	
		Facebook f = new Facebook();
		
		Utente u1 = new Utente("aaaa","aaaa",18,'M',"aaaa@alfa.com");
		Utente u2 = new Utente("bbbb","bbbb",18,'M',"bbbb@alfa.com");
		Utente u3 = new Utente("cccc","cccc",28,'f',"cccc@alfa.com");
		Utente u4 = new Utente("dddd","dddd",28,'F',"dddd@alfa.com");	
		Utente u5 = new Utente("eeeee","eeee",28,'F',"eeeee@alfa.com");
		Utente u6 = new Utente("ffff","ffff",28,'M',"ffff@alfa.com");
		
		f.registraUtente(u1.getNome(), u1.getCognome(), u1.getEtà(), u1.getSesso(), u1.getEmail());
		f.registraUtente(u2.getNome(), u2.getCognome(), u2.getEtà(), u2.getSesso(), u2.getEmail());
		f.registraUtente(u3.getNome(), u3.getCognome(), u3.getEtà(), u3.getSesso(), u3.getEmail());
		f.registraUtente(u4.getNome(), u4.getCognome(), u4.getEtà(), u4.getSesso(), u4.getEmail());
		f.registraUtente(u5.getNome(), u5.getCognome(), u5.getEtà(), u5.getSesso(), u5.getEmail());
		f.registraUtente(u6.getNome(), u6.getCognome(), u6.getEtà(), u6.getSesso(), u6.getEmail());
		
		
		f.aggiungiAmici (u1.getNome() + " " + u1.getCognome(), u2.getNome() + " " + u2.getCognome());
		f.aggiungiAmici (u1.getNome() + " " + u1.getCognome(), u3.getNome() + " " + u3.getCognome());
		f.aggiungiAmici (u1.getNome() + " " + u1.getCognome(), u4.getNome() + " " + u4.getCognome());
		f.aggiungiAmici (u1.getNome() + " " + u1.getCognome(), u5.getNome() + " " + u5.getCognome());
		f.aggiungiAmici (u2.getNome() + " " + u2.getCognome(), u3.getNome() + " " + u3.getCognome());
		
		
		
		System.out.println(f.getAmiciDiUnUtente("aaaa","aaaa"));
		System.out.println(f.getAmiciDiAmici("eeeee","eeee"));
		System.out.println(f.getAmiciDiAmici("bbbb", "bbbb"));
		System.out.println(f.getAmiciInComune("aaaa","aaaa","bbbb", "bbbb"));
		System.out.println(f.getAmiciInComune("aaaa","aaaa","cccc", "cccc"));
		System.out.println(f.getAmiciInComune("dddd","dddd","ffff", "ffff"));
		
		
		/*
		f.aggiungiAmici(u1,u2);
		f.aggiungiAmici(u1,u3);
		f.aggiungiAmici(u1,u4);
		f.aggiungiAmici(u1,u5);
		f.aggiungiAmici(u2,u3);
		*/
		
		/*
		f.registraUtente(u1);
		f.registraUtente(u2);
		f.registraUtente(u3);
		f.registraUtente(u4);
		f.registraUtente(u5);
		*/

	}

}
