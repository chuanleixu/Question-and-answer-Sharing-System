package com.professor.houseserver.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xuchuanlei
 * @since 2022/9/27-13:45
 **/
@Data
@ApiModel("提问问题实体")
public class QuestionQueryVo {

    @ApiModelProperty("提问是否免费")
    private String isFree;
}
