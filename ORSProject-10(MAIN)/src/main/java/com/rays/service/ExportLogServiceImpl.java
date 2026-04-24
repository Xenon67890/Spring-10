package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ExportLogDAOInt;
import com.rays.dto.ExportLogDTO;

@Service
public class ExportLogServiceImpl extends BaseServiceImpl<ExportLogDTO, ExportLogDAOInt> implements  ExportLogServiceInt {

}
