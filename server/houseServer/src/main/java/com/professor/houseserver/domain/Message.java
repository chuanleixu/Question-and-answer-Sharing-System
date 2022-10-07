package com.professor.houseserver.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("消息实体")
public class Message {

	@TableId(type = IdType.AUTO)
	@ApiModelProperty("主键id")
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
