package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.UserContext;
import com.rays.dto.BatchDTO;
import com.rays.dto.CourseDTO;
import com.rays.dto.ExportLogDTO;
import com.rays.dto.NotificationDTO;

@Repository
public class BatchDAOImpl extends BaseDAOImpl<BatchDTO> implements BatchDAOInt {
	
	@Autowired
	CourseDAOInt courseLog;

	@Override
	public Class<BatchDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return BatchDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BatchDTO dto, CriteriaBuilder builder, Root<BatchDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCode())) {

			whereCondition.add(builder.like(qRoot.get("code"), dto.getCode() + "%"));
		}
		if (!isEmptyString(dto.getCourseName())) {

			whereCondition.add(builder.like(qRoot.get("courseName"), dto.getCourseName() + "%"));
		}
		if (!isZeroNumber(dto.getCourseId())) {

			whereCondition.add(builder.equal(qRoot.get("courseId"), dto.getCourseId()));
		}
		if (!isEmptyString(dto.getName())) {

			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}
		if (!isZeroNumber(dto.getRecords())) {

			whereCondition.add(builder.equal(qRoot.get("records"), dto.getRecords()));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.equal(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}
	
	@Override
	protected void populate(BatchDTO dto, UserContext userContext) {
	
		if (dto.getCourseId() != null && dto.getCourseId() > 0) {
			CourseDTO roleDto = courseLog.findByPK(dto.getCourseId(), userContext);
			dto.setCourseName(roleDto.getName());
		}

	}

}
