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

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import ntro.debogage.DoitEtre;
import ntro.debogage.J;
import ntro.mvc.Vue;

import Go.enumerations.Couleur;
import Go.enumerations.TailleTable;
import Go.Constantes; //Pour la grandeur du tableau

import GO_APP.commandes.choisir_Qui_Es_Tu.*;
import GO_APP.commandes.choisir_Taille_Table.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class VueParametres implements Vue, Initializable {

	private ChoisirQuiEsTuPourEnvoi choisirQuiEsTu;
	private ChoisirTailleTablePourEnvoi choisirTailleTable;
	
	
	@FXML
	private Button caseNOIR, caseBLANC, boutonOk;

	@FXML
	private CheckBox checkNOIR, checkBLANC;

	// private FermerParametresPourEnvoi fermerParamatres;
	// private ChoisirTailleGrillePourEnvoi choisirTailleGrille;

	@FXML
	private ComboBox<String> choixTaille;

	private Map<String, TailleTable> tailleSelonNom = new HashMap<>();
	private Map<TailleTable, String> nomSelonTaille = new HashMap<>();

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		J.appel(this);

		DoitEtre.nonNul(caseNOIR);
		DoitEtre.nonNul(caseBLANC);
		DoitEtre.nonNul(checkNOIR);
		DoitEtre.nonNul(checkBLANC);
		DoitEtre.nonNul(choixTaille);

		caseNOIR.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		caseBLANC.setBackground(new Background(new BackgroundFill(Color.WHITE, null, null)));

		initialiserChoixTaille(resources);
	}

	private void initialiserChoixTaille(ResourceBundle resources) {
		J.appel(this);

		for (TailleTable tailleGrille : TailleTable.values()) {

			String nomTaille = tailleGrille.name();

			choixTaille.getItems().add(nomTaille);

			tailleSelonNom.put(nomTaille, tailleGrille);
			nomSelonTaille.put(tailleGrille, nomTaille);
		}

		choixTaille.getSelectionModel().clearAndSelect(0);
	}

	@Override
	public void obtenirCommandesPourEnvoi() {
		J.appel(this);
	}

	@Override
	public void installerCapteursEvenementsUsager() {
		J.appel(this);
		
		checkRouge.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				J.appel(this);
				
				choisirQuiCommence.setCouleur(Couleur.ROUGE);
				choisirQuiCommence.envoyerCommande();
			}
		});

	@Override
	public void verifierCommandesPossibles() {
		J.appel(this);
	}

	public void afficherQuiEsTu(Couleur couleur) {
		J.appel(this);

		DoitEtre.nonNul(couleur);

		switch (couleur) {

		case NOIR:
			checkNOIR.setSelected(true);
			checkBLANC.setSelected(false);
			break;

		case BLANC:
			checkNOIR.setSelected(false);
			checkBLANC.setSelected(true);
			break;
		}
	}

	public void afficherTailleTable(TailleTable tailleTable) {
		J.appel(this);

		String nomTaille = nomSelonTaille.get(tailleTable);

		int indiceTaille = choixTaille.getItems().indexOf(nomTaille);

		if (indiceTaille != -1) {
			choixTaille.getSelectionModel().clearAndSelect(indiceTaille);
		}
	}
}
