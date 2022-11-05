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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
@Inheritance(strategy = InheritanceType.JOINED)

public class Compte {
	    private int id;	
	    private String type;
	    private String numero;
	    private double solde;   
	    private double taux;
	    private Set<Client> client;
		private Set<Operation> operation;
		

		

		public Compte() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Compte(String type, String numero, double solde, double taux) {
			super();
			this.type = type;
			this.numero = numero;
			this.solde = solde;
			this.taux = taux;
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
		
		@Column(name = "TAUX")
		public double getTaux() {
			return taux;
		}

		public void setTaux(double taux) {
			this.taux = taux;
		}
		
		@Column(name = "TYPE")    
	    public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}
		
		@ManyToMany(cascade = {CascadeType.ALL})
		 @JoinTable(name="client_compte",
				 joinColumns= @JoinColumn(name="ID_COMPTE", referencedColumnName="ID"),
				 inverseJoinColumns= @JoinColumn(name="ID_CLIENT", referencedColumnName="ID")
				 )
		
		
		//@ManyToMany(cascade = {CascadeType.ALL},  mappedBy="compte")
		public Set<Client> getClient() {
			return client;
		}

		public void setClient(Set<Client> client) {
			this.client = client;
		}
		
		
		@OneToMany(cascade = {CascadeType.ALL}, mappedBy = "compte")
		public Set<Operation> getOperation() {
			return operation;
		}

		public void setOperation(Set<Operation> operation) {
			this.operation = operation;
		}
		
		
		
		
		
}





