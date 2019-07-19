package cn.onlov.message;

import lombok.ToString;

@ToString
public enum ResultCode {
    SUCESS(1,"成功"),
    PARAM_IS_INVALID(1000,"参数无效"),
    PARAM_IS_BLANK(10002,"参数为空"),
    PARAM_TYPE_BIND_ERROR(10003,"参数绑定错误"),
    PARAM_NOT_COMPLETE(10004,"参数未编译"),
    USER_IS_BLANK(10005,"用户为空");

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
