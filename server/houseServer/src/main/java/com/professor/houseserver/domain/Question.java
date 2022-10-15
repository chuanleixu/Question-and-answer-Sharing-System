package com.professor.houseserver.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xuchuanlei
 * @since 2022/8/20-14:53
 */
@Data
@TableName("question")
@ApiModel("提问问题实体")
public class Question {

    @TableId(type = IdType.AUTO)
    @ApiModelProperty("主键id")
    private Long id;

    //
    @ApiModelProperty("提问内容")
    private String content;

    //提问是否免费
    @ApiModelProperty("提问是否免费")
    private Integer isFree;

    //提问创建时间
    @ApiModelProperty("提问创建时间")
    private String createTime;

    //被提问用户的姓名
    @ApiModelProperty("被提问用户的id")
    private String quesdUserId;

    //被提问用户的姓名
    @ApiModelProperty("被提问用户的姓名")
    private String quesdUserName;

    @ApiModelProperty("提问用户的id")
    private String quesUserId;

    @ApiModelProperty("提问用户的姓名")
    private String quesUserName;


}
