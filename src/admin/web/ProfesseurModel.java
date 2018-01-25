package admin.web;

import java.util.ArrayList;
import java.util.List;

import admin.Professeur;

public class ProfesseurModel {
	private String motCle1;
	private List<Professeur> professeurs=new ArrayList<Professeur>();

	public List<Professeur> getProfesseurs() {
		return professeurs;
	}

	public String getMotCle1() {
		return motCle1;
	}

	public void setMotCle1(String motCle1) {
		this.motCle1 = motCle1;
	}

	public void setProfesseurs(List<Professeur> professeurs) {
		this.professeurs = professeurs;
	}
	
	

}
