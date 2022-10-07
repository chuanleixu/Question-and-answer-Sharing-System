package com.professor.houseserver.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("回答问题实体")
public class Answer {

	@TableId(type = IdType.AUTO)
	@ApiModelProperty("主键id")
	private Integer id;
	
	//回答内容
	private String content;
	
	//回答的点赞数
	private Integer likedCount;
	
	//回答创建时间
	private String createTime;
	
	//回答用户id
	private Long userId;
	
	//回答问题id
	private Long questionId;


}
