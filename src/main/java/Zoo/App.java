package Zoo;

import Enums.TypeAnimal;
import Exception.*;

public class App {

	public static void main(String[] args) throws LimiteVisiteurException,AnimalDansMauvaisSecteurException {
		// TODO Auto-generated method stub
		Zoo z=new Zoo();
		Secteur s=new Secteur(TypeAnimal.CHAT);
		Animal c=new Chat("Chat");
		z.ajouterSecteur(s);
		for(int i=0;i<17;i++) 
		z.nouveauVisiteur();
		z.nouvelAnimal(c);
		
		System.out.println("Nombre animaux: "+z.nombreAnimaux());
		System.out.println("\nLimite visiteurs: "+z.getLimiteVisiteur());
		
		
	}

}
