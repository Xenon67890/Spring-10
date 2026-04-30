package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_exportLog")
public class ExportLogDTO extends BaseDTO {

	@Column(name = "code", length = 50)
	private String code;

	@Column(name = "fileName", length = 50)
	private String fileName;

	@Column(name = "exportedBy", length = 50)
	private String exportedBy;

	@Column(name = "Status", length = 50)
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

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
		return "Export Log";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return fileName;
	}

}
