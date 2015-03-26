package com.example.alae;
import java.util.*;

public class Famille 
{
	private Parent leResponsable;
	private ArrayList<Enfant> lesEnfants;
	
	public Famille() 
	{
		lesEnfants = new ArrayList<Enfant>();
	}
	
	public void rajouterEnfant(String nomEnfant, String prenomEnfant, Date dateNaissanceEnfant)
	{
		lesEnfants.add(new Enfant(nomEnfant, prenomEnfant, dateNaissanceEnfant));
	}
	
	public void definirParent(String nom, String prenom, String telephone, String ville, String codePostal, int numVoie, String nomVoie, String voie,int quotient)
	{
		leResponsable = new Parent(nom, prenom, telephone, ville, codePostal, numVoie, nomVoie, voie, quotient);
	}
	
	public void calculerFacture(int mois, int annee)
	{

	}
}
