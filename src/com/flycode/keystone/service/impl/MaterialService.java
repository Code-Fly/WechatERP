/**
 * 
 */
package com.flycode.keystone.service.impl;

import javax.annotation.Resource;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.flycode.base.helper.Const;
import com.flycode.base.helper.HttpClientUtil;
import com.flycode.base.service.BaseService;
import com.flycode.keystone.entity.error.ErrorMsg;
import com.flycode.keystone.service.iface.ICoreService;
import com.flycode.keystone.service.iface.IMaterialService;

/**
 * @author Barrie
 *
 */
@Service
public class MaterialService extends BaseService implements IMaterialService {
	@Resource
	ICoreService coreService;

	public static String MATERIAL_TYPE_IMAGE = "image";
	public static String MATERIAL_TYPE_VIDEO = "video";
	public static String MATERIAL_TYPE_VOICE = "voice";
	public static String MATERIAL_TYPE_NEWS = "news";

	/**
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * 
	 */
	public JSONObject getMaterialList(String accessToken, String type, int offset, int count) {

		String url = Const.URL_MATERIAL_GET_LIST.replace("ACCESS_TOKEN", accessToken);

		JSONObject request = new JSONObject();
		request.put("type", type);
		request.put("offset", offset);
		request.put("count", count);

		JSONObject response = HttpClientUtil.doHttpsRequest(url, "POST", request.toString());

		if (null == response) {
			ErrorMsg errMsg = new ErrorMsg();
			errMsg.setErrcode("-1");
			errMsg.setErrmsg("server is busy");

			return JSONObject.fromObject(errMsg);
		}
		return response;
	}

	/**
	 * 
	 * @param accessToken
	 * @param mediaId
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 */
	public JSONObject getMaterial(String accessToken, String mediaId) {

		String url = Const.URL_MATERIAL_GET_DETAIL.replace("ACCESS_TOKEN", accessToken);

		JSONObject request = new JSONObject();
		request.put("media_id", mediaId);

		JSONObject response = HttpClientUtil.doHttpsRequest(url, "POST", request.toString());

		if (null == response) {
			ErrorMsg errMsg = new ErrorMsg();
			errMsg.setErrcode("-1");
			errMsg.setErrmsg("server is busy");

			return JSONObject.fromObject(errMsg);
		}
		return response;
	}
}
