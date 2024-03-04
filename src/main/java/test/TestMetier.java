package test;

import java.util.List;

import metier.MetierImpl;
import metier.PieceTH;

public class TestMetier {

	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<PieceTH> prods = metier.getPieceTHParMotCle("An");
		for (PieceTH p : prods) {
		System.out.println(p.getNOM_PIECETH());
		}

	}

}
