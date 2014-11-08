package com.target.trak.system.persistence.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.target.trak.system.domain.matters.MatterEntity;
import com.target.trak.system.persistence.MatterDao;

@Repository
public class MatterDaoImpl implements MatterDao {

	private NamedParameterJdbcTemplate matterTemplate;

	@Autowired
	@Qualifier("matterQueries")
	private Properties matterQueries;

	@Autowired
	public MatterDaoImpl(DataSource dataSource) {
		matterTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public MatterEntity insertMatter(final MatterEntity matter) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("matterTypeId", matter.getMatterType().getId());
		paramSource.addValue("primaryContactId", matter.getPrimaryContact().getId());
		paramSource.addValue("matterStatus", matter.getStatus());
		paramSource.addValue("createDate", matter.getCreateDate());
		paramSource.addValue("completionDate", matter.getCompletionDate());
		paramSource.addValue("createdBy", matter.getCreatedBy());
		paramSource.addValue("lastUpdatedBy", matter.getLastUpdatedBy());
		paramSource.addValue("lastUpdatedDate", matter.getLastUpdatedDate());
		paramSource.addValue("slaDate", matter.getServiceLevelAgrementDate());

		String sql = matterQueries.getProperty("insertMatterSql");
		int count = matterTemplate.update(sql, paramSource, keyHolder);

		if (count > 0) {
			final Long newKey = keyHolder.getKey().longValue();
			matter.setId(newKey.longValue());
		} else {
			throw new RuntimeException("Company Data was not created");
		}
		return matter;
	}

	@Override
	public MatterEntity selectMatterById(final MatterEntity matter) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("id", matter.getId());
		String sql = matterQueries.getProperty("getMatterByIdSql");
		return matterTemplate.queryForObject(sql, paramSource, new MatterRowMapper());
	}

	@Override
	public List<MatterEntity> getAllMatters() {
		String sql = matterQueries.getProperty("getAllMattersSql");
		return matterTemplate.query(sql, new MatterRowMapper());
	}

	@Override
	public MatterEntity updateMatter(final MatterEntity matter) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("primaryContactId", matter.getPrimaryContact().getId());
		paramSource.addValue("matterStatus", matter.getStatus());
		paramSource.addValue("completionDate", matter.getCompletionDate());
		paramSource.addValue("lastUpdatedBy", matter.getLastUpdatedBy());
		paramSource.addValue("lastUpdatedDate", matter.getLastUpdatedDate());
		paramSource.addValue("slaDate", matter.getServiceLevelAgrementDate());

		String sql = matterQueries.getProperty("updateMatterSql");
		int count = matterTemplate.update(sql, paramSource);

		if (count < 1) {
			throw new RuntimeException("Error updating matter");
		}
		return matter;
	}

	@Override
	public MatterEntity inactivateMatter(final MatterEntity matter) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("id", matter.getId());
		String sql = matterQueries.getProperty("inactivateMatterSql");

		int count = matterTemplate.update(sql, paramSource);

		if (count < 1) {
			throw new RuntimeException("Error inactivating matter");
		}
		return matter;
	}

	@Override
	public List<MatterEntity> getInactiveMatters() {
		String sql = matterQueries.getProperty("getInactiveMattersSql");
		return matterTemplate.query(sql, new MatterRowMapper());
	}

	@Override
	public int getNumberOfActiveMatters() {
		String sql = matterQueries.getProperty("");
		//int count = matterTemplate.queryForObject(sql, null, Integer.class);
		return 0;
	}

	private final class MatterRowMapper implements RowMapper<MatterEntity> {

		@Override
		public MatterEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
			MatterEntity entity = new MatterEntity();
			return entity;
		}

	}
}
