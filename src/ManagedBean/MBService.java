package ManagedBean;


import DAO.GestionService;
import Entities.Service;

public class MBService {
	Service s = new Service();
	GestionService dao =new GestionService();
	
	public MBService(){
		
	}

	public Service getS() {
		return s;
	}

	public void setS(Service s) {
		this.s = s;
	}

	public GestionService getDao() {
		return dao;
	}

	public void setDao(GestionService dao) {
		this.dao = dao;
	}

	public void addService(){
			
		if(dao.insert(s)==0){
			System.out.println("success");
		}
		else
		{
			System.out.println("Failed");

		}
		
	}
}
