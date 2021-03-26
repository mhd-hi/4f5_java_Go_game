// Copyright (C) (2020) (Mathieu Bergeron) (mathieu.bergeron@cmontmorency.qc.ca)
//
// This file is part of tutoriels4f5
//
// tutoriels4f5 is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// tutoriels4f5 is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with aquiletour.  If not, see <https://www.gnu.org/licenses/>


package GO_APP.pages.parametres;

import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.controleurs.ControleurModeleVue;
import ntro.mvc.controleurs.RecepteurCommandeMVC;
import GO_APP.commandes.choisir_Qui_Es_Tu.ChoisirQuiEsTu;
import GO_APP.commandes.choisir_Qui_Es_Tu.ChoisirQuiEsTuRecue;
import GO_APP.commandes.choisir_Taille_Table.ChoisirTailleTable;
import GO_APP.commandes.choisir_Taille_Table.ChoisirTailleTableRecue;
import Go.enumerations.Couleur;
import Go.enumerations.TailleTable;

public class   ControleurParametres 
       extends ControleurModeleVue<ParametresLectureSeule, 
                                   Parametres,
                                   VueParametres,
                                   AfficheurParametres> {
	
	@Override
	protected void installerReceptionCommandes() {
		J.appel(this);
		//Qui es tu passe ps ms taille marche
		/*installerRecepteurCommande(ChoisirQuiEsTu.class, new RecepteurCommandeMVC<ChoisirQuiEsTuRecue>() {
			@Override
			public void executerCommandeMVC(ChoisirQuiEsTuRecue commande) {
				J.appel(this);
				
				Couleur quiEsTu = commande.getCouleur();

				DoitEtre.nonNul(quiEsTu);

				getModele().choisirQuiEsTu(quiEsTu);
			}
		});*/
		
		installerRecepteurCommande(ChoisirTailleTable.class, new RecepteurCommandeMVC<ChoisirTailleTableRecue>() {
			@Override
			public void executerCommandeMVC(ChoisirTailleTableRecue commande) {
				J.appel(this);
				
				TailleTable tailleTable = commande.getTailleTable();
				
				DoitEtre.nonNul(tailleTable);
				
				getModele().choisirTailleTable(tailleTable);
			}
		});
	}

	@Override
	protected void demarrer() {
		J.appel(this);
	} 

	@Override
	protected void obtenirMessagesPourEnvoi() {
		J.appel(this);
	}

	@Override
	protected void installerReceptionMessages() {
		J.appel(this);
	}
}
