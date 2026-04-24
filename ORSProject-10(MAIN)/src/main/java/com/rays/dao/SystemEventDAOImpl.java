package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.SystemEventDTO;

@Repository
public class SystemEventDAOImpl extends BaseDAOImpl<SystemEventDTO> implements SystemEventDAOInt {

	@Override
	public Class<SystemEventDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return SystemEventDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(SystemEventDTO dto, CriteriaBuilder builder, Root<SystemEventDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getEventCode())) {
			whereCondition.add(builder.like(qRoot.get("eventCode"), dto.getEventCode() + "%"));
		}
		if(!isEmptyString(dto.getEventName())) {
			whereCondition.add(builder.like(qRoot.get("eventName"), dto.getEventName() + "%"));
		}
		if(isNotNull(dto.getEventTime())) {
			whereCondition.add(builder.like(qRoot.get("eventTime"), dto.getEventCode()));
		}
		if(!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		return whereCondition;
	}

}
