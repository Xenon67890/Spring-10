package com.rays.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BatchDTO;

public class BatchForm extends BaseForm {

	@NotEmpty(message = "code required")
	private String code;

	@NotEmpty(message = "name required")
	private String name;

	@NotNull(message = "records required")
	private Integer records;

	@NotNull(message = "courseId required")
	private Long courseId;

	
	private String courseName;

	@NotEmpty(message = "status required")
	private String status;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
		BatchDTO dto = initDTO(new BatchDTO());
		
		dto.setCode(code);
		dto.setName(courseName);
		dto.setCourseId(courseId);
		dto.setStatus(status);
		dto.setCourseName(courseName);;
		dto.setRecords(records);
		
		return dto;
	}

}
