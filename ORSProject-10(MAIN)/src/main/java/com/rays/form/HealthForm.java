package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.HealthDTO;

public class HealthForm extends BaseForm {
	
	@NotEmpty(message = "Health code is required")
	private String healthCode ;

	@NotEmpty(message = "CPU usage is required")
	private String cpuUsage;

	@NotEmpty(message = "Memory usage is required")
	private String memoryUsage;

	@NotEmpty(message = "Health Stauts is required")
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
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		HealthDTO dto = initDTO(new HealthDTO());
		
		dto.setHealthCode(healthCode);
		dto.setCpuUsage(cpuUsage);
		dto.setMemoryUsage(memoryUsage);
		dto.setHealthStatus(healthStatus);
		
		return dto;
	}

}
