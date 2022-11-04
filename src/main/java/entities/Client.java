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
@Table(name = "client")


public class Client {
	    private int id;	    
	    private String nom;
	    private String prenom ;   
	    private Date dateN;
	    @Embedded
	    private Adresse adresse;
		
		@Id
		@Column(name = "ID")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
		@Column(name = "NOM")
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		@Column(name = "PRENOM")
		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		@Column(name = "DATE_N")
		public Date getDateN() {
			return dateN;
		}

		public void setDateN(Date dateN) {
			this.dateN = dateN;
		}	    
}


