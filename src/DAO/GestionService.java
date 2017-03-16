package DAO;


import Entities.Service;

public class GestionService {
	
	Connexion cnx= new Connexion() ; 
	
	
	public int insert(Service s){
		try{
		cnx.getEntityManager().getTransaction().begin();
		cnx.getEntityManager().persist(s);
		cnx.getEntityManager().getTransaction().commit();
		return 0;
		}catch(Exception e){
			if(cnx.getEntityManager().getTransaction().isActive())
				cnx.getEntityManager().getTransaction().rollback();
		}
		return 1;
		}
	
	
}
