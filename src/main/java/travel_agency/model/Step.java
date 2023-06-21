package travel_agency.model;

import java.util.Date;

public class Step {
	private Integer id_step;
	private Integer order;
	private Date step_date;
	private Integer duration;

	public Step() {
		super();
	}

	public Integer getId_step() {
		return id_step;
	}


	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public Date getStep_date() {
		return step_date;
	}

	public void setStep_date(Date step_date) {
		this.step_date = step_date;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Step [id_step=" + id_step + ", order=" + order + ", step_date=" + step_date + ", duration=" + duration
				+ "]";
	}

}
