package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.HealthDAOInt;
import com.rays.dto.HealthDTO;
import com.rays.service.HealthServiceInt;

@Service
public class HealthServiceImpl extends BaseServiceImpl<HealthDTO, HealthDAOInt> implements HealthServiceInt {

}

