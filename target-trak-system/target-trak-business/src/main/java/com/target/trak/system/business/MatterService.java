package com.target.trak.system.business;

import com.target.trak.system.business.dto.matter.MatterRequest;
import com.target.trak.system.business.dto.matter.MatterResponse;

public interface MatterService {

	public MatterResponse createMatter(final MatterRequest request);

	public MatterResponse getMatterById(final MatterRequest request);

	public MatterResponse getAllActiveMatters(final MatterRequest request);

	public MatterResponse updateMatter(final MatterRequest request);

	public MatterResponse inactivateMatter(final MatterRequest request);

	public MatterResponse getInactiveMatters(final MatterRequest request);

	public MatterResponse selectNumberOfActiveMatters();

	public MatterResponse getMatterStatusBreakdown();

	public MatterResponse getNumberMattersDueByWeek();

}
