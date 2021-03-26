package GO_APP.commandes.choisir_Taille_Table;

import ntro.commandes.CommandeRecue;
import Go.enumerations.TailleTable;

public interface ChoisirTailleTableRecue extends CommandeRecue {
	
	TailleTable getTailleTable();
}