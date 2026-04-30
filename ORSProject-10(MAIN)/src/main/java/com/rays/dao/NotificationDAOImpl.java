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
import com.rays.dto.ExportLogDTO;
import com.rays.dto.NotificationDTO;
import com.rays.dto.RoleDTO;
import com.rays.dto.UserDTO;

@Repository
public class NotificationDAOImpl extends BaseDAOImpl<NotificationDTO> implements NotificationDAOInt {

	@Autowired
	ExportLogDAOInt exportLog;

	@Override
	public Class<NotificationDTO> getDTOClass() {
		// TODO Auto-generated method stub
		return NotificationDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(NotificationDTO dto, CriteriaBuilder builder,
			Root<NotificationDTO> qRoot) {
		// TODO Auto-generated method stub
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getCode())) {

			whereCondition.add(builder.like(qRoot.get("code"), dto.getCode() + "%"));
		}
		if (!isEmptyString(dto.getFileName())) {

			whereCondition.add(builder.like(qRoot.get("fileName"), dto.getFileName() + "%"));
		}
		if (!isZeroNumber(dto.getExportLogId())) {

			whereCondition.add(builder.equal(qRoot.get("exportLogId"), dto.getExportLogId()));
		}
		if (!isZeroNumber(dto.getProcessesCount())) {

			whereCondition.add(builder.equal(qRoot.get("processesCount"), dto.getProcessesCount()));
		}
		if (!isZeroNumber(dto.getTotalMessages())) {

			whereCondition.add(builder.equal(qRoot.get("totalMessages"), dto.getTotalMessages()));
		}
		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.equal(qRoot.get("status"), dto.getStatus()));
		}
		return whereCondition;
	}

	@Override
	protected void populate(NotificationDTO dto, UserContext userContext) {
		System.out.println("role id===== " + dto.getExportLogId());
		if (dto.getExportLogId() != null && dto.getExportLogId() > 0) {
			ExportLogDTO roleDto = exportLog.findByPK(dto.getExportLogId(), userContext);
			dto.setFileName(roleDto.getFileName());
		}

	}

}