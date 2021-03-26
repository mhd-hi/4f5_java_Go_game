package GO_APP.pages.parametres;

import Go.enumerations.Couleur;
import Go.enumerations.TailleTable;
//import Go.enumerations.TailleTable;
import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.modeles.Modele;

public class Parametres extends Modele<ParametresLectureSeule> implements ParametresLectureSeule {


	private TailleTable tailleTable;
	

	@Override 
	public void apresCreation() {
		J.appel(this);
		
		//quiEsTu = Couleur.BLANC;
		
		tailleTable = TailleTable.TABLE_MOYENNE;
	}
	
	
	@Override 
	public void apresChargementJson() {
		J.appel(this);
		
		DoitEtre.nonNul(tailleTable);
	}
	
	
	/*@Override
	public Couleur getQuiEsTu() {
		J.appel(this);
		
		return quiEsTu;
	}
	
	
	public void choisirQuiEsTu(Couleur joueurQuiEsTu) {
		J.appel(this);
		
		this.quiEsTu = joueurQuiEsTu;
	}*/
	
	
	public void choisirTailleGrille(TailleTable tailleGrille) {
		J.appel(this);
		
		this.tailleTable = tailleGrille;
	}
	
	
	@Override
	public TailleTable getTailleTable() {
		return tailleTable;
	}
}
