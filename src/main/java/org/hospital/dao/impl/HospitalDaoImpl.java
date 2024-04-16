package org.hospital.dao.impl;

import java.util.List;

import org.hospital.dao.HospitalDao;
import org.hospital.extractor.HospitalExtractor;
import org.hospital.extractor.HospitalListExtractor;
import org.hospital.model.HospitalForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;
@Repository
@AllArgsConstructor
public class HospitalDaoImpl implements HospitalDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private HospitalListExtractor hospitalListExtractor;
	@Autowired
    private HospitalExtractor hospitalExtractor;
	

	@Override
	public List<HospitalForm> getHospitalList() {
		List<HospitalForm> hospitalList=jdbcTemplate.query("Select * from hospital", hospitalListExtractor::extractData);
	    return hospitalList;
	}




//    @Override
//	public HospitalForm getHospitalByPno(int pno) {
//    	HospitalForm hf=jdbcTemplate.query("Select * from hospital where pno= " + pno, hospitalExtractor::extractData);
//		return hf;
//	}
}
