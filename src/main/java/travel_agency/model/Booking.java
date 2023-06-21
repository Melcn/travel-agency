package travel_agency.model;

import java.util.Date;

public class Booking {
	private Integer id_booking;
	private Date booking_date;
	private Integer nb_places_reserved;

	public Booking() {
		super();
	}

	public Integer getId_booking() {
		return id_booking;
	}

	public Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}

	public Integer getNb_places_reserved() {
		return nb_places_reserved;
	}

	public void setNb_places_reserved(Integer nb_places_reserved) {
		this.nb_places_reserved = nb_places_reserved;
	}

	@Override
	public String toString() {
		return "Reservation [id_reservation=" + id_booking + ", booking_date=" + booking_date
				+ ", nb_places_reserved=" + nb_places_reserved + "]";
	}

}
