package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ExportLogDTO;

@Repository
public class ExportLogDAOImpl extends BaseDAOImpl<ExportLogDTO> implements ExportLogDAOInt {

	@Override
	public Class<ExportLogDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return ExportLogDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ExportLogDTO dto, CriteriaBuilder builder, Root<ExportLogDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();
		
		if(!isEmptyString(dto.getCode())) {
			whereCondition.add(builder.like(qRoot.get("code"), dto.getCode() + "%"));
		}
		
		if(!isEmptyString(dto.getFileName())) {
			whereCondition.add(builder.like(qRoot.get("fileName"), dto.getFileName() + "%"));
		}
		
		if(!isEmptyString(dto.getExportedBy())) {
			whereCondition.add(builder.like(qRoot.get("exportedBy"), dto.getExportedBy() + "%"));
		}
		
		if(!isEmptyString(dto.getStatus())) {
			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		
		return whereCondition;
	}

}
