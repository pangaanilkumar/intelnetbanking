package com.inetBankings.genaric.lib;

import java.io.FileInputStream;
import java.util.Properties;

public class Filelib {
	public String readPropData(String path,String key) throws Throwable {
	FileInputStream fis=new FileInputStream(path);
	Properties prop=new Properties();
	prop.load(fis);
	String propValue=prop.getProperty(key,"increct key");
	return propValue;
	
	}
}
