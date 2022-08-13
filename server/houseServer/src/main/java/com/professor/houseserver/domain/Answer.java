package com.professor.houseserver.domain;


/**
 * 回答类
 * 采用注解方式进行创建数据库
 * @author xzx
 */
public class Answer {
	private Integer id;
	
	//回答内容
	private String content;
	
	//回答的点赞数
	private Integer likedCount;
	
	//回答创建时间
	private String createTime;
	
	//关联用户
	private User user;
	
	//关联问题
	private Question question;


}
