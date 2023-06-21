package travel_agency.model;

public class Role {
	private Integer id_role;
	private String designation;

	public Role() {
		super();
	}

	public Integer getId_role() {
		return id_role;
	}

	public void setId_role(Integer id_role) {
		this.id_role = id_role;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Role [id_role=" + id_role + ", designation=" + designation + "]";
	}

}
