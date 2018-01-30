package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SemestreImp implements ISemestre {

	@Override
	public List<Semestre> Afficher_semestre() {
		List<Semestre> semestres=new ArrayList<Semestre>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM SEMESTRE");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Semestre sm=new Semestre();
				sm.setId_semestre(rs.getInt("ID_SEMESTRE"));
				sm.setNom_semestre(rs.getString("NOM_SEMESTRE"));
				semestres.add(sm);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return semestres;
	}

}
