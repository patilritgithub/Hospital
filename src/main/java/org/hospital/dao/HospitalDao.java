package org.hospital.dao;

import java.util.List;

import org.hospital.model.HospitalForm;

public interface HospitalDao {
	List<HospitalForm> getHospitalList();
    //HospitalForm getHospitalByPno(int pno);
    }
