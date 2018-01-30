package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplEtudiantDao implements IEtudiantDao{

	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Etudiant> etudiantParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant getEtudiant(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deteteEtudiant(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Etudiant> Afficher_etudiant(String groupe,String seance) {
		List<Etudiant> etudiants=new ArrayList<Etudiant>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT ID_ETUDIANT,NOM_ETUDIANT,PRENOM_ETUDIANT,DATE_NAISSANCE FROM ETUDIANT,GROUPE,SEANCE WHERE GROUPE.ID_GROUPE=ETUDIANT.ID_GROUPE AND NOM_GROUPE LIKE ? AND NOM_SEANCE IN (SELECT NOM_SEANCE FROM SEANCE,ETUDIER WHERE SEANCE.ID_SEANCE=ETUDIER.ID_SEANCE AND NOM_SEANCE LIKE ?)");
			ps.setString(1, groupe);
			ps.setString(2, seance);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Etudiant e=new Etudiant();
				e.setId_etudiant(rs.getInt("ID_ETUDIANT"));
				e.setNom_etudiant(rs.getString("NOM_ETUDIANT"));
				e.setPrenom_etudiant(rs.getString("PRENOM_ETUDIANT"));
				e.setDate(rs.getString("DATE_NAISSANCE"));
				etudiants.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudiants;
	}

}
