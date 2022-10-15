package com.professor.houseserver.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel("用户实体")
public class User {

	@TableId(type = IdType.AUTO)
	@ApiModelProperty("主键id")
	private Integer id;

	private String avatarUrl;

	private Integer isFamous = 0;

	private String username;

	private String simpleDesc ;

	private String openId;

	private Integer account=0;

	private Integer isQuesd;


}
