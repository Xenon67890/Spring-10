package com.rays.form;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.SystemEventDTO;

public class SystemEventForm extends BaseForm {

	@NotEmpty(message = "eventCode is required")
	private String eventCode;

	@NotEmpty(message = "eventName is required")
	private String eventName;

	@NotNull(message = "eventTime is required")
	private Date eventTime;

	@NotEmpty(message = "status is required")
	private String status;

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		SystemEventDTO dto = initDTO(new SystemEventDTO());
		
		dto.setEventCode(eventCode);
		dto.setEventName(eventName);
		dto.setEventTime(eventTime);
		dto.setStatus(status);
		
		return dto;
	}

}
