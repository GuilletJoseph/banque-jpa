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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "operation")


public class Operation {
	    private int id;	    
	    private Date date;
	    private double montant ;   
	    private String motif;
	    private Compte compte;  
		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		@Column(name = "DATE")
		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}
		
		@Column(name = "MONTANT")
		public double getMontant() {
			return montant;
		}

		public void setMontant(double montant) {
			this.montant = montant;
		}
		
		@Column(name = "MOTIF")
		public String getMotif() {
			return motif;
		}

		public void setMotif(String motif) {
			this.motif = motif;
		}
		
		
		 @ManyToOne
		    @JoinColumn(name = "ID_COMPTE")
		    public Compte getCompte() {
				return compte;
			}

			public void setCompte(Compte compte) {
				this.compte = compte;
			}
		
		
		    
}



