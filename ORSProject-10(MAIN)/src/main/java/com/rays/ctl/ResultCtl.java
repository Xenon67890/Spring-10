package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ResultDTO;
import com.rays.form.ResultForm;
import com.rays.service.ResultServiceInt;

@RestController
@RequestMapping(value = "Result")
public class ResultCtl extends BaseCtl<ResultForm, ResultDTO, ResultServiceInt> {

}
