package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImplEvaluation implements IEvaluation{

	@Override
	public Evaluation saveNote(Evaluation ev) {
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("INSERT INTO Evaluation (Note,Id_professeur)VALUES (?,?)");
			ps.setDouble(1, ev.getNote());
			ps.setInt(2,ev.getId_professeur());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement("SELECT MAX(id_evaluation) AS MAX_ID_EVAL FROM Evaluation");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()){
				ev.setId_evaluation(rs.getInt("MAX_ID_EVAL"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ev;
	}

}
