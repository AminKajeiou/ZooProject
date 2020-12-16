package Zoo;

import java.util.ArrayList;
import java.util.List;
import Enums.TypeAnimal;
import Exception.*;

public class Zoo {
	private final static int MAX_VISIT_SECT=15;
	private int visiteurs;
	private List<Secteur> secteursAnimaux;
	public Zoo() {
		this.visiteurs=0;
		this.secteursAnimaux=new ArrayList<Secteur>();
	}
	 public void ajouterSecteur(Secteur secteur) {
		 this.secteursAnimaux.add(secteur);
	 }
	 public void nouveauVisiteur() throws LimiteVisiteurException{
		 if(visiteurs==MAX_VISIT_SECT) throw new LimiteVisiteurException("Nombre de visiteurs max atteint");
		 this.visiteurs++;
	 }
	 public int getLimiteVisiteur() {
		 return MAX_VISIT_SECT*secteursAnimaux.size();
	 }
	 public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		 Secteur secteur=null;
		 for(Secteur s:secteursAnimaux) {
			 if(s.obtenirType()==animal.getTypeAnimal())	secteur=s;
		 }
		if(secteur==null) throw new AnimalDansMauvaisSecteurException("Animal dans le mauvais secteur");
	 }

	 public int nombreAnimaux() {
		 int nbr=0;
		 for(Secteur s:secteursAnimaux) {
			 nbr=+s.getNombreAnimaux();
		 }
		 nbr=nbr*secteursAnimaux.size();
		 return nbr;
	 }
}
