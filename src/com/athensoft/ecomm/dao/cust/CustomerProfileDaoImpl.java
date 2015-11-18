package com.athensoft.ecomm.dao.cust;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.athensoft.ecomm.entity.cust.CustBasicInfo;
import com.athensoft.ecomm.entity.cust.CustContactInfo;
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
		String sql= "SELECT account_id,f_name,l_name,nick_name,title,gender,dob_year,dob_month,dob_day,email_1 "
		   + "FROM cust_profile "
		   + "WHERE account_id = :cutomer_id ";
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("cutomer_id", custId);
		return jdbc.queryForObject(sql, param, new CustomerProfileRowMapper());
	}
	
	private static class CustomerProfileRowMapper implements RowMapper<CustomerProfile>{
		public CustomerProfile mapRow(ResultSet rs, int rowNumber) throws SQLException {
			CustomerProfile x = new CustomerProfile();
			
			//populate custBasicInfo
			CustBasicInfo custBasicInfo = new CustBasicInfo();
				custBasicInfo.setAccountId(rs.getLong("account_id"));
				custBasicInfo.setFirstName(rs.getString("f_name"));
				custBasicInfo.setLastName(rs.getString("l_name"));
				custBasicInfo.setNickName(rs.getString("nick_name"));
				custBasicInfo.setGender(rs.getString("gender"));
				custBasicInfo.setDobDay(rs.getInt("dob_day"));
				custBasicInfo.setDobMonth(rs.getInt("dob_month"));
				custBasicInfo.setDobYear(rs.getInt("dob_year"));
			x.setCustBasicInfo(custBasicInfo);
			
			//populate custContactInfo
			CustContactInfo custContactInfo = new CustContactInfo();
				custContactInfo.setAccountId(rs.getLong("account_id"));
				custContactInfo.setTitle(rs.getString("title"));
				custContactInfo.setEmail1(rs.getString("email_1"));
//				custContactInfo.setEmail2(rs.getString("email_2"));
//				custContactInfo.setPhone1(rs.getString("phone_1"));
//				custContactInfo.setPhone1_Ext(rs.getString("phone_1_ext"));
//				custContactInfo.setPhone2(rs.getString("phone_2"));
//				custContactInfo.setPhone2_Ext(rs.getString("phone_2_ext"));
//				custContactInfo.setCellPhone(rs.getString("phone_cell"));
//				custContactInfo.setStreeNum(rs.getString("st_no"));
//				custContactInfo.setStreeName(rs.getString("st_name"));
//				custContactInfo.setRoomType(rs.getInt("room_type"));
//				custContactInfo.setRoomNum(rs.getString("room_no"));
//				custContactInfo.setDistrictCode(rs.getString("district_code"));
//				custContactInfo.setCityCode(rs.getString("city_code"));
//				custContactInfo.setProvinceCode(rs.getString("province_code"));
//				custContactInfo.setPostalCode(rs.getString("postal_code"));
//				custContactInfo.setCountryCode(rs.getString("country_code"));
//				custContactInfo.setCompanyName(rs.getString("company_name"));
//				custContactInfo.setCompanyPosition(rs.getString("company_position"));
			x.setCustContactInfo(custContactInfo);
			
			//return 
			return x;
		}		
	}

}
