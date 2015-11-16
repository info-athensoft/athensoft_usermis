package com.athensoft.ecomm.dao.item;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.athensoft.ecomm.entity.item.Item;

@Component("itemDaoParam")
public class ItemDaoImpl implements ItemDao{
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public List<Item> findAll() {
		String sql = "SELECT item_id,item_code,cata_id,sub_cata_id,item_name,item_desc,item_status, "
				   + "category_name, subcategory_name, status_name "
				   + "FROM view_item_itemclass "
				   + "WHERE 1=1 ";
		return jdbc.query(sql, new ItemRowMapper());
	}
	
	private static class ItemRowMapper implements RowMapper<Item>{
		public Item mapRow(ResultSet rs, int rowNumber) throws SQLException {
			Item x = new Item();
			x.setItemId(rs.getInt("item_id"));
			x.setItemCode(rs.getString("item_code"));
			x.setCategoryId(rs.getInt("cata_id"));
			x.setSubCategoryId(rs.getInt("sub_cata_id"));
			x.setItemName(rs.getString("item_name"));
			x.setItemDesc(rs.getString("item_desc"));
			x.setItemStatus(rs.getInt("item_status"));
			/*joined fields*/
			x.setCategoryName(rs.getString("category_name"));
			x.setSubCategoryName(rs.getString("subcategory_name"));
			x.setItemStatusName(rs.getString("status_name"));
            return x;
		}		
	}
	
}
