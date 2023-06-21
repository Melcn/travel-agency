package travel_agency.model;

public class User {
	private Integer id_user;
	private String login_user;
	private String password;

	public User() {
		super();
	}

	public Integer getId_user() {
		return id_user;
	}

	public String getLogin_user() {
		return login_user;
	}

	public void setLogin_user(String login_user) {
		this.login_user = login_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", login_user=" + login_user + ", password=" + password + "]";
	}

}
