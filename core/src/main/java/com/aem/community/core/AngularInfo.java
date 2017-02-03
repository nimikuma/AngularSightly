/**
 * 
 */
package com.aem.community.core;

import java.util.Map;

import com.aem.community.core.AngularServiceInterface;
import com.adobe.cq.sightly.WCMUse;

/**
 * @author nimish
 *
 */
public class AngularInfo extends WCMUse {
	
	private Map<String,String> map;

	/* (non-Javadoc)
	 * @see com.adobe.cq.sightly.WCMUse#activate()
	 */
	@Override
	public void activate() throws Exception {
		// TODO Auto-generated method stub
		AngularServiceInterface service = getSlingScriptHelper().getService(AngularServiceInterface.class);
	     map = service.constructMap();

	}
	
	public Map<String,String> getMap() {
		  return map;
		 }

}
