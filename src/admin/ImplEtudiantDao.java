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
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO etudiant (Nom_etudiant,Prenom_etudiant,Date,Id_groupe)VALUES (?,?,?,?)");
			ps.setString(1, e.getNom_etudiant());
			ps.setString(2,e.getPrenom_etudiant());
			ps.setString(3,e.getDate());
			//ps.setInt(4, e.getId_groupe());
			IGroupeDao gDao=new ImplGroupeDao();
			groupe g=new groupe();
			g=gDao.getGroupe(e.getNom_groupe());
			ps.setInt(4, g.getId_groupe());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(Id_etudiant) AS MAX_ID_ETUDIANT FROM Etudiant");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()){
				e.setId_etudiant(rs.getInt("MAX_ID_ETUDIANT"));
			}
			ps.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		return e;
	}

	@Override
	public List<Etudiant> etudiantParId(int  id) {
		Connection connecton=SingletonConnection.getConnection();
		List<Etudiant> etudiants=new ArrayList<Etudiant>();
		try {
			PreparedStatement ps=connecton.prepareStatement
					("SELECT * FROM etudiant WHERE Id_etudiant Like ?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Etudiant e=new Etudiant();
				e.setId_etudiant(rs.getInt("Id_etudiant"));
				e.setNom_etudiant(rs.getString("Nom_etudiant"));
				e.setPrenom_etudiant(rs.getString("Prenom_etudiant"));
				e.setDate(rs.getString("Date"));
				e.setId_etudiant(rs.getInt("Id_groupe"));
				
				etudiants.add(e);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudiants;
	}

	/*@Override
	public Etudiant getEtudiant(int id) {
		Connection connecton=SingletonConnection.getConnection();
		Etudiant e=new Etudiant();
		try {
			PreparedStatement ps=connecton.prepareStatement
					("SELECT * FROM etudiant WHERE Id_etudiant Like ?");
			ps.setLong(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				g.setId_groupe(rs.getInt("Id_groupe"));
				g.setNom_groupe(rs.getString("Nom_groupe"));
				g.setUE(rs.getString("UE"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return g;
	}*/

	@Override
	public Etudiant updateEtudiant(Etudiant e) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
				("UPDATE etudiant SET Nom_etudiant=?,Prenom_etudiant=?,Date=?,Id_groupe=? WHERE Id_etudiant=?");
			ps.setString(1, e.getNom_etudiant());
			ps.setString(2,e.getPrenom_etudiant());
			ps.setString(3,e.getDate());
			ps.setInt(4, e.getId_etudiant());
			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return e;
	}

	@Override
	public void deteteEtudiant(int id) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
				("DELETE FROM etudiant WHERE Id_etudiant=?");
			ps.setInt(1, id);
			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
<<<<<<< HEAD
	public Etudiant getEtudiant(int id) {
		// TODO Auto-generated method stub
		return null;
=======
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
>>>>>>> 0c0cc33a3515aba9c1fa74b5c6b201eb4dd93e94
	}

}
