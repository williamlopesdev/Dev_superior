package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		/*
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "William da Silva", "william@gmail.com");
		Pessoa p3 = new Pessoa(null, "Bruna da Silva", "Bruna@gmail.com"); */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		/*
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		*/
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		
		System.out.println("Pronto");
		em.close();
		emf.close();




	}

}
