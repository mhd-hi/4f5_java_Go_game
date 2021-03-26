package GO_APP.commandes.choisir_Taille_Table;

import ntro.commandes.CommandePourEnvoi;
import Go.enumerations.TailleTable;

public interface ChoisirTailleTablePourEnvoi extends CommandePourEnvoi {
	
	void setTailleTable(TailleTable taille);

}