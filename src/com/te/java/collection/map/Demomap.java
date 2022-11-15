package com.te.java.collection.map;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demomap {

	public static void main(String[] args) {
	    HashMap hm=new HashMap();
	    hm.put("z", "dvrbe");
	    hm.put("22", 200);
	    hm.put("zc", "dvrbe");
	    hm.put(88, "dvr");
	    hm.put(322, 3000);
	    hm.put(455, 1000);
	    hm.put(88, "dvrbe");
	    System.out.println(hm);
	    
	    Set <Map.Entry<String,Integer>> entryset=hm.entrySet();
	    for (Map.Entry<String,Integer> entry: entryset) {
	    	
			if (entry.getKey().equals("zc")) {
				entry.setValue(1000);
			}
		}
	    

	}

}
