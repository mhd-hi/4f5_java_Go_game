package GO_APP.pages.parametres;


import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import ntro.debogage.J;
import ntro.javafx.Initialisateur;
import ntro.mvc.modeles.EntrepotDeModeles;
import ntro.systeme.Systeme;



public class PageParametres extends Application {
	
	public static final String[] IDS_MODELES_TESTS = {"test01","test02","test03"};
	
	static {
		Initialisateur.initialiser();
		
		J.appel(PageParametres.class);
	}
	
	private Random alea = new Random();
	
	public static void main(String[] args) {
		J.appel(PageParametres.class);
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		J.appel(this);
		
		String idModeleTest = IDS_MODELES_TESTS[alea.nextInt(IDS_MODELES_TESTS.length)];
		
		Parametres parametres = EntrepotDeModeles.obtenirModele(Parametres.class, idModeleTest);		
		
		J.valeurs(parametres.getQuiEsTu().name(), parametres.getTailleTable());
		
		

		
		Systeme.quitter();
	}
}