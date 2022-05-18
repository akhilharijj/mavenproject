package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader()throws Throwable
	{
		File f=new File("C:\\aaakhilproject\\akhil\\Marvenproject\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		p.load(fis);
	}
	public String getUrl() {
		String url=p.getProperty("url");
		return url;
	}
	public String getUsername() {
		String username=p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password=p.getProperty("password");
		return password;
	}

}
