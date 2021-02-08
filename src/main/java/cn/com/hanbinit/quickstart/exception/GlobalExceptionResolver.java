package cn.com.hanbinit.quickstart.exception;

import cn.com.hanbinit.quickstart.configuration.CommonResponse;
import cn.com.hanbinit.quickstart.configuration.ErrorCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * @author han_bin@outlook.com
 * @Description TODO
 */
@RestControllerAdvice
public class GlobalExceptionResolver {
	private static Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);

    /**
     * 处理运行异常
     */
    @ExceptionHandler(Exception.class)
    public CommonResponse<String> handleException(RuntimeException ex) {
        logger.error("运行时异常", ex);
        return new CommonResponse<>(ErrorCode.FAILED_CODE, "请求异常，请联系客服！");
    }

    /**
     * 处理自定义应用异常
     */
    @ExceptionHandler(ApplicationException.class)
    public CommonResponse<String> handleApplicationException(ApplicationException ex) {
        logger.error(ex.getMessage(), ex);
        return new CommonResponse<>(ErrorCode.FAILED_CODE, ex.getMessage());
    }
}
