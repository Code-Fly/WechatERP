/**
 * 
 */
package com.flycode.keystone.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flycode.base.controller.BaseController;
import com.flycode.base.helper.KeystoneUtil;
import com.flycode.keystone.entity.customer.message.CouponMessage;
import com.flycode.keystone.entity.customer.message.WxCard;
import com.flycode.keystone.service.impl.CustomerService;

/**
 * @author Barrie
 *
 */
@Controller
@RequestMapping(value = "/api/keystone")
public class CustomerServiceController extends BaseController {
	@Resource
	CustomerService customerService;

	@RequestMapping(value = "/customerservice/coupon/send")
	@ResponseBody
	public String send(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "touser", required = true) String touser,
			@RequestParam(value = "cardId", required = true) String cardId) {
		String at = KeystoneUtil.getAccessToken();
		if (null == at) {
			logger.error(KeystoneUtil.getErrmsg());
			return KeystoneUtil.getErrmsg();
		}

		CouponMessage message = new CouponMessage();
		message.setMsgtype(CustomerService.CUSTOMER_SERVICE_MESSAGE_TYPE_COUPON);
		message.setTouser(touser);
		WxCard coupon = new WxCard();
		coupon.setCard_id(cardId);
		message.setWxcard(coupon);

		JSONObject resp = customerService.sendCouponMessage(at, message);

		return resp.toString();
	}
}
