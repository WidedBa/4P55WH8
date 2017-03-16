package Entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the service database table.
 * 
 */
@Entity
@NamedQuery(name="Service.findAll", query="SELECT s FROM Service s")
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_service")
	private int idService;

	@Column(name="adr_ip")
	private String adrIp;

	private String libelle;

	public Service() {
	}

	public int getIdService() {
		return this.idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public String getAdrIp() {
		return this.adrIp;
	}

	public void setAdrIp(String adrIp) {
		this.adrIp = adrIp;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}