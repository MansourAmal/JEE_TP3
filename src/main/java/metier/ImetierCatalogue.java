package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<PieceTH> getPieceTHParMotCle(String mc);

	public void addPieceTH(PieceTH p);
}
