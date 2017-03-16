package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connexion {
	public Connexion()
	{
		
	}
	
	private EntityManager entityManager;
	
	protected EntityManager getEntityManager() 
	{	if(entityManager==null)
		{
		 EntityManagerFactory emf= Persistence.createEntityManagerFactory("AppSMS");
		 entityManager=emf.createEntityManager();
		}
		return entityManager;
	}
	protected void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
