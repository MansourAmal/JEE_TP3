package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue{
	@Override
	public List<PieceTH> getPieceTHParMotCle(String mc) {
	List<PieceTH> prods= new ArrayList<PieceTH>();
	Connection conn=SingletonConnection.getConnection();
	try {

	PreparedStatement ps= conn.prepareStatement("select * from pieceth where NOM_PIECETH LIKE ?");

	ps.setString(1, "%"+mc+"%");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
	PieceTH p = new PieceTH();
	p.setID_PIECETH(rs.getLong("ID_PIECETH"));
	p.setNOM_PIECETH(rs.getString("NOM_PIECETH"));
	p.setAUTEUR(rs.getString("AUTEUR"));
	prods.add(p);
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return prods;
	}

	@Override
	public void addPieceTH(PieceTH p) {
		// TODO Auto-generated method stub
	}

}
