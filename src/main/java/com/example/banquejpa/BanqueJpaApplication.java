package com.example.banquejpa;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Adresse;
import entities.AssuranceVie;
import entities.Banque;
import entities.Client;
import entities.Compte;
import entities.LivretA;

public class BanqueJpaApplication {

	public static void main(String[] args) {	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-banque");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction transaction = em.getTransaction();
	
	
	Client client=new Client();
	client.setNom("guillet");
	client.setPrenom("Joseph");		
	client.setDateN( LocalDate.of(2000, Month.JUNE, 5));
	client.setAdresse(new Adresse(17,"rue des sables",44000, "nantes"));
	client.setBanque(new Banque("banque of France"));
	Set <Compte> comp=new HashSet();
	comp.add(new Compte("livretA","12",3500,2));
	comp.add(new Compte("assuranceVie","34",5000,3));
	client.setCompte(comp);
	transaction.begin();
	em.persist(client);
	transaction.commit();	
	
	
	Compte compte=new Compte();
	compte.setNumero("33");
	compte.setType("livretA");
	compte.setSolde(4500);
	compte.setTaux(4);
	Set <Client> cli=new HashSet();
	cli.add(new Client("bla bla","elnur",LocalDate.of(2000, Month.JUNE, 5), new Adresse(27,"rue Foche",49000, "Angers")));
	cli.add(new Client("3 fois bla bla","joseph2",LocalDate.of(1995, Month.JUNE, 5), new Adresse(27,"rue centre ville", 49100, "Laval")));
	compte.setClient(cli);
	
	transaction.begin();
	em.persist(compte);
	transaction.commit();
	
	
	}

}
