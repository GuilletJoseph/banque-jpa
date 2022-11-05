package com.example.banquejpa;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.AssuranceVie;
import entities.Compte;
import entities.LivretA;

public class BanqueJpaApplication {

	public static void main(String[] args) {	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-banque");
		EntityManager em = emf.createEntityManager();	
		EntityTransaction transaction = em.getTransaction();
		
		
		
	LivretA livretA=new LivretA();
	livretA.setType("livretA");
	livretA.setNumero("1234");
	livretA.setSolde(1500);
	livretA.setTaux(1);
	
	transaction.begin();
	em.persist(livretA);
	
	AssuranceVie assV=new AssuranceVie();
	assV.setType("assuranceVie");
	assV.setNumero("5678");
	assV.setSolde(2500);
	assV.setTaux(2);
	LocalDate date = LocalDate.of(2005, Month.JUNE, 5);
	assV.setDateFin(date);
	em.persist(assV);
	transaction.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
