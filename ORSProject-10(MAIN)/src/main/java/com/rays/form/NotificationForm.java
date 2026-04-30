package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.NotificationDTO;

public class NotificationForm extends BaseForm {

	@NotEmpty(message = "code required")
	private String code;

	@NotNull(message = "totalMessages required")
	private Integer totalMessages;

	@NotNull(message = "processesCount required")
	private Integer processesCount;

	@NotNull(message = "exportLogId required")
	private Long exportLogId;

	
	private String fileName;

	@NotEmpty(message = "status required")
	private String status;

	public String getCode() {
		return code;
	}

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
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		NotificationDTO dto = initDTO(new NotificationDTO());
		
		dto.setCode(code);
		dto.setExportLogId(exportLogId);
		dto.setFileName(fileName);
		dto.setProcessesCount(processesCount);
		dto.setStatus(status);
		dto.setTotalMessages(totalMessages);
		
		return dto;
	}

}
