package com.target.trak.system.persistence;

import java.util.List;

import com.target.trak.system.domain.matters.MatterEntity;

public interface MatterDao {

	public MatterEntity insertMatter(final MatterEntity matter);
	
	public MatterEntity selectMatterById(final MatterEntity matter);
	
	public List<MatterEntity> getAllMatters();
	
	public List<MatterEntity> getInactiveMatters();
	
	public MatterEntity updateMatter(final MatterEntity matter);
	
	public MatterEntity inactivateMatter(final MatterEntity matter);
	
	public int getNumberOfActiveMatters();
}
