package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_notification")
public class NotificationDTO extends BaseDTO {

	@Column(name = "code", length = 50)
	private String code;
	
	@Column(name = "totalMessages", length = 50)
	private Integer totalMessages;
	
	@Column(name = "processesCount", length = 50)
	private Integer processesCount;
	
	@Column(name = "exportLogId", length = 50)
	private Long exportLogId;
	
	@Column(name = "fileName", length = 50)
	private String fileName;
	
	@Column(name = "status", length = 50)
	private String status;

	public Long getExportLogId() {
		return exportLogId;
	}

	public void setExportLogId(Long exportLogId) {
		this.exportLogId = exportLogId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getTotalMessages() {
		return totalMessages;
	}

	public void setTotalMessages(Integer totalMessages) {
		this.totalMessages = totalMessages;
	}

	public Integer getProcessesCount() {
		return processesCount;
	}

	public void setProcessesCount(Integer processesCount) {
		this.processesCount = processesCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return code;
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
		return "Notification";
	}

}
