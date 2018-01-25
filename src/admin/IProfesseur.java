package admin;

import java.util.List;

public interface IProfesseur {
	public Professeur Ajouter_prof(Professeur p);
	public List<Professeur> Afficher_prof();
	public List<Professeur> professeurParMC(String mc);
	public Professeur Modifier_prof(Professeur p);
	public Professeur Supprimer_prof(int Id_professeur);
	public Professeur Consulter_prof(int Id_professeur);

}
