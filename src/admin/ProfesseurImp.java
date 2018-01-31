package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfesseurImp implements IProfesseur {

	@Override
	public Professeur Ajouter_prof(Professeur p) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO PROFESSEUR (NOM_PROFESSEUR,PRENOM_PROFESSEUR,EMAIL,NUMERO_TELEPHONE) VALUES (?,?,?,?)");
			ps.setString(1,p.getNom_professeur());
			ps.setString(2,p.getPrenom_professeur());
			ps.setString(3,p.getEmail());
			ps.setString(4,p.getNumero_Telephone());
			ps.executeUpdate();
		    PreparedStatement ps2=connection.prepareStatement("SELECT MAX(ID_PROFESSEUR) AS MAX_ID FROM PROFESSEUR");
		    ResultSet rs=ps2.executeQuery();
		    if(rs.next()){
		    	p.setId_professeur(rs.getInt("MAX_ID"));
		    }
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	
	@Override
	public List<Professeur> Afficher_prof() {
		List<Professeur> profs=new ArrayList<Professeur>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM PROFESSEUR");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Professeur p=new Professeur();
				p.setId_professeur(rs.getInt("ID_PROFESSEUR"));
				p.setNom_professeur(rs.getString("NOM_PROFESSEUR"));
				p.setPrenom_professeur(rs.getString("PRENOM_PROFESSEUR"));
				p.setEmail(rs.getString("EMAIL"));
				p.setNumero_Telephone(rs.getString("NUMERO_TELEPHONE"));
				profs.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return profs;
	}
	
	@Override
	public List<Professeur> professeurParMC(String mc) {
		List<Professeur> profs=new ArrayList<Professeur>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM PROFESSEUR WHERE NOM_PROFESSEUR LIKE ?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Professeur p=new Professeur();
				p.setId_professeur(rs.getInt("ID_PROFESSEUR"));
				p.setNom_professeur(rs.getString("NOM_PROFESSEUR"));
				p.setPrenom_professeur(rs.getString("PRENOM_PROFESSEUR"));
				p.setEmail(rs.getString("EMAIL"));
				p.setNumero_Telephone(rs.getString("NUMERO_TELEPHONE"));
				profs.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return profs;
	}

	@Override
	public Professeur Modifier_prof(Professeur p) {
		Connection connection=SingletonConnection.getConnection();
		try {
			System.out.println("aaaaaa");
			PreparedStatement ps=connection.prepareStatement
			("UPDATE PROFESSEUR SET NOM_PROFESSEUR=?,PRENOM_PROFESSEUR=?, EMAIL=?,NUMERO_TELEPHONE=? WHERE ID_PROFESSEUR=?");
			System.out.println("bbbbbb");
			ps.setString(1,p.getNom_professeur());
			ps.setString(2,p.getPrenom_professeur());
			ps.setString(3,p.getEmail());
			ps.setString(4,p.getNumero_Telephone());
			ps.setInt(5,p.getId_professeur());
			System.out.println("cccccccc");
			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public Professeur Supprimer_prof(int Id_professeur) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("DELETE FROM PROFESSEUR WHERE ID_PROFESSEUR=?");
			ps.setInt(1,Id_professeur);
			ps.executeUpdate();
			
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Professeur Consulter_prof(int Id_professeur) {
		Connection connection=SingletonConnection.getConnection();
		Professeur p=new Professeur();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM PROFESSEUR WHERE ID_PROFESSEUR LIKE ?");
			ps.setInt(1,Id_professeur);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				p.setId_professeur(rs.getInt("ID_PROFESSEUR"));
				p.setNom_professeur(rs.getString("NOM_PROFESSEUR"));
				p.setPrenom_professeur(rs.getString("PRENOM_PROFESSEUR"));
				p.setEmail(rs.getString("EMAIL"));
				p.setNumero_Telephone(rs.getString("NUMERO_TELEPHONE"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	

	
	

}
