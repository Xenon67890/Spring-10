package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ResultDTO;

@Repository
public class ResultDAOImpl extends BaseDAOImpl<ResultDTO> implements ResultDAOInt {

	@Override
	public Class<ResultDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ResultDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ResultDTO dto, CriteriaBuilder builder, Root<ResultDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getResultCode())) {
			
			whereCondition.add(builder.like(qRoot.get("resultCode"), dto.getResultCode() + "%"));
		}
		
		if(!isEmptyString(dto.getStudentName())) {
			
			whereCondition.add(builder.like(qRoot.get("studentName"), dto.getStudentName() + "%"));
		}
		
		if(!isZeroNumber(dto.getMarks())) {
			
			whereCondition.add(builder.equal(qRoot.get("marks"), dto.getMarks()) );
		}
		
		if(!isEmptyString(dto.getResultStatus())) {
			
			whereCondition.add(builder.like(qRoot.get("resultStatus"), dto.getResultStatus() + "%"));
		}
		
		return whereCondition;
	}

}
