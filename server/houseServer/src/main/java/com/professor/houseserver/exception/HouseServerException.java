package com.professor.houseserver.exception;


import com.professor.houseserver.result.ResultCodeEnum;
import lombok.Data;

/**
 *
 */
@Data
public class HouseServerException extends RuntimeException{
    //状态码
   private Integer code;

    /**
     * 接受状态码和消息
     * @param code
     * @param message
     */
    public HouseServerException(Integer code,String message ) {
        super(message);
        this.code = code;
    }

    /**
     * 接收枚举类型
     * @param resultCodeEnum
     */
    public HouseServerException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }

    @Override
    public String toString() {
        return "HouseServerException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }


}
