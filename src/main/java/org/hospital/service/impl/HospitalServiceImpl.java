package org.hospital.service.impl;

import java.util.List;

import org.hospital.dao.HospitalDao;
import org.hospital.model.HospitalForm;
import org.hospital.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HospitalServiceImpl implements HospitalService{
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public List<HospitalForm> getHospitalListService() {
	  List<HospitalForm> hospitalList=hospitalDao.getHospitalList();
		return hospitalList;
	}
    
//	@Override
//	public HospitalForm getHospitalByPnoService(int pno) {
//	    HospitalForm hf=hospitalDao.getHospitalByPno(pno);
//		return hf;
//	}
}
