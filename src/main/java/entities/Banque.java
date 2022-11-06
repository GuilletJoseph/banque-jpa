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
@Table(name = "banque")

public class Banque {
	    private int id;	    
	    private String nom;		  

	
		

		public Banque(int id, String nom) {
			super();
			this.id = id;
			this.nom = nom;
		}



		public Banque(String nom) {
			super();
			this.nom = nom;
		}
		private Set<Client> client=new HashSet<Client>(); 
		
		
		
		
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
		
		
		@OneToMany(mappedBy = "banque")	 
	    public Set<Client> getClient() {
			return client;
		}



		public void setClient(Set<Client> client) {
			this.client = client;
		}
		
		
		
		
		
}