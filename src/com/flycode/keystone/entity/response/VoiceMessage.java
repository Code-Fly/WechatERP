/**
 * 
 */
package com.flycode.keystone.entity.response;

/**
 * @author Barrie
 *
 */
public class VoiceMessage extends BaseMessage {
	private Voice Voice;

	/**
	 * @return the voice
	 */
	public Voice getVoice() {
		return Voice;
	}

	/**
	 * @param voice
	 *            the voice to set
	 */
	public void setVoice(Voice voice) {
		Voice = voice;
	}

}
