package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.ExportLogDTO;
import com.rays.dto.NotificationDTO;
import com.rays.dto.RoleDTO;
import com.rays.form.NotificationForm;
import com.rays.service.ExportLogServiceInt;
import com.rays.service.NotificationServiceInt;

@RestController
@RequestMapping(value = "Notification")
public class NotificationCtl extends BaseCtl<NotificationForm, NotificationDTO, NotificationServiceInt> {
	
	@Autowired
	ExportLogServiceInt exportservice;
	
	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse resp = new ORSResponse(true);

		List<DropdownList> exportList = exportservice.search(new ExportLogDTO(), userContext);

		resp.addResult("exportList", exportList);

		return resp;
	}

}
