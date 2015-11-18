package com.athensoft.ecomm.dao.project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.athensoft.ecomm.entity.project.Requirement;

@Component("requirementDaoParam")
public class RequirementDaoImpl implements RequirementDao {
	
	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public List<Requirement> findAll() {
		String sql = "SELECT req_id,prj_id,req_type1,req_type2,req_no,req_location,req_target,req_desc,request_role, request_date, req_status "
				   + "FROM project_requirement "
				   + "WHERE 1=1 ";
//				   + "AND addr_type = 1";
		return jdbc.query(sql, new RequirementRowMapper());
	}

	@Override
	public List<Requirement> findAllByProjectId(int projectId) {
		String sql = "SELECT req_id,prj_id,req_type1,req_type2,req_no,req_location,req_target,req_desc,request_role, request_date, req_status "
				   + "FROM project_requirement "
				   + "WHERE 1=1 "
				   + "AND prj_id = :prj_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("prj_id", projectId);
		return jdbc.query(sql, paramSource, new RequirementRowMapper());
	}

	@Override
	public Requirement findByReqId(long reqId) {
		String sql = "SELECT req_id,prj_id,req_type1,req_type2,req_no,req_location,req_target,req_desc,request_role, request_date,req_status "
				   + "FROM project_requirement "
				   + "WHERE 1=1 "
				   + "AND req_id = :prj_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("req_id", reqId);
		return jdbc.queryForObject(sql, paramSource, new RequirementRowMapper());
	}

	@Override
	public long create(Requirement x) {
		String sql = "INSERT INTO project_requirement(prj_id,req_type1,req_type2,req_no,req_location,req_target,req_desc,request_role, request_date,req_status) "
				   + "VALUES(:prj_id,:req_type1,:req_type2,:req_no,:req_location,:req_target,:req_desc,:request_role, :request_date,:req_status)";
		
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("prj_id", x.getProjectId());
		paramSource.addValue("req_type1", x.getReqType1());
		paramSource.addValue("req_type2", x.getReqType2());
		paramSource.addValue("req_no", x.getReqNum());
		paramSource.addValue("req_location", x.getReqLocation());
		paramSource.addValue("req_target", x.getReqTarget());
		paramSource.addValue("req_desc", x.getReqDesc());
		paramSource.addValue("request_role", x.getRequestRole());
		paramSource.addValue("request_date", x.getRequestDate());
		paramSource.addValue("req_status", x.getReqStatus());

		KeyHolder keyholder=new GeneratedKeyHolder();
		jdbc.update(sql, paramSource, keyholder);
		
		//get generated primary key
		long pk =keyholder.getKey().intValue();  
		
		return pk;
	}

	@Override
	public void update(Requirement x) {
		String sql = "UPDATE project_requirement SET "
				   + "prj_id = :prj_id, "
				   + "req_type1 = :req_type1, "
				   + "req_type2 = :req_type2, "
				   + "req_no = :req_no, "
				   + "req_location = :req_location, "
				   + "req_target = :req_target, "
				   + "req_desc = :req_desc, "
				   + "request_role = :request_role, "
				   + "request_date = :request_date, "
				   + "req_status = :req_status "
				   + "WHERE 1=1 "
				   + "AND req_id = :req_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();		
		paramSource.addValue("prj_id", x.getProjectId());
		paramSource.addValue("req_type1", x.getReqType1());
		paramSource.addValue("req_type2", x.getReqType2());
		paramSource.addValue("req_no", x.getReqNum());
		paramSource.addValue("req_location", x.getReqLocation());
		paramSource.addValue("req_target", x.getReqTarget());
		paramSource.addValue("req_desc", x.getReqDesc());
		paramSource.addValue("request_role", x.getRequestRole());
		paramSource.addValue("request_date", x.getRequestDate());
		paramSource.addValue("req_status", x.getReqStatus());
		paramSource.addValue("req_id", x.getReqId());
		
		jdbc.update(sql, paramSource);

	}
	
	@Override
	public void updateStatus(Requirement x) {
		String sql = "UPDATE project_requirement SET "
				   + "req_status = :req_status "
				   + "WHERE 1=1 "
				   + "AND req_id = :req_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("req_status", x.getReqStatus());
		paramSource.addValue("req_id", x.getReqId());
		
		jdbc.update(sql, paramSource);
	}

	@Override
	public void delete(Requirement x) {
		String sql = "DELETE FROM project_requirement "
				   + "WHERE 1=1 "
				   + "AND req_id = :req_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("req_id", x.getReqId());
		
		jdbc.update(sql, paramSource);
	}

	@Override
	public void delete(long reqId) {
		String sql = "DELETE FROM project_requirement "
				   + "WHERE 1=1 "
				   + "AND req_id = :req_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("req_id", reqId);
		
		jdbc.update(sql, paramSource);

	}
	
	private static class RequirementRowMapper implements RowMapper<Requirement>{
		public Requirement mapRow(ResultSet rs, int rowNumber) throws SQLException {
			Requirement x = new Requirement();
			x.setReqId(rs.getLong("req_id"));
			x.setProjectId(rs.getInt("prj_id"));
			x.setReqType1(rs.getInt("req_type1"));
			x.setReqType2(rs.getInt("req_type2"));
			x.setReqNum(rs.getString("req_no"));
			x.setReqLocation(rs.getString("req_location"));
			x.setReqTarget(rs.getString("req_target"));
			x.setReqDesc(rs.getString("req_desc"));
			x.setRequestRole(rs.getInt("request_role"));
			x.setRequestDate(rs.getDate("request_date"));
			x.setReqStatus(rs.getInt("req_status"));
            return x;
		}		
	}

}
