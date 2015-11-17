package com.athensoft.ecomm.dao.finance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.athensoft.ecomm.entity.finance.Invoice;

@Component("InvoiceDaoParam")
public class InvoiceDaoImpl implements InvoiceDao{
	
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Invoice> findAll(){
		String sql = "SELECT inv_id,inv_no,inv_desc,date_issued,date_due,inv_terms,inv_status,cust_id,bill_addr_id,ship_addr_id,inv_subtotal,discount_amt,total_before_tax,gst_hst_amt,qst_pst_amt,inv_grand_total "
				   + "FROM invoice "
				   + "WHERE 1=1 ";
//				   + "AND addr_type = 2";
		return jdbc.query(sql, new InvoiceRowMapper());
	}
	
	public List<Invoice> findAllByCustId(int custId){
		String sql = "SELECT inv_id,inv_no,inv_desc,date_issued,date_due,inv_terms,inv_status,cust_id,bill_addr_id,ship_addr_id,inv_subtotal,discount_amt,total_before_tax,gst_hst_amt,qst_amt,inv_grand_total "
				   + "FROM invoice "
				   + "WHERE 1=1 "
				   + "AND cust_id = :cust_id";
	    MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("cust_id", custId);
		return jdbc.query(sql, paramSource, new InvoiceRowMapper());
	}
	
	private static class InvoiceRowMapper implements RowMapper<Invoice>{
		public Invoice mapRow(ResultSet rs, int rowNumber) throws SQLException {
			Invoice x = new Invoice();
			x.setInvoiceId(rs.getLong("inv_id"));
			x.setInvoiceNum(rs.getString("inv_no"));
			x.setInvoiceDesc(rs.getString("inv_desc"));
			x.setIssuedDate(rs.getDate("date_issued"));
			x.setDueDate(rs.getDate("ddate_due"));
			x.setInvoiceTerms(rs.getString("inv_terms"));
			x.setInvoiceStatus(rs.getInt("inv_status"));
			x.setCustId(rs.getInt("cust_id"));
			x.setBillAddrId(rs.getInt("bill_addr_id"));
			x.setShipAddrId(rs.getInt("ship_addr_id"));
			//
			//todo
			//
			x.setInvoiceGrandTotal(rs.getDouble("inv_grand_total"));
			
            return x;
		}		
	}
	
}
