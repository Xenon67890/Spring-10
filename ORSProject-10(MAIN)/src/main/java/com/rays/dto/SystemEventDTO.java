package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_systemEvent")
public class SystemEventDTO extends BaseDTO{
	
	@Column(name = "eventCode")
	private String eventCode;

	@Column(name = "eventName")
	private String eventName;

	@Column(name = "eventTime")
	private Date eventTime;
	
	@Column(name = "status")
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
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "eventCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return eventCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "eventCode";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "System Event";
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return eventCode;
	}

}
