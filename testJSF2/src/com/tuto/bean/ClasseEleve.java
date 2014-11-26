package com.tuto.bean;

import java.util.ArrayList;

import javax.faces.model.SelectItem;

public class ClasseEleve {
	private ArrayList<Eleve> liste;
	private ArrayList<String> choix;
	private String oneChoix;
	
	public ClasseEleve() {
		chargerEleve();
	}
	
	public void chargerEleve(){
		liste = new ArrayList<Eleve>();
		
		Eleve nouvelEleve =  new Eleve();
		nouvelEleve.setNom("Stouder");
		nouvelEleve.setPrenom("Fabien");
		liste.add(nouvelEleve);
		nouvelEleve.setNom("Stouder");
		nouvelEleve.setPrenom("Fabien");
		liste.add(nouvelEleve);
		nouvelEleve.setNom("Stouder");
		nouvelEleve.setPrenom("Fabien");
		liste.add(nouvelEleve);
		
	}

	public ArrayList<SelectItem> getListe() {
		ArrayList<SelectItem> eleves = new ArrayList<SelectItem>();
		
		for(Eleve eleve:liste){
			SelectItem item = new SelectItem(eleve.getPrenom(),eleve.getNom());
			eleves.add(item);
		}
		
		return eleves;
	}

	public void setListe(ArrayList<Eleve> liste) {
		this.liste = liste;
	}

	public ArrayList<String> getChoix() {
		return choix;
	}

	public void setChoix(ArrayList<String> choix) {
		this.choix = choix;
	}

	public String getOneChoix() {
		return oneChoix;
	}

	public void setOneChoix(String oneChoix) {
		this.oneChoix = oneChoix;
	}
	
	
	
}
