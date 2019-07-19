package cn.onlov.message;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Result implements Serializable {

    private ResultCode resultCode;
    private Object data;

    public Result() {
    }

    public Result(ResultCode resultCode, Object data) {
        this.resultCode = resultCode;
        this.data = data;
    }

    // 无参数的sucess
    public static Result sucess(){
        Result result  = new Result();
        result.setResultCode(ResultCode.SUCESS);
        return result ;
    }

    // 有参数的sucess
    public static Result sucess(Object object){
        Result result  = new Result();
        result.setResultCode(ResultCode.SUCESS);
        result.setData(object);
        return result ;
    }






}
