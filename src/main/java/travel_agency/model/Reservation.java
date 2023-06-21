package travel_agency.model;

import java.util.Date;

public class Reservation {
	private Integer id_reservation;
	private Date date_reservation;
	private Integer nb_place_reservee;

	public Reservation() {
		super();
	}

	public Integer getId_reservation() {
		return id_reservation;
	}

	public void setId_reservation(Integer id_reservation) {
		this.id_reservation = id_reservation;
	}

	public Date getDate_reservation() {
		return date_reservation;
	}

	public void setDate_reservation(Date date_reservation) {
		this.date_reservation = date_reservation;
	}

	public Integer getNb_place_reservee() {
		return nb_place_reservee;
	}

	public void setNb_place_reservee(Integer nb_place_reservee) {
		this.nb_place_reservee = nb_place_reservee;
	}

	@Override
	public String toString() {
		return "Reservation [id_reservation=" + id_reservation + ", date_reservation=" + date_reservation
				+ ", nb_place_reservee=" + nb_place_reservee + "]";
	}

}
