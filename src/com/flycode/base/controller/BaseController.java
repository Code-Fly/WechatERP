package com.flycode.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



/**
 * 
 * @author Barrie
 *
 * @param <T>
 */
public abstract class BaseController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public String handleUnexpectedServerError(RuntimeException ex) {
		logger.error("内部错误", ex);
		return "内部错误";
		//return JSONObject.fromObject(MeituanResponse.RESPONSE_600).toString();
	}
}
