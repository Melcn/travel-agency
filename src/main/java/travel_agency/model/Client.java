package travel_agency.model;

import java.util.Date;

public class Client {

	private Integer id_Client;
	private String nom_Client;
	private String prenom_Client;
	private Date date_naissance;
	private String telephone;
	private String email;

	public Client() {
		super();
	}

	public Integer getId_Client() {
		return id_Client;
	}

	public String getNom_Client() {
		return nom_Client;
	}

	public void setNom_Client(String nom_Client) {
		this.nom_Client = nom_Client;
	}

	public String getPrenom_Client() {
		return prenom_Client;
	}

	public void setPrenom_Client(String prenom_Client) {
		this.prenom_Client = prenom_Client;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client [id_Client=" + id_Client + ", nom_Client=" + nom_Client + ", prenom_Client=" + prenom_Client
				+ ", date_naissance=" + date_naissance + ", telephone=" + telephone + ", email=" + email + "]";
	}

	
}
