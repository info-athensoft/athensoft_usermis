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

import com.athensoft.ecomm.entity.project.ProjectPhaseTaskActivity;

@Component("projectPhaseTaskActivityDaoParam")
public class ProjectPhaseTaskActivityDaoImpl implements ProjectPhaseTaskActivityDao {
	
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
	public List<ProjectPhaseTaskActivity> findProjectDetailById(int projectId) {
		String sql = "SELECT prj_id,prj_code,prj_name,duration_estimated,duration,cost_estimated,cost,prj_status,prj_desc, "
				   +       " phase_id,phase_name,phase_desc,phase_status, "
				   +       " task_id,task_name,task_desc,task_status, "
				   +       " activity_id,activity_name,activity_desc,activity_status,status_name,actor_id "
				   + "FROM view_project_phase_task_activity "
				   + "WHERE 1=1 "
				   + "AND prj_id = :projectId "
				   + "ORDER BY phase_id,task_id,activity_id";
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("projectId", projectId);
		return jdbc.query(sql, paramSource, new ProjectPhaseTaskActivityRowMapper());
	}
	
	private static class ProjectPhaseTaskActivityRowMapper implements RowMapper<ProjectPhaseTaskActivity>{
		public ProjectPhaseTaskActivity mapRow(ResultSet rs, int rowNumber) throws SQLException {
			ProjectPhaseTaskActivity x = new ProjectPhaseTaskActivity();
			x.setProjectId(rs.getInt("prj_id"));
			x.setProjectCode(rs.getString("prj_code"));
			x.setProjectName(rs.getString("prj_name"));
			x.setProjectStatus(rs.getInt("prj_status"));
			//x.setProjectStatusName(rs.getString("status_name"));
			x.setCost(rs.getDouble("cost"));
			x.setDuration(rs.getInt("duration"));
			x.setProjectDesc(rs.getString("prj_desc"));
			
			x.setPhaseId(rs.getInt("phase_id"));
			x.setPhaseName(rs.getString("phase_name"));
			x.setPhaseDesc(rs.getString("phase_desc"));
			x.setPhaseStatus(rs.getInt("phase_status"));
			//x.setPhaseStatusDesc(rs.getString("status_name"));
			
			x.setTaskId(rs.getInt("task_id"));
			x.setTaskName(rs.getString("task_name"));
			x.setTaskDesc(rs.getString("task_desc"));
			x.setTaskStatus(rs.getInt("task_status"));
			//x.setTaskStatusDesc(rs.getString("status_name"));
			
			x.setActivityId(rs.getInt("activity_id"));
			x.setActivityName(rs.getString("activity_name"));
			x.setActivityDesc(rs.getString("activity_desc"));
			x.setActivityStatus(rs.getInt("activity_status"));
			x.setActivityStatusDesc(rs.getString("status_name"));
			x.setActorId(rs.getInt("actor_id"));
            return x;
		}		
	}

}
