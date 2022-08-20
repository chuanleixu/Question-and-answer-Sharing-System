package com.professor.houseserver.result;

import lombok.Getter;
import lombok.ToString;

/**
 * @author chuanlei.xu
 * @since 2021-12-16
 */
@Getter
@ToString
public enum ResultCodeEnum {

    SUCCESS(true, 200,"成功"),
    UNKNOWN_REASON(false, 20001, "未知错误"),

    BAD_SQL_GRAMMAR(false, 21001, "sql语法错误"),
    JSON_PARSE_ERROR(false, 21002, "json解析异常"),
    PARAM_ERROR(false, 21003, "参数不正确");


    private Boolean success;

    private Integer code;

    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
