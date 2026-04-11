package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.GymTrainerDTO;

public class GymTrainerForm extends BaseForm {

	@NotEmpty(message = "trainer name is required")
	private String trainerName;

	@NotEmpty(message = "specialization is required")
	private String specialization;

	@NotNull(message = "salary is required")
	private Double salary;

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		GymTrainerDTO dto = initDTO(new GymTrainerDTO());
		
		dto.setTrainerName(trainerName);
		dto.setSpecialization(specialization);
		dto.setSalary(salary);
		
		return dto;
	}

}
