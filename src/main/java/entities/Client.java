package entities;
import java.sql.Date;
import java.time.LocalDate;
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
@Table(name = "client")


public class Client {
	    private int id;	    
	    private String nom;
	    private String prenom ;   
	    private LocalDate dateN;
	    private Banque banque;
	    private Set<Compte> compte;
	    @Embedded
	    private Adresse adresse;	
	    
		public Client() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Client(String nom, String prenom, LocalDate dateN, Banque banque , Adresse adresse) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateN = dateN;
			this.adresse = adresse;
			this.banque=banque;
		}

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
		public LocalDate getDateN() {
			return dateN;
		}

		public void setDateN(LocalDate dateN) {
			this.dateN = dateN;
		}	 
		
		    @ManyToOne(cascade = {CascadeType.ALL})	    
		    @JoinColumn(name = "ID_BANQUE")
		    public Banque getBanque() {
				return banque;
			}

			public void setBanque(Banque banque) {
				this.banque = banque;
			}	
			 @ManyToMany(cascade = {CascadeType.ALL})
			 @JoinTable(name="client_compte",
			 joinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID"),
			 inverseJoinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName="ID")
			 )
			public Set<Compte> getCompte() {
				return compte;
			}

			public void setCompte(Set<Compte> compte) {
				this.compte = compte;
			}
		
		
			public Adresse getAdresse() {
				return adresse;
			}

			public void setAdresse(Adresse adresse) {
				this.adresse = adresse;
			}
		
		
			
			
			
}


