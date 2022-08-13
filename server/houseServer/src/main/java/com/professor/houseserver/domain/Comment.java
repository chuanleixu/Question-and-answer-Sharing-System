package com.professor.houseserver.domain;


/**
 * 评论类
 * 采用注解方式进行创建数据库
 * @author xzx
 */
public class Comment {
	private Integer id;
	
	//评论内容
	private String content;
	
	//评论创建时间
	private String createTime;
	
	//评论点赞数
	private Integer likeNum=0;
	
	//关联用户
	private User user;
	
	//关联的分享内容
	private Story story;


}
