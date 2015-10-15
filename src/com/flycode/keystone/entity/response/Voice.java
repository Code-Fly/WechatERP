/**
 * 
 */
package com.flycode.keystone.entity.response;

import com.flycode.base.entity.BaseEntity;

/**
 * @author Barrie
 *
 */
public class Voice extends BaseEntity{

	private String MediaId;

	/**
	 * @return the mediaId
	 */
	public String getMediaId() {
		return MediaId;
	}

	/**
	 * @param mediaId
	 *            the mediaId to set
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
