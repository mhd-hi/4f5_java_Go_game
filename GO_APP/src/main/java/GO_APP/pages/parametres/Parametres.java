package GO_APP.pages.parametres;

import Go.enumerations.Couleur;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule{

	int[] taille = {9, 13, 19};
	
	private Couleur quiEsTu;
	private int tailleTable;
	

	@Override 
	public void apresCreation() {
		J.appel(this);
		
	}
	
	
	@Override 
	public void apresChargementJson() {
		J.appel(this);
		
		DoitEtre.nonNul(quiEsTu); 
	}
	
	
	@Override
	public Couleur getQuiEsTu() {
		J.appel(this);
		
		return quiEsTu;
	}
	
	
	public void choisirQuiEsTu(Couleur joueurQuiEsTu) {
		J.appel(this);
		
		this.quiEsTu = joueurQuiEsTu;
	}
	
	
	public void choisirTailleTable(int tailleTable) {
		J.appel(this);
		
		this.tailleTable = tailleTable;
	}
	
	
	@Override
	public int getTailleTable() {
		return tailleTable;
	}
}
