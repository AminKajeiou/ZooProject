package Zoo;

import org.junit.Test;

import Enums.TypeAnimal;
import Exception.*;

public class TestApp {

	@Test(expected=LimiteVisiteurException.class)
	public void nbrVisitOk() throws LimiteVisiteurException {
		Zoo z=new Zoo();
		for(int i=0;i<17;i++)
		z.nouveauVisiteur();
	}
	@Test(expected=AnimalDansMauvaisSecteurException.class)
	public void animalMauvaisSectOk() throws AnimalDansMauvaisSecteurException {
		Zoo z=new Zoo();
		Secteur s=new Secteur(TypeAnimal.CHAT);
		Animal c = new Chien("Chien");
		z.nouvelAnimal(c);
	}
}
