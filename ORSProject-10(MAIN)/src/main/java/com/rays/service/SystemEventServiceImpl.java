package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.SystemEventDAOInt;
import com.rays.dto.SystemEventDTO;

@Service
public class SystemEventServiceImpl extends BaseServiceImpl<SystemEventDTO, SystemEventDAOInt> implements SystemEventServiceInt {

}
