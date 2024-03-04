package metier;

import java.io.Serializable;

public class PieceTH implements Serializable {
	private Long ID_PIECETH;
	private String NOM_PIECETH;
	private String AUTEUR;

	public PieceTH() {
	super();
	}
	public PieceTH(Long iD_PIECETH, String nOM_PIECETH, String AUTEUR) {
		super();
		this.setID_PIECETH(iD_PIECETH);
		this.setNOM_PIECETH(nOM_PIECETH);
		this.setAUTEUR(AUTEUR);
	}
	public Long getID_PIECETH() {
		return ID_PIECETH;
	}
	public void setID_PIECETH(Long iD_PIECETH) {
		ID_PIECETH = iD_PIECETH;
	}
	public String getNOM_PIECETH() {
		return NOM_PIECETH;
	}
	public void setNOM_PIECETH(String nOM_PIECETH) {
		NOM_PIECETH = nOM_PIECETH;
	}
	public String getAUTEUR() {
		return AUTEUR;
	}
	public void setAUTEUR(String aUTEUR) {
		AUTEUR = aUTEUR;
	}


	

}
