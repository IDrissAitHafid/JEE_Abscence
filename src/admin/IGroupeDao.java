package admin;

import java.util.List;

public interface IGroupeDao {
	public List<groupe> Afficher_groupe();
	public groupe saveGroupe(groupe g);
	public List<groupe> groupeParMC(String mc);
	public groupe getGroupe(int id);
	public groupe getGroupe(String nomGrp);
	public groupe updateGroupe(groupe g);
	public void deteteGroupe(int id);
}
