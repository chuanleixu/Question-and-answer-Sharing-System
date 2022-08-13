package com.professor.houseserver.domain;


/**
 * 通知类 
 * 采用注解方式进行创建数据库
 * @author xzx
 */
public class Message {
	private Integer id;
	
	//通知类型
	private Integer type;
	
	//通知信息产生者
	private Integer from_userid;
	
	//通知接受者
	private User user;
	
	//关联的回答ID
	private Integer answer;
	
	//关联的提问ID
	private Integer question;
	
	//通知是否已处理
	private Integer isread = 1;

}
