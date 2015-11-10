package com.athensoft.ecomm.dao.cust;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.athensoft.ecomm.entity.cust.BillAddress;
import com.athensoft.ecomm.entity.shopping.ItemCart;

@Component("billAddressDaoParam")
public class BillAddressDaoImpl implements BillAddressDao{
	
	private NamedParameterJdbcTemplate jdbc;

	/**
	 * inject DataSource object
	 * @param dataSource
	 */
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public List<BillAddress> findAll() {
		String sql = "SELECT addr_id,st_no,st_name,room_type,room_no,district_code,city_code,province_code,postal_code,country_code "
				   + "FROM cust_address "
				   + "WHERE 1=1 "
				   + "AND addr_type = 1";
		return jdbc.query(sql, new BillAddressRowMapper());
	}
	
	private static class BillAddressRowMapper implements RowMapper<BillAddress>{
		public BillAddress mapRow(ResultSet rs, int rowNumber) throws SQLException {
			BillAddress x = new BillAddress();
			x.setAddressId(rs.getLong("addr_id"));
			x.setStreeNum(rs.getString("st_no"));
			x.setStreeName(rs.getString("st_name"));
			x.setRoomType(rs.getInt("room_type"));
			x.setRoomNum(rs.getString("room_no"));
			x.setDistrictCode(rs.getString("district_code"));
			x.setCityCode(rs.getString("city_code"));
			x.setProvinceCode(rs.getString("province_code"));
			x.setPostalCode(rs.getString("postal_code"));
			x.setCountryCode(rs.getString("country_code"));
            return x;
		}		
	}

}
