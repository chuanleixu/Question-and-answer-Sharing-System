package com.professor.houseserver.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@ApiModel("用户实体")
public class User {

	@TableId(type = IdType.AUTO)
	@ApiModelProperty("主键id")
	private Integer id;
	

	private String username;
	

	private String simpledesc ;

	private String avatarUrl;
	

	private Integer account=0;
	

	private Integer isFamous = 0;
	

	private Integer fans=0;
	
	private Set<Question> questions = new HashSet<>();
	
	private Set<Answer> answers = new HashSet<>();
	
	private Set<Message> messages = new HashSet<>();

	private Set<Story> stories = new HashSet<>();

	private Set<Comment> comments = new HashSet<>();
	

}
