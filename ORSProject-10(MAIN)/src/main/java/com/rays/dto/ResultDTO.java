package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_result")
public class ResultDTO extends BaseDTO {
	
	@Column(name = "resultCode", length = 50 )
	private String resultCode;
	
	@Column(name = "studentName", length = 50 )
	private String studentName;
	
	@Column(name = "marks", length = 50 )
	private Integer marks;
	
	@Column(name = "resultStatus", length = 50 )
	private String resultStatus;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "resultCode";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return resultCode;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "resultCode";
	}

	@Override
	public String getTableName() {
		// TODO Auto-generated method stub
		return "Result";
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return resultCode;
	}
}
