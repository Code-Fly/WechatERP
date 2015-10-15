/**
 * 
 */
package com.flycode.base.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flycode.alliance.service.iface.CPAllianceService;
import com.flycode.base.controller.BaseController;

/**
 * @author VM
 *
 */
@Controller
@RequestMapping(value = "/api/select")
public class CommonController extends BaseController {
	
 @Autowired 
 CPAllianceService  cpAllianceService;
 
 @ResponseBody
 @RequestMapping(method = RequestMethod.GET,value = "/cpAlliance")
 public String getCPAlliance(){
	 return JsonUtil.jsonArray2Sting(cpAllianceService.selectByExample(null));
 }	
 
}
