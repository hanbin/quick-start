package cn.com.hanbinit.quickstart.controller;

import cn.com.hanbinit.quickstart.configuration.CommonResponse;
import cn.com.hanbinit.quickstart.configuration.ErrorCode;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World演示接口
 * @author han_bin@outlook.com
 * @Description TODO
 */
@Slf4j
@Api("Hello world Controller")
@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public CommonResponse<String> hello(@PathVariable String name){
        log.info("name is: {}", name);
        CommonResponse<String> result = new CommonResponse<>();
        result.setData(name);
        return result;
    }

    @GetMapping("/hello1/{name}")
    public String hello1(@PathVariable String name){
        return name;
    }

    @GetMapping("/hello2/{name}")
    public CommonResponse<String> hello2(@PathVariable String name){
        return new CommonResponse<>(ErrorCode.FAILED_CODE, name);
    }
}
