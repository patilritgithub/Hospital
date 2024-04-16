package org.hospital.service;

import java.util.List;

import org.hospital.model.HospitalForm;
import org.springframework.stereotype.Service;

public interface HospitalService {
	List<HospitalForm> getHospitalListService();
	//HospitalForm getHospitalByPnoService(int pno);
  }
