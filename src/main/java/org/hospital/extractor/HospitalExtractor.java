package org.hospital.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.hospital.model.HospitalForm;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

@Component
public class HospitalExtractor implements ResultSetExtractor <HospitalForm> {

	@Override
	public HospitalForm extractData(ResultSet rs) throws SQLException, DataAccessException {
		HospitalForm hf=null;
		
		while(rs.next()) {
			hf = new HospitalForm();
			hf.setPno(rs.getInt("pno"));
			hf.setPname(rs.getString("pname"));
			hf.setPdate(rs.getString("pdate"));
		}
		return hf;
		}
	
	

}
