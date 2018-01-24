package admin.web;

import java.util.ArrayList;
import java.util.List;

import admin.groupe;

public class GroupeModel {
	private String motCle;
	private List<groupe> groupes=new ArrayList<groupe>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<groupe> getGroupes() {
		return groupes;
	}
	public void setGroupes(List<groupe> groupes) {
		this.groupes = groupes;
	}
	
}
