package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SystemEventDTO;
import com.rays.form.SystemEventForm;
import com.rays.service.SystemEventServiceInt;

@RestController
@RequestMapping(value = "SystemEvent")
public class SystemEventCtl extends BaseCtl<SystemEventForm, SystemEventDTO, SystemEventServiceInt>{

}
