/**
 * 
 */
package com.flycode.keystone.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import com.flycode.base.helper.Const;
import com.flycode.base.helper.FileUtil;
import com.flycode.base.helper.HttpClientUtil;
import com.flycode.base.service.BaseService;
import com.flycode.keystone.entity.error.ErrorMsg;
import com.flycode.keystone.entity.product.ProductInfo;
import com.flycode.keystone.entity.product.SkuList;
import com.flycode.keystone.entity.shop.BaseInfo;
import com.flycode.keystone.entity.shop.Business;
import com.flycode.keystone.entity.shop.PhotoUrl;
import com.flycode.keystone.entity.shop.Shop;
import com.flycode.keystone.entity.shop.ShopList;
import com.flycode.keystone.service.iface.ICoreService;
import com.flycode.keystone.service.iface.IShopService;

/**
 * @author Barrie
 *
 */
@Service
public class ShopService extends BaseService implements IShopService {
	@Resource
	ICoreService coreService;

	/**
	 * 
	 */
	public JSONObject getShopList(String accessToken, String begin, String limit) {
		String url = Const.URL_SHOP_GET_LIST.replace("TOKEN", accessToken);
		JSONObject request = new JSONObject();
		request.put("begin", begin);
		request.put("limit", limit);

		JSONObject response = HttpClientUtil.doHttpsRequest(url, "POST", request.toString());

		if (null == response) {
			ErrorMsg errMsg = new ErrorMsg();
			errMsg.setErrcode("-1");
			errMsg.setErrmsg("server is busy");

			return JSONObject.fromObject(errMsg);
		}

		return response;
	}

	public JSONObject getShopList(HttpServletRequest request, String accessToken, String begin, String limit) {
		JSONObject resp = getShopList(accessToken, begin, limit);
		if (resp.containsKey("errcode") && !resp.getString("errcode").equals("0")) {
			logger.error(resp.toString());
			return resp;
		}
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("business_list", Business.class);
		classMap.put("photo_list", PhotoUrl.class);
		ShopList sList = (ShopList) JSONObject.toBean(resp, ShopList.class, classMap);
		List<Business> sBizs = sList.getBusiness_list();
		for (int i = 0; i < sBizs.size(); i++) {
			Business sBiz = sBizs.get(i);
			BaseInfo sInfo = sBiz.getBase_info();
			List<PhotoUrl> imgs = sInfo.getPhoto_list();
			for (int j = 0; j < imgs.size(); j++) {
				PhotoUrl photourl = imgs.get(j);
				String img = Const.getServerUrl(request) + FileUtil.getWeChatImage(photourl.getPhoto_url(), FileUtil.CATEGORY_SHOP, sInfo.getPoi_id() + "-" + j, false);
				photourl.setPhoto_url(img);
				imgs.set(j, photourl);
			}
			sInfo.setPhoto_list(imgs);
			sBiz.setBase_info(sInfo);
			sBizs.set(i, sBiz);
		}

		sList.setBusiness_list(sBizs);
		return JSONObject.fromObject(sList);
	}

	/**
	 * 
	 */
	public JSONObject getShop(String accessToken, String poi_id) {
		String url = Const.URL_SHOP_GET_DETAIL.replace("TOKEN", accessToken);

		JSONObject request = new JSONObject();
		request.put("poi_id", poi_id);

		JSONObject response = HttpClientUtil.doHttpsRequest(url, "POST", request.toString());

		if (null == response) {
			ErrorMsg errMsg = new ErrorMsg();
			errMsg.setErrcode("-1");
			errMsg.setErrmsg("server is busy");

			return JSONObject.fromObject(errMsg);
		}
		return response;
	}

	public JSONObject getShop(HttpServletRequest request, String accessToken, String poi_id) {
		JSONObject resp = getShop(accessToken, poi_id);
		if (resp.containsKey("errcode") && !resp.getString("errcode").equals("0")) {
			logger.error(resp.toString());
			return resp;
		}
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("photo_list", PhotoUrl.class);
		Shop s = (Shop) JSONObject.toBean(resp, Shop.class, classMap);
		Business sBiz = s.getBusiness();
		BaseInfo sInfo = sBiz.getBase_info();
		List<PhotoUrl> imgs = sInfo.getPhoto_list();
		for (int j = 0; j < imgs.size(); j++) {
			PhotoUrl photourl = imgs.get(j);
			String img = Const.getServerUrl(request) + FileUtil.getWeChatImage(photourl.getPhoto_url(), FileUtil.CATEGORY_SHOP, sInfo.getPoi_id() + "-" + j, false);
			photourl.setPhoto_url(img);
			imgs.set(j, photourl);
		}
		sInfo.setPhoto_list(imgs);
		sBiz.setBase_info(sInfo);
		s.setBusiness(sBiz);

		
		return JSONObject.fromObject(s);
	}

}
