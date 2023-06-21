package travel_agency.model;

import java.util.Date;

public class Circuit {
	private Integer id_circuit;
	private String description_circuit;
	private String departure_city;
	private String arrival_city;
	private String departure_country;
	private String arrival_country;
	private Date departure_date;
	private Integer duration;
	private Integer registration_price;

	public Circuit() {
		super();
	}

	public Integer getId_circuit() {
		return id_circuit;
	}


	public String getDescription_circuit() {
		return description_circuit;
	}

	public void setDescription_circuit(String description_circuit) {
		this.description_circuit = description_circuit;
	}

	public String getDeparture_city() {
		return departure_city;
	}

	public void setDeparture_city(String departure_city) {
		this.departure_city = departure_city;
	}

	public String getArrival_city() {
		return arrival_city;
	}

	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}

	public String getDeparture_country() {
		return departure_country;
	}

	public void setDeparture_country(String departure_country) {
		this.departure_country = departure_country;
	}

	public String getArrival_country() {
		return arrival_country;
	}

	public void setArrival_country(String arrival_country) {
		this.arrival_country = arrival_country;
	}

	public Date getDeparture_date() {
		return departure_date;
	}

	public void setDeparture_date(Date departure_date) {
		this.departure_date = departure_date;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getRegistration_price() {
		return registration_price;
	}

	public void setRegistration_price(Integer registration_price) {
		this.registration_price = registration_price;
	}

	@Override
	public String toString() {
		return "Circuit [id_circuit=" + id_circuit + ", description_circuit=" + description_circuit
				+ ", departure_city=" + departure_city + ", arrival_city=" + arrival_city + ", departure_country="
				+ departure_country + ", arrival_country=" + arrival_country + ", departure_date=" + departure_date
				+ ", duration=" + duration + ", registration_price=" + registration_price + "]";
	}

}
