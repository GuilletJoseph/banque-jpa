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
@Table(name = "livreta")


public class LivretA extends Compte{
	    public LivretA(String type, String numero, double solde, double taux) {
		super(type, numero, solde, taux);
		// TODO Auto-generated constructor stub
	}

		private int id;	    
	    	
		@Id
		@Column(name = "ID")  
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
	
		
		
		
		
}
