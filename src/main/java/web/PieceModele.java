package web;

import java.util.ArrayList;
import java.util.List;

import metier.PieceTH;


public class PieceModele {
	private String motCle;
	List<PieceTH > pieces = new ArrayList<>();

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<PieceTH > getpieces() {
		return pieces;
	}

	public void setpieces(List<PieceTH > pieces) {
		this.pieces = pieces;
	}
}
