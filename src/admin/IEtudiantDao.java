package admin;

import java.util.List;

public interface IEtudiantDao {
	public Etudiant saveEtudiant(Etudiant e);
	public List<Etudiant> etudiantParMC(String mc);
	public Etudiant getEtudiant(int id);
	public Etudiant updateEtudiant(Etudiant e);
	public void deteteEtudiant(int id);
}
