package Zoo;

import java.util.ArrayList;
import java.util.List;

import Enums.TypeAnimal;
import Exception.AnimalDansMauvaisSecteurException;

public class Secteur {

	private TypeAnimal typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur;
	public Secteur(TypeAnimal type) {
		this.typeAnimauxDansSecteur=type;
		this.animauxDansSecteur=new ArrayList<Animal>();
	}
	public void ajouterAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		if(this.typeAnimauxDansSecteur!=animal.getTypeAnimal()) throw new AnimalDansMauvaisSecteurException("Animal dans mauvais secteur");
		this.animauxDansSecteur.add(animal);
	}
	public int getNombreAnimaux() {
		return this.animauxDansSecteur.size();
	}
	public TypeAnimal obtenirType() {
		return this.typeAnimauxDansSecteur;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
