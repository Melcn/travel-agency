package travel_agency.model;

public class PlaceToVisit {
	private String place_name;
	private String city_toVisit;
	private String country_toVisit;
	private String description;
	private Integer tour_price;

	public PlaceToVisit() {
		super();
	}

	public String getPlace_name() {
		return place_name;
	}

	public void setPlace_name(String place_name) {
		this.place_name = place_name;
	}

	public String getCity_toVisit() {
		return city_toVisit;
	}

	public void setCity_toVisit(String city_toVisit) {
		this.city_toVisit = city_toVisit;
	}

	public String getCountry_toVisit() {
		return country_toVisit;
	}

	public void setCountry_toVisit(String country_toVisit) {
		this.country_toVisit = country_toVisit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTour_price() {
		return tour_price;
	}

	public void setTour_price(Integer tour_price) {
		this.tour_price = tour_price;
	}

	@Override
	public String toString() {
		return "PlaceToVisit [place_name=" + place_name + ", city_toVisit=" + city_toVisit + ", country_toVisit="
				+ country_toVisit + ", description=" + description + ", tour_price=" + tour_price + "]";
	}

}
