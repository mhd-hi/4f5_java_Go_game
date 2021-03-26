package Go.enumerations;

import static Go.Constantes.*;
import ntro.debogage.J;

public enum TailleTable {
	TABLE_PETITE(TAILLE_GRILLE_PETITE),
	TABLE_MOYENNE(TAILLE_GRILLE_MOYENNE),
	TABLE_GRANDE(TAILLE_GRILLE_GRANDE);

	
	private int taille;  
	
	private TailleTable(int taille) {  
		J.appel(this);  
		this.taille = taille;  
	}   
	
	public int getTaille(){  
		return taille;
	}
}