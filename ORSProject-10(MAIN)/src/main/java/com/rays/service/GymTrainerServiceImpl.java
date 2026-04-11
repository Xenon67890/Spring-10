package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GymTrainerDAOInt;
import com.rays.dto.GymTrainerDTO;

@Service
public class GymTrainerServiceImpl extends BaseServiceImpl<GymTrainerDTO, GymTrainerDAOInt> implements GymTrainerServiceInt{

}
