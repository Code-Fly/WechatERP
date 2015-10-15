/**
 * 
 */
package com.flycode.alliance.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flycode.alliance.entity.CPAlliance;
import com.flycode.alliance.entity.CPAllianceExample;
import com.flycode.alliance.mapper.CPAllianceMapper;
import com.flycode.alliance.service.iface.CPAllianceService;

/**
 * @author VM
 *
 */
@Service("cpAllianceService")
public class CPAllianceServiceImp implements CPAllianceService {
	
	@Autowired
	CPAllianceMapper cpAllianceMapper;
	

	@Override
	public List<CPAlliance> selectByExample(CPAllianceExample example) {
		return cpAllianceMapper.selectByExample(null);
	}

}
