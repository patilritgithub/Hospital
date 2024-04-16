package org.hospital.controller;

import java.util.List;

import org.hospital.model.HospitalForm;
import org.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value="hospital")

public class HospitalController {
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping()
	public List<HospitalForm> getHospitalListCtrl(){
		List<HospitalForm> hospitalList= hospitalService.getHospitalListService();
		return hospitalList;
	}
  }
