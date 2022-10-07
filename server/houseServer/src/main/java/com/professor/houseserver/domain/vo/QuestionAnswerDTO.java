package com.professor.houseserver.domain.vo;

import com.professor.houseserver.domain.Answer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author xuchuanlei
 * @since 2022/10/3-12:09
 **/
@Data
@ApiModel("提问问题实体")
public class QuestionAnswerDTO {

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
    @ApiModelProperty("被提问用户姓名")
    private String quesdUserName;

    @ApiModelProperty("提问用户的id")
    private String quesUserId;

    @ApiModelProperty("提问用户的姓名")
    private String quesUserName;

    @ApiModelProperty("答案")
    private List<Answer> answers;
}
