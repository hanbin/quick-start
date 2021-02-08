package cn.com.hanbinit.quickstart.exception;

/**
 * 自定义应用异常
 * @author han_bin@outlook.com
 * @Description TODO
 */
public class ApplicationException extends RuntimeException {
    int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ApplicationException(String message){
        super(message);
        this.code = 500;
    }

    public ApplicationException(Exception e){
        super(e);
        this.code = 500;
    }

    public ApplicationException(int code, Exception e){
        super(e);
        this.code = code;
    }

    public ApplicationException(int code){
        this.code = code;
    }

}
