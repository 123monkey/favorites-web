package com.favorites.comm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Const {
	
	public static String BASE_PATH;
	
	public static String LOGIN_SESSION_KEY = "Favorites_user";
	
	public static String PASSWORD_KEY = "MHDFxccsdfD23XD";
	
	public static String default_logo=BASE_PATH+"/file/logo.jpg";
	
	public static String userAgent="Mozilla";
	
	public static String default_Profile=BASE_PATH+"/file/logo.jpg";
	
	public static String LAST_REFERER = "LAST_REFERER";

	
	  @Autowired(required = true)
	  public static void setBasePath(@Value("${favorites.base.path}")String basePath) {
		  Const.BASE_PATH = basePath;
	  }
	
	
}
