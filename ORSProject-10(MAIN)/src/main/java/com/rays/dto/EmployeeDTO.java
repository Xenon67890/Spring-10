package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_employee")
public class EmployeeDTO extends BaseDTO {
	
	@Column(name = "code", length = 50)
	private String code;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "collegeId", length = 50)
	private Long collegeId;
	
	@Column(name = "city", length = 50)
	private String city;
	
	@Column(name = "joining", length = 50)
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
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "code";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return code;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "code";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Employee";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return code;
	}
	
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return id+"";
	}
}
