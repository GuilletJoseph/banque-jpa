package entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private int numeroRue;
    private String rue ;   
    private int codePostal;
    private String ville; 
    
    public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adresse(int numeroRue, String rue, int codePostal, String ville) {
		super();
		this.numeroRue = numeroRue;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	@Column(name = "NUMERO_RUE")
	public int getNumero() {
		return numeroRue;
	}
	public void setNumero(int numeroRue) {
		this.numeroRue = numeroRue;
	}
	
	
	@Column(name = "RUE")
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	
	@Column(name = "CODE_POSTAL")
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	@Column(name = "VILLE")
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

    
    
    
    
}
