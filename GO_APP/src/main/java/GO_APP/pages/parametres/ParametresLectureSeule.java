package GO_APP.pages.parametres;

import Go.enumerations.Couleur;
import Go.enumerations.TailleTable;
import ntro.mvc.modeles.ModeleLectureSeule;

public interface ParametresLectureSeule extends ModeleLectureSeule {
	
	Couleur getQuiEsTu();
	TailleTable getTailleTable();
}
