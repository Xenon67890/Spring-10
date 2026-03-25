package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_health")
public class HealthDTO extends BaseDTO {
	
	@Column(name = "healthCode", length = 50)
	private String healthCode ;

	@Column(name = "cpuUsage", length = 50)
	private String cpuUsage;

	@Column(name = "memoryUsage", length = 50)
	private String memoryUsage;

	@Column(name = "healthStatus", length = 50)
	private String healthStatus;

	public String getHealthCode() {
		return healthCode;
	}

	public void setHealthCode(String healthCode) {
		this.healthCode = healthCode;
	}

	public String getCpuUsage() {
		return cpuUsage;
	}

	public void setCpuUsage(String cpuUsage) {
		this.cpuUsage = cpuUsage;
	}

	public String getMemoryUsage() {
		return memoryUsage;
	}

	public void setMemoryUsage(String memoryUsage) {
		this.memoryUsage = memoryUsage;
	}

	public String getHealthStatus() {
		return healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "healthCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return healthCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "healthCode";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Health";
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return healthCode;
	}

}
