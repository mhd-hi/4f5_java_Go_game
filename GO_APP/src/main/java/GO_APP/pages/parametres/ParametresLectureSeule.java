package GO_APP.pages.parametres;

import Go.enumerations.Couleur;
import ntro.mvc.modeles.ModeleLectureSeule;

public interface ParametresLectureSeule extends ModeleLectureSeule {
	Couleur getQuiEsTu();
	int getTailleTable();
}
