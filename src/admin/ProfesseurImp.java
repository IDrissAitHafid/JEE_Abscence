package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	public Professeur Modifier_prof(Professeur p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professeur Supprimer_prof(int Id_professeur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Professeur Consulter_prof(int Id_professeur) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
