package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ExportLogDTO;
import com.rays.form.ExportLogForm;
import com.rays.service.ExportLogServiceInt;

@RestController
@RequestMapping(value = "ExportLog")
public class ExportLogCtl extends BaseCtl<ExportLogForm, ExportLogDTO, ExportLogServiceInt> {

}
