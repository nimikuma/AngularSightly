/**
 * 
 */
package com.aem.community.core;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

/**
 * @author nimish
 *
 */
@Component
@Service
public class AngularService implements AngularServiceInterface {

	/* (non-Javadoc)
	 * @see com.aem.community.core.AngularServiceInterface#constructMap()
	 */
	@PostConstruct
	@Override
	public Map<String, String> constructMap() {
		// TODO Auto-generated method stub
		Map<String,String>  map = new HashMap<String, String>();
        map.put("Apple","www.apple.com");
        map.put("Banana","www.banana.com");
		return map;
	}

}
