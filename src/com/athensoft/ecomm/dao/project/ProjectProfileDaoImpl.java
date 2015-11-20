package com.athensoft.ecomm.dao.project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.athensoft.ecomm.entity.project.ProjectProfile;

@Component("projectProfileDaoParam")
public class ProjectProfileDaoImpl implements ProjectProfileDao {
	
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
	public List<ProjectProfile> findAll() {
		String sql = "SELECT prj_id,prj_code,prj_seqno,prj_name,duration_estimated,duration,cost_estimated,cost,prj_status,prj_desc,status_name "
				   + "FROM view_project_profile "
				   + "WHERE 1=1 ";
//				   + "AND addr_type = 1";
		return jdbc.query(sql, new ProjectProfileRowMapper());
	}
	
	@Override
	public List<ProjectProfile> findByCustId(int custId) {
		String sql = "SELECT prj_id,prj_code,prj_seqno,prj_name,duration_estimated,duration,cost_estimated,cost,prj_status,prj_desc,status_name, "
				   	      + "account_id "
				   + "FROM view_project_profile_cust "
				   + "WHERE 1=1 "
				   + "AND account_id = :account_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("account_id", custId);
		return jdbc.query(sql, paramSource, new ProjectProfileRowMapper());
	}

	private static class ProjectProfileRowMapper implements RowMapper<ProjectProfile>{
		public ProjectProfile mapRow(ResultSet rs, int rowNumber) throws SQLException {
			ProjectProfile x = new ProjectProfile();
			x.setProjectId(rs.getInt("prj_id"));
			x.setProjectCode(rs.getString("prj_code"));
			x.setProjectSeqno(rs.getInt("prj_seqno"));
			x.setProjectName(rs.getString("prj_name"));
			x.setProjectStatus(rs.getInt("prj_status"));
			x.setProjectStatusName(rs.getString("status_name"));
			x.setCost(rs.getDouble("cost"));
			x.setDuration(rs.getInt("duration"));
			x.setProjectDesc(rs.getString("prj_desc"));
            return x;
		}		
	}

}
