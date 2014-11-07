package com.target.trak.system.persistence;

import java.util.List;

import com.target.trak.system.domain.matters.MatterEntity;

public interface MatterDao {

	public MatterEntity insertMatter(final MatterEntity matter);
	
	public MatterEntity selectMatterById(final MatterEntity matter);
	
	public List<MatterEntity> getAllMatters();
	
	public MatterEntity updateMatter(final MatterEntity matter);
	
	public void deleteMatter(final MatterEntity matter);
}
