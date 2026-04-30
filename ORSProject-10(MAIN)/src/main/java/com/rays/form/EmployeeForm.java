package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.EmployeeDTO;

public class EmployeeForm extends BaseForm {

	@NotEmpty(message = "code required")
	private String code;

	@NotEmpty(message = "code required")
	private String name;

	
	private Long collegeId;

	@NotEmpty(message = "city required")
	private String city;

	@NotNull(message = "Date of joining is required")
	private Date joining;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getJoining() {
		return joining;
	}

	public void setJoining(Date joining) {
		this.joining = joining;
	}

	@Override
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		EmployeeDTO dto = initDTO(new EmployeeDTO());

		dto.setCode(code);
		dto.setName(name);
		dto.setCity(city);
		dto.setCollegeId(collegeId);
		dto.setJoining(joining);
		
		return dto;
	}
}
