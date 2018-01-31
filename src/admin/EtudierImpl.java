package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EtudierImpl implements IEtudier{

	@Override
	public Etudier updateAbscence(Etudier et) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
				("UPDATE ETUDIER SET Absence_etudiant=?,Id_seance=? WHERE Id_etudiant=?");
			ps.setString(1, et.getAbsence_etudiant());
			ISeance sDao=new SeanceImp();
			Seance s=new Seance();
			s=sDao.getSeance(s.getNom_seance());
			PreparedStatement pss=connection.prepareStatement
					("SELECT Etudier.Id_seance FROM etudier,seance WHERE seance.Id_seance=etudier.Id_seance AND nom_seance Like ?");
			pss.setString(1,et.getNom_seance());
			ResultSet rss=pss.executeQuery();
			if(rss.next()){
				ps.setInt(2,rss.getInt("Id_seance") );
			}
			ps.setInt(3,et.getId_etudiant());
			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return et;
	}

	@Override
	public Etudier getEtudier(int id) {
			Connection connecton=SingletonConnection.getConnection();
			Etudier et=new Etudier();
			try {
				PreparedStatement ps=connecton.prepareStatement
						("SELECT * FROM Etudier WHERE Id_etudiant Like ?");
				ps.setInt(1,id);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){
					et.setAbsence_etudiant(rs.getString("Absence_etudiant"));
					et.setNom_seance(rs.getString("Nom_seance"));
					et.setId_etudiant(rs.getInt("Id_etudiant"));
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return et;
	}

	
}
