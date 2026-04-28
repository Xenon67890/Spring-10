package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_venue")
public class VenueDTO extends BaseDTO{

	@Column(name = "venueName", length = 50)
	private String venueName;
	
	@Column(name = "city", length = 50)
	private String city;
	
	@Column(name = "rating", length = 50)
	private String rating;
	
	@Column(name = "capacity", length = 50)
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
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "rating";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return rating;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "rating";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Venue";
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return rating;
	}

}
