package com.rays.form;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ExportLogDTO;

public class ExportLogForm extends BaseForm {

	@NotEmpty(message = "code is required")
	private String code;

	@NotEmpty(message = "fileName is required")
	private String fileName;

	@NotEmpty(message = "exportedBy is required")
	private String exportedBy;

	@NotEmpty(message = "Status is required")
	private String status;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getExportedBy() {
		return exportedBy;
	}

	public void setExportedBy(String exportedBy) {
		this.exportedBy = exportedBy;
	}

	@Override
	public BaseDTO getDto() {
		// TODO Auto-generated method stub

		ExportLogDTO dto = initDTO(new ExportLogDTO());

		dto.setCode(code);
		dto.setFileName(fileName);
		dto.setStatus(status);
		dto.setExportedBy(exportedBy);

		return dto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
