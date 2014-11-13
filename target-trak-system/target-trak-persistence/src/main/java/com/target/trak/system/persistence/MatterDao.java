package com.target.trak.system.persistence;

import java.util.List;

import com.target.trak.system.domain.matters.MatterEntity;
import com.target.trak.system.domain.matters.MatterStatusBreakdown;

public interface MatterDao {

	public MatterEntity insertMatter(final MatterEntity matter);
	
	public MatterEntity selectMatterById(final MatterEntity matter);
	
	public List<MatterEntity> selectAllMatters();
	
	public List<MatterEntity> selectInactiveMatters();
	
	public MatterEntity updateMatter(final MatterEntity matter);
	
	public MatterEntity inactivateMatter(final MatterEntity matter);
	
	public int selectNumberOfActiveMatters();
	
	public List<MatterStatusBreakdown> selectMatterStatusBreakdown();
	
	public List<MatterEntity> selectMattersDueByWeek();
}
