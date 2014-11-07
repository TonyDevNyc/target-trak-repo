package com.target.trak.system.persistence.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.target.trak.system.domain.matters.MatterEntity;
import com.target.trak.system.persistence.MatterDao;

@Repository
public class MatterDaoImpl implements MatterDao {

	private NamedParameterJdbcTemplate matterTemplate;
	
	@Autowired
	public MatterDaoImpl(DataSource dataSource) {
		matterTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public MatterEntity insertMatter(final MatterEntity matter) {
		
		return null;
	}

	@Override
	public MatterEntity selectMatterById(final MatterEntity matter) {
		
		return null;
	}

	@Override
	public List<MatterEntity> getAllMatters() {
		
		return null;
	}

	@Override
	public MatterEntity updateMatter(final MatterEntity matter) {
		
		return null;
	}

	@Override
	public void deleteMatter(final MatterEntity matter) {
		
		
	}
}
