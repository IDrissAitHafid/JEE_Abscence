package admin.web;

import java.util.ArrayList;
import java.util.List;

import admin.Etudiant;

public class EtudiantModel {
<<<<<<< HEAD
	private int motCleEt;
	private List<Etudiant> etudiants=new ArrayList<Etudiant>();
	
	public int getMotCleEt() {
		return motCleEt;
	}
	public void setMotCleEt(int motCleEt) {
=======
	private String motCleEt;
	private String grpe;
	private String snce;
	private List<Etudiant> etudiants=new ArrayList<Etudiant>();
	
	

	public String getGrpe() {
		return grpe;
	}

	public void setGrpe(String grpe) {
		this.grpe = grpe;
	}

	public String getSnce() {
		return snce;
	}

	public void setSnce(String snce) {
		this.snce = snce;
	}

	public String getMotCleEt() {
		return motCleEt;
	}
	
	public void setMotCleEt(String motCleEt) {
>>>>>>> 0c0cc33a3515aba9c1fa74b5c6b201eb4dd93e94
		this.motCleEt = motCleEt;
	}
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	
	
}
