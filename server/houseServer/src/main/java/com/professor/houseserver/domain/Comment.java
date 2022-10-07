package com.professor.houseserver.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("评论实体")
public class Comment {

	@TableId(type = IdType.AUTO)
	@ApiModelProperty("主键id")
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
