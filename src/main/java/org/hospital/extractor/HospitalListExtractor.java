package org.hospital.extractor;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hospital.model.HospitalForm;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
@Component
public class HospitalListExtractor implements ResultSetExtractor<List<HospitalForm>>{

	@Override
	public List<HospitalForm> extractData(ResultSet rs) throws SQLException, DataAccessException {
		 List<HospitalForm> hospitalList=new ArrayList();
		    HospitalForm hf=  null;  
		    
		    while(rs.next()) {
		      hf = new HospitalForm();
		      hf.setPno(rs.getInt("pno"));
		      hf.setPname(rs.getString("pname"));
		      hf.setPdate(rs.getString("pdate"));
		      hospitalList.add(hf);
			}
		return hospitalList;
	}
}

	

    
    
