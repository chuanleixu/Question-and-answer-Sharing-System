package com.professor.houseserver.domain;


import java.util.HashSet;
import java.util.Set;

/**
 * 分享类
 * 采用注解方式进行创建数据库
 * @author xzx
 */
public class Story {
	private Integer id;
	
	//分享信息的标题
	private String title;
	
	//分享信息的内容
	private String content;
	
	//分享的时间
	private String createTime;
	
	//分享类型是否免费
	private Integer is_free = 0;
	
	//围观人数
	private Integer lookNum;
	
	//分享者的头像
	private String user_avatarUrl;
	
	//分享者的姓名
	private String user_username;
	
	//分享信息的评论
	private Set<Comment> comments = new HashSet<>();
	
	//关联用户
}
