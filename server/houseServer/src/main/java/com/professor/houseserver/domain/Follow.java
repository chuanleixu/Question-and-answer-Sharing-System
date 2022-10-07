package com.professor.houseserver.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 关注类
 * 采用注解方式进行创建数据库
 * @author xzx
 */
@Data
@ApiModel("关注")
public class Follow {
	@TableId(type = IdType.AUTO)
	@ApiModelProperty("主键id")
	private Integer id;
	
	//主体用户ID
	private Integer user_id;
	
	//关注用户ID
	private Integer followed_user_id;



}
