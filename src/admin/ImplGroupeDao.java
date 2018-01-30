package admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;


public class ImplGroupeDao implements IGroupeDao{

	@Override
	public groupe saveGroupe(groupe g) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO Groupe (Nom_groupe,UE)VALUES (?,?)");
			ps.setString(1, g.getNom_groupe());
			ps.setString(2,g.getUE());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id_groupe) AS MAX_ID_GROUPE FROM Groupe");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()){
				g.setId_groupe(rs.getInt("MAX_ID_GROUPE"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return g;
	}

	@Override
	public List<groupe> groupeParMC(String mc) {
		Connection connecton=SingletonConnection.getConnection();
		List<groupe> groupes=new ArrayList<groupe>();
		try {
			PreparedStatement ps=connecton.prepareStatement
					("SELECT * FROM Groupe WHERE Nom_groupe Like ?");
			ps.setString(1,mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				groupe g=new groupe();
				g.setId_groupe(rs.getInt("Id_groupe"));
				g.setNom_groupe(rs.getString("Nom_groupe"));
				g.setUE(rs.getString("UE"));
				
				groupes.add(g);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return groupes;
	}

	@Override
	public groupe getGroupe(int id) {
		Connection connecton=SingletonConnection.getConnection();
		groupe g=new groupe();
		try {
			PreparedStatement ps=connecton.prepareStatement
					("SELECT * FROM Groupe WHERE Id_groupe Like ?");
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
	}

	@Override
	public groupe updateGroupe(groupe g) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
				("UPDATE Groupe SET Nom_groupe=?,UE=? WHERE Id_groupe=?");
			ps.setString(1, g.getNom_groupe());
			ps.setString(2,g.getUE());
			ps.setInt(3, g.getId_groupe());
			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return g;
	}

	
	@Override
	public void deteteGroupe(int id) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement
				("DELETE FROM Groupe WHERE Id_groupe=?");
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
	public groupe getGroupe(String nomGrp) {
		Connection connecton=SingletonConnection.getConnection();
		groupe g=new groupe();
		try {
			PreparedStatement ps=connecton.prepareStatement
					("SELECT * FROM Groupe WHERE Nom_groupe Like ?");
			ps.setString(1,nomGrp);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				g.setId_groupe(rs.getInt("Id_groupe"));
				g.setNom_groupe(rs.getString("Nom_groupe"));
				g.setUE(rs.getString("UE"));
=======
	public List<groupe> Afficher_groupe() {
		Connection connecton=SingletonConnection.getConnection();
		List<groupe> groupes=new ArrayList<groupe>();
		try {
			PreparedStatement ps=connecton.prepareStatement
					("SELECT * FROM Groupe");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				groupe g=new groupe();
				g.setId_groupe(rs.getInt("Id_groupe"));
				g.setNom_groupe(rs.getString("Nom_groupe"));
				g.setUE(rs.getString("UE"));
				
				groupes.add(g);
>>>>>>> 0c0cc33a3515aba9c1fa74b5c6b201eb4dd93e94
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
<<<<<<< HEAD
		return g;
=======
		return groupes;
>>>>>>> 0c0cc33a3515aba9c1fa74b5c6b201eb4dd93e94
	}

}
