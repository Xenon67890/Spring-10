package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_batch")
public class BatchDTO extends BaseDTO {
	 
	@Column(name = "code", length = 50)
	private String code;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "records", length = 50)
	private Integer records;
	
	@Column(name = "courseId", length = 50)
	private Long courseId;
	
	@Column(name = "courseName", length = 50)
	private String courseName;
	
	@Column(name = "status", length = 50)
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
		return "Batch";
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return code;
	}
	

}
