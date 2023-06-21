package travel_agency.model;

import java.util.Date;

public class Customer {

	private Integer id_customer;
	private String name_customer;
	private String firstName_customer;
	private Date date_birth;
	private String phone_number;
	private String email;

	public Customer() {
		super();
	}

	public Integer getId_customer() {
		return id_customer;
	}

	public String getName_customer() {
		return name_customer;
	}

	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}

	public String getFirstName_customer() {
		return firstName_customer;
	}

	public void setFirstName_customer(String firstName_customer) {
		this.firstName_customer = firstName_customer;
	}

	public Date getDate_birth() {
		return date_birth;
	}

	public void setDate_birth(Date date_birth) {
		this.date_birth = date_birth;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id_customer=" + id_customer + ", name_customer=" + name_customer + ", firstName_customer="
				+ firstName_customer + ", date_birth=" + date_birth + ", phone_number=" + phone_number + ", email="
				+ email + "]";
	}

}
