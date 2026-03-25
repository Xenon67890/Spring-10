package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.common.BaseDAOInt;
import com.rays.dao.HealthDAOInt;
import com.rays.dto.HealthDTO;

@Repository
public class HealthDAOImpl extends BaseDAOImpl<HealthDTO> implements HealthDAOInt  {

	@Override
	public Class<HealthDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return HealthDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(HealthDTO dto, CriteriaBuilder builder, Root<HealthDTO> qRoot) {
	    List<Predicate> whereCondition = new ArrayList<Predicate>();
	    
	    // 1. Check Health Code
	    if (!isEmptyString(dto.getHealthCode())) {
	        whereCondition.add(builder.like(qRoot.get("healthCode"), dto.getHealthCode() + "%"));
	    }
	    
	    // 2. Check CPU Usage (Fixed Parentheses)
	    if (!isEmptyString(dto.getCpuUsage())) {
	        whereCondition.add(builder.like(qRoot.get("cpuUsage"), dto.getCpuUsage() + "%"));
	    }
	    
	    // 3. Check Memory Usage (Fixed Parentheses)
	    if (!isEmptyString(dto.getMemoryUsage())) {
	        whereCondition.add(builder.like(qRoot.get("memoryUsage"), dto.getMemoryUsage() + "%"));
	    }
	    
	    // 4. Check Health Status (Fixed Parentheses)
	    if (!isEmptyString(dto.getHealthStatus())) {
	        whereCondition.add(builder.like(qRoot.get("healthStatus"), dto.getHealthStatus() + "%"));
	    }
	    
	    return whereCondition;
	}

}

