package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BatchDAOInt;
import com.rays.dto.BatchDTO;

@Service
public class BatchServiceImpl extends BaseServiceImpl<BatchDTO, BatchDAOInt> implements BatchServiceInt {

}
