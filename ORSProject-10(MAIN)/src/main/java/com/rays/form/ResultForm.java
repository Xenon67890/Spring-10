package com.rays.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ResultDTO;

public class ResultForm extends BaseForm {
	
	@NotEmpty(message = "Result code is required")
	private String resultCode;
	
	@NotEmpty(message = "Student name is required")
	private String studentName;
	
	@NotNull(message = "Marks is required")
	@Min(1)
	private Integer marks;
	
	@NotEmpty(message = "Result Status is required")
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
	public BaseDTO getDto() {
		// TODO Auto-generated method stub
		ResultDTO dto = initDTO(new ResultDTO());
		
		dto.setResultCode(resultCode);
		dto.setStudentName(studentName);
		dto.setMarks(marks);
		dto.setResultStatus(resultStatus);
		
		return dto;
	}
}
