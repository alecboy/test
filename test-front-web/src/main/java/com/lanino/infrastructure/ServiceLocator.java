package com.lanino.infrastructure;

import javax.naming.Context;
import javax.naming.NamingException;

public class ServiceLocator {

	public static Object get(String uri) {
		
		try {
			Context context = new javax.naming.InitialContext();
			return context.lookup(uri);
		} catch (NamingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
