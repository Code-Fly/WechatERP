/**
 * 
 */
package com.flycode.alliance.service.iface;

import java.util.List;

import com.flycode.alliance.entity.CPAlliance;
import com.flycode.alliance.entity.CPAllianceExample;

/**
 * @author VM
 *
 */
public interface CPAllianceService {
	List<CPAlliance> selectByExample(CPAllianceExample example);
}
