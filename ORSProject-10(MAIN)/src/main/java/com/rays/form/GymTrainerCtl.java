package com.rays.form;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.GymTrainerDTO;
import com.rays.service.GymTrainerServiceInt;

@RestController
@RequestMapping(value = "GymTrainer")
public class GymTrainerCtl extends BaseCtl<GymTrainerForm, GymTrainerDTO, GymTrainerServiceInt> {

}
