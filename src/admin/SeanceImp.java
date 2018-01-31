package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SeanceImp implements ISeance {

	@Override
	public List<Seance> Afficher_seance() {
		List<Seance> seances=new ArrayList<Seance>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM SEANCE");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Seance s=new Seance();
				s.setId_seance(rs.getInt("ID_SEANCE"));
				s.setNom_seance(rs.getString("NOM_SEANCE"));
				s.setDate_seance(rs.getString("DATE_SEANCE"));
				s.setId_semestre(rs.getInt("ID_SEMESTRE"));
				seances.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return seances;
	}
	
	@Override
	public Seance getSeance(String nomSnce) {
		Connection connecton=SingletonConnection.getConnection();
		Seance s=new Seance();
		try {
			PreparedStatement ps=connecton.prepareStatement
					("SELECT * FROM Seance WHERE nom_seance Like ?");
			ps.setString(1,nomSnce);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				s.setId_seance(rs.getInt("Id_seance"));
				s.setNom_seance(rs.getString("Nom_seance"));
				s.setDate_seance(rs.getString("Date_seance"));
				s.setId_semestre(rs.getInt("Id_semestre"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
}