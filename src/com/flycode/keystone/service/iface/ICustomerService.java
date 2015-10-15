/**
 * 
 */
package com.flycode.keystone.service.iface;

import net.sf.json.JSONObject;

import com.flycode.keystone.entity.customer.message.TextMessage;

/**
 * @author Barrie
 *
 */
public interface ICustomerService {
	public JSONObject sendTextMessage(String accessToken, TextMessage message);
}
