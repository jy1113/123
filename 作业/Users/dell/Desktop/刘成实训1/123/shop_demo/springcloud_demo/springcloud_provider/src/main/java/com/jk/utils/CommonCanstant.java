/** 
 * <pre>项目名称:ssm-maven-wdd 
 * 文件名称:CommonCanstant.java 
 * 包名:com.jk.wdd.utils 
 * 创建日期:2018年12月19日下午3:41:29 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

/** 
 * <pre>项目名称：ssm-maven-wdd    
 * 类名称：CommonCanstant    
 * 类描述：    
 * 创建人：wdd   
 * 创建时间：2018年12月19日 下午3:41:29    
 * 修改人：wdd 
 * 修改时间：2018年12月19日 下午3:41:29    
 * 修改备注：       
 * @version </pre>    
 */
public class CommonCanstant {

	/**
	 * 缓存权限树标识
	 */
	public static final String NAV_TREE_CACHE = "navTreeCache";
	/**
	 * 缓存权限详细标识
	 */
	public static final String POWER_URL_CACHE = "Power_Url_Cache";
	/**
	 * 发生短信url
	 * 转换大写：ctrl+shift+x  
	 * 转换小写：ctrl+shift+y
	 */
	public static final String SEND_MSG_URL = "https://api.miaodiyun.com/20150822/industrySMS/sendSMS";
	
	/**
	 * 发送短信ACCOUNT SID
	 */
	public static final String SEND_MSG_ACCOUNT_ID = "fd4615d571714be4a7a1155191586171";
	
	/**
	 * 发送短信token
	 */
	public static final String SEND_MSG_TOKEN = "2ce6e5113b914efb9e37c975ad0f5849";
	
	/**
	 * 缓存验证码
	 */
	public static final String SEND_MSG_VALCODE = "valcode";
	
	/**
	 * 智能机器人
	 */
	public static final String SEND_MSG_ROBOT = "http://api.qingyunke.com/api.php";
}
