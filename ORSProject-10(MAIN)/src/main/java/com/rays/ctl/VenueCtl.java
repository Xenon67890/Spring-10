package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.VenueDTO;
import com.rays.form.VenueForm;
import com.rays.service.VenueServiceInt;

@RestController
@RequestMapping(value = "Venue")
public class VenueCtl extends BaseCtl<VenueForm, VenueDTO, VenueServiceInt> {

	@GetMapping("preload")
	public ORSResponse preload() {

		ORSResponse resp = new ORSResponse(true);

		HashMap<String, Object> map = new HashMap<>();

		String[] ratingList = { "1", "2", "3", "4", "5" };

		map.put("ratingList", ratingList);

		resp.setResult(map);

		return resp;
	}

}
