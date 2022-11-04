package entities;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compte")


public class Compte {
	    private int id;	    
	    private String numero;
	    private double solde;   
		
		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		@Column(name = "NUMERO")
		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}
		@Column(name = "SOLDE")
		public double getSolde() {
			return solde;
		}

		public void setSolde(double solde) {
			this.solde = solde;
		}
		
		
}

