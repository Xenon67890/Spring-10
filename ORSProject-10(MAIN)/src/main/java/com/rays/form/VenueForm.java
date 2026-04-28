package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.VenueDTO;

public class VenueForm extends BaseForm {

	@NotEmpty(message = "venue name required")
	private String venueName;

	@NotEmpty(message = "city required")
	private String city;

	@NotEmpty(message = "rating required")
	private String rating;

	@NotNull(message = "capacity required")
	@Min(1)
	private Integer capacity;

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		VenueDTO dto = initDTO(new VenueDTO());
		dto.setCity(city);
		dto.setCapacity(capacity);
		dto.setVenueName(venueName);
		dto.setRating(rating);

		return dto;
	}

}
