package com.athensoft.ecomm.dao.cust;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.athensoft.ecomm.entity.cust.CustomerProfile;

@Component("customerProfileDaoParam")
public class CustomerProfileDaoImpl implements CustomerProfileDao {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	@Override
	public CustomerProfile findByCustId(int custId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static class CustomerProfileRowMapper implements RowMapper<CustomerProfile>{
		public CustomerProfile mapRow(ResultSet rs, int rowNumber) throws SQLException {
			CustomerProfile x = new CustomerProfile();
			//todo
            return x;
		}		
	}

}
