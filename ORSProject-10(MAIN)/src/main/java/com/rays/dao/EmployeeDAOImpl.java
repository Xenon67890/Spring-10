package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.EmployeeDTO;

@Repository
public class EmployeeDAOImpl extends BaseDAOImpl<EmployeeDTO> implements EmployeeDAOInt {

	@Override
	public Class<EmployeeDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return EmployeeDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(EmployeeDTO dto, CriteriaBuilder builder, Root<EmployeeDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isNotNull(dto.getCollegeId())) {
			whereCondition.add(builder.equal(qRoot.get("collegeId"), dto.getCollegeId()));
		}
		if(!isEmptyString(dto.getCity())) {
			whereCondition.add(builder.like(qRoot.get("city"), dto.getCity() + "%"));
		}
		if(!isEmptyString(dto.getCode())) {
			whereCondition.add(builder.like(qRoot.get("code"), dto.getCode() + "%"));
		}
		if(!isEmptyString(dto.getName())) {
			whereCondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}
		if(!isNotNull(dto.getJoining())) {
			whereCondition.add(builder.equal(qRoot.get("joining"), dto.getJoining()));
		}
		return whereCondition;
	}

}
