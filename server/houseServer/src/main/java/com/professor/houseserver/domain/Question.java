package com.professor.houseserver.domain;


/**
 * 提问类
 * 采用注解方式进行创建数据库
 * @author xzx
 */
public class Question {
	private Integer id;
	
	//提问内容
	private String content;
	
	//提问是否免费
	private Integer is_free;
	
	//提问创建时间
	private String createTime;
	
	//提问用户的姓名
	private String quesd_username;

	//关联的提问用户
	private User user;
	

	
}
