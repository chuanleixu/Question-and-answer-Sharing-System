package com.professor.houseserver.domain.wxresponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author xuchuanlei
 * @since 2022/8/20-14:18
 **/
@Data
@ApiModel("会话密钥结果")
public class Code2Session {

    @ApiModelProperty("用户唯一标识")
    private String openid;
    @ApiModelProperty("会话密钥")
    private String session_key;
    @ApiModelProperty("用户在开放平台的唯一标识符")
    private String unionid;
    @ApiModelProperty("错误码")
    private String errcode;
    @ApiModelProperty("错误信息")
    private String errmsg;

}
