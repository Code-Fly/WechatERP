/**
 * 
 */
package com.flycode.keystone.event;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.flycode.base.helper.KeystoneUtil;
import com.flycode.keystone.entity.customer.message.Text;
import com.flycode.keystone.entity.customer.message.TextMessage;
import com.flycode.keystone.entity.response.TransferCustomerService;
import com.flycode.keystone.service.impl.CustomerService;
import com.flycode.keystone.service.impl.MessageService;

/**
 * @author Barrie
 *
 */
public class CustomerServiceCloseSessionEvent extends Event {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.flycode.keystone.event.Event#execute(java.util.Map)
	 */
	@Override
	public String execute(HttpServletRequest request, Map<String, String> requestMap) {
		String at = KeystoneUtil.getAccessToken();
		if (null == at) {
			logger.error(KeystoneUtil.getErrmsg());
			return KeystoneUtil.getErrmsg();
		}

		String respXml = null;
		// 发送方帐号
		String fromUserName = requestMap.get("FromUserName");
		// 开发者微信号
		String toUserName = requestMap.get("ToUserName");

		String kfAccount = requestMap.get("KfAccount");

		TransferCustomerService transferMessage = new TransferCustomerService();

		transferMessage.setToUserName(fromUserName);
		transferMessage.setFromUserName(toUserName);
		transferMessage.setCreateTime(new Date().getTime());
		transferMessage.setMsgType(MessageService.RESP_MESSAGE_TYPE_TRANSFER_CUSTOMER_SERVICE);

		// 将消息对象转换成xml
		respXml = MessageService.messageToXml(transferMessage);

		TextMessage message = new TextMessage();
		message.setMsgtype(CustomerService.CUSTOMER_SERVICE_MESSAGE_TYPE_TEXT);
		message.setTouser(fromUserName);
		Text t = new Text();
		StringBuffer buffer = new StringBuffer();
		buffer.append(kfAccount + " 祝您购物愉快。").append("\n");
		t.setContent(buffer.toString());
		message.setText(t);
		new CustomerService().sendTextMessage(at, message);

		return respXml;
	}

}
