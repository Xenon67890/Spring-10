package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_gymTrainer")
public class GymTrainerDTO extends BaseDTO {
	
	@Column(name = "trainerName", length = 50)
	private String trainerName;
	
	@Column(name = "specialization", length = 50)
	private String specialization;
	
	@Column(name = "salary", length = 50)
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
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "specialization";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return specialization;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "specialization";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Gym Trainer";
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return specialization;
	}

}
