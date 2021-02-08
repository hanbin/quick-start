package cn.com.hanbinit.quickstart.configuration;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 公共返回
 * @author han_bin@outlook.com
 * @Description TODO
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel("公共返回类")
@Setter
@Getter
public class CommonResponse<T> {

    @ApiModelProperty("接口状态码")
    private String code;
    @ApiModelProperty("接口返回描述")
    private String message;
    @ApiModelProperty("接口返回数据，一般为JSON格式")
    private T data;

    public CommonResponse(){
        this.code = ErrorCode.SUCCESS_CODE;
        this.message = "操作成功！";
    }

    public CommonResponse(String code, String message){
        this();
        this.code = code;
        this.message = message;
    }

    public CommonResponse(String code, String message, T data){
        this();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public CommonResponse(T data){
        this.code = ErrorCode.SUCCESS_CODE;
        this.message = "操作成功！";
        this.data = data;
    }
}

